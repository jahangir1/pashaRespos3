package sa.kafd.ebsaris.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sa.kafd.ebsaris.model.entities.OrganizationInfoView;


@Repository
public interface OrganizationInfoViewRepository extends JpaRepository<OrganizationInfoView, Long> {

}