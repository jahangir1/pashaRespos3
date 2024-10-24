package sa.kafd.ebsaris.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import org.hibernate.annotations.Immutable;

@Entity
@Table(name = "XXKAFD_JOB_INFO_V", schema = "APPS")
@Immutable
@Getter
public class JobInfoView {

    //Need primary Key Column
    @Id
    @Column(name = "ROW_ID", unique = true, nullable = false)
    private Long rowId;

//    @Id
    @Column(name = "POSITION_ID")
    private Long positionId;

    @Column(name = "JOB_TITLE")
    private String jobTitle;

    @Column(name = "JOB_CODE")
    private String jobCode;

    @Column(name = "DEPARTMENT")
    private String department;

    @Column(name = "DIVISION")
    private String division;

    @Column(name = "REPORTING_TOP")
    private String reportingTop;

    @Column(name = "DIRECT_REPORTS")
    private String directReports;
}
