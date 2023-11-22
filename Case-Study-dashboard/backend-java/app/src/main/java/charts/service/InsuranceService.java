package charts.service;

import charts.db.model.Insurance;
import charts.db.repository.InsuranceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class InsuranceService {

    private final InsuranceRepository insuranceRepository;

    public List<Insurance> all(){
        return insuranceRepository.findAll();
    }

    public Insurance findById(Integer id){
        return insuranceRepository.findById(id).get();
    }

    public int numberOfCustomersPerSegmentesPerMonth(String segment, String month){
        List<Insurance> insurances = insuranceRepository.findByVehicleSegment(segment);
        int n=0;
        for (int i=0;i<insurances.size();i++){
            String insuranceMonth = insurances.get(i).getDateOfPurchase();
            if(insuranceMonth.contains(month)) n++;
        }
        return n;
    }
}
