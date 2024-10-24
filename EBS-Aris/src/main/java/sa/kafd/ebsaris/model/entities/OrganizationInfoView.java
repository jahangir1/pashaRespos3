package sa.kafd.ebsaris.model.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import org.hibernate.annotations.Immutable;


@Entity
@Table(name = "XXKAFD_ORG_STRUCTURE_V", schema="APPS")
@Immutable
@Getter
public class OrganizationInfoView {
    @Id
    @Column(name = "ORGANIZATION_ID")
    private Long organizationId;

    @Column(name = "DIVISION_NAME")
    private String divisionName;

    @Column(name = "DIVISION_CHIEF_NAME")
    private String divisionChiefName;

    @Column(name = "DIVISION_CHIEF_POSITION")
    private String divisionChiefPosition;

    @Column(name = "GENERAL_DEPARTMENT")
    private String generalDepartment;

//    @Column(name = "GENERAL_CHIEF_NAME")
//    private String generalChiefName;

    @Column(name = "GENERAL_HEAD_NAME")
    private String generalHeadName;

//    @Column(name = "GENERAL_CHIEF_POSITION")
//    private String generalChiefPosition;

    @Column(name = "GENERAL_HEAD_POSITION")
    private String generalHeadPosition;

    @Column(name = "DEPARTMENT")
    private String department;

//    @Column(name = "DEPARTMENT_CHIEF_NAME")
//    private String departmentChiefName;

    @Column(name = "DEPARTMENT_HEAD_NAME")
    private String departmentHeadName;

//    @Column(name = "DEPARTMENT_CHIEF_POSITION")
//    private String departmentChiefPosition;

    @Column(name = "DEPARTMENT_HEAD_POSITION")
    private String departmentHeadPosition;

    @Column(name = "SECTION")
    private String section;

//    @Column(name = "SECTION_CHIEF_NAME")
//    private String sectionChiefName;

    @Column(name = "SECTION_HEAD_NAME")
    private String sectionHeadName;

    @Column(name = "SECTION_HEAD_POSITION")
    private String sectionHeadPosition;

    @Column(name = "TYPE")
    private String type;
}
