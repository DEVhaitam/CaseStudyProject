package charts.controller;


import charts.db.model.Insurance;
import charts.service.InsuranceService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/insurance")
@CrossOrigin(origins = "http://localhost:3000")
public class InsuranceController {

    private final InsuranceService insuranceService;

    @GetMapping("/all")
    List<Insurance> getAll(){
        return insuranceService.all();
    }

    @GetMapping("/totalNumber")
    int getTotalNumber(){
        return insuranceService.all().size();
    }

    @GetMapping("/{id}")
    Insurance findById(@PathVariable(value = "id") Integer id){
        return insuranceService.findById(id);
    }

    @GetMapping("/segments/{segment}")
    int findByCustomersPerSegmentsPerMonth
            (@PathVariable(value= "segment") String segment,
             @RequestParam(value = "month") String month){
            return insuranceService.numberOfCustomersPerSegmentesPerMonth(segment,month);
    }

    
}
