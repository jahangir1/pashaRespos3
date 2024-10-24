package sa.kafd.ebsaris.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sa.kafd.ebsaris.model.entities.JobInfoView;

import java.util.List;

@Repository
public interface JobInfoViewRepository extends JpaRepository<JobInfoView, Long> {

    List<JobInfoView> findAllByJobCodeEquals(String jobCode);
}
