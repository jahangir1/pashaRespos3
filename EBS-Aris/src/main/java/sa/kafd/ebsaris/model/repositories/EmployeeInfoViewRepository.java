package sa.kafd.ebsaris.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sa.kafd.ebsaris.model.entities.EmployeeInfoView;

@Repository
public interface EmployeeInfoViewRepository extends JpaRepository<EmployeeInfoView, Long> {

}