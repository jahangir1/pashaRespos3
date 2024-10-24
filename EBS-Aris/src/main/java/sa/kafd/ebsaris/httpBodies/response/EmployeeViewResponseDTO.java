package sa.kafd.ebsaris.httpBodies.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmployeeViewResponseDTO {

    @JsonIgnore
    private Long personId;
//    @JsonProperty("fullName")
    private String employeeName;
//    @JsonProperty("e-mailAddress")
    private String emailAddress;
    private String jobTitle;
    private String unit;
    private String department;
    private String division;
    private String reportingTo;
//    private String departmentName;
//    private Integer supervisorId;
//    private String supervisorName;
//    private String supervisorEmail;
//    @JsonFormat(pattern = "yyyy-MMM-dd")
//    private LocalDateTime joiningDate;
//    @JsonFormat(pattern = "yyyy-MMM-dd")
//    private LocalDateTime lastWorkingDate;
}
