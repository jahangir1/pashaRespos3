package sa.kafd.ebsaris.model.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import org.hibernate.annotations.Immutable;

import java.time.LocalDateTime;


@Entity
@Table(name = "XXKAFD_EMPLOYEE_INFO_V", schema="APPS")
@Immutable
@Getter
public class EmployeeInfoView {


    @Id
    @Column(name = "PERSON_ID")
    private Long personId;

    @Column(name = "EMPLOYEE_NAME")
    private String employeeName;

    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;

    @Column(name = "JOB_TITLE")
    private String jobTitle;

    @Column(name = "UNIT")
    private String unit;

    @Column(name = "DEPARTMENT")
    private String department;

    @Column(name = "DIVISION")
    private String division;

    @Column(name = "REPORTING_TO")
    private String reportingTo;


}
