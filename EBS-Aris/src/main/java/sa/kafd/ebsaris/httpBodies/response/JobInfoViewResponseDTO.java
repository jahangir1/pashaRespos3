package sa.kafd.ebsaris.httpBodies.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class JobInfoViewResponseDTO {

    @JsonIgnore
    private Long positionId;
    private String jobTitle;
    private String jobCode;
    private String department;
    private String division;
    private String reportingTop;
    private String directReports;

}
