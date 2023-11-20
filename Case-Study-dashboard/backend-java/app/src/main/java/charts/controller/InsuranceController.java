package charts.controller;


import charts.db.model.Insurance;
import charts.service.InsuranceService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/insurance")
public class InsuranceController {

    private final InsuranceService insuranceService;

    @GetMapping("/all")
    List<Insurance> getAll(){
        return insuranceService.all();
    }

    @GetMapping("/{id}")
    Insurance findById(@PathVariable(value = "id") Integer id){
        return insuranceService.findById(id);
    }

}
