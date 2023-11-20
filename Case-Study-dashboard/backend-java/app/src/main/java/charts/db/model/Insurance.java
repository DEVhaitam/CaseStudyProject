package charts.db.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table
public class Insurance {


    @Id
    private Integer policyId;
    private String dateOfPurchase;
    private Integer customerId;
    private String fuel;
    private String vehicleSegment;
    private Integer premium;
    private Integer bodilyInjuryLiability;
    private Integer personalInjuryProtection;
    private Integer propertyDamageLiability;
    private Integer collision;
    private Integer comprehensive;
    private String customerGender;
    private String customerIncomeGroup;
    private String customerRegion;
    private Integer customerMartialStatus;
}
