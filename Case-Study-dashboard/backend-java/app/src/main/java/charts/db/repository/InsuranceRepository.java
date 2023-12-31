package charts.db.repository;

import charts.db.model.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance,Integer> {
    List<Insurance> findByVehicleSegment(String vehicleSegment);
}
