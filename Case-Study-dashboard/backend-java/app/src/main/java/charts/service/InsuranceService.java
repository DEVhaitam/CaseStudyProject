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

}
