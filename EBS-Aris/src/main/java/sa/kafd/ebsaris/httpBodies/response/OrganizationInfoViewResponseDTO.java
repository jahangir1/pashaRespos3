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
public class OrganizationInfoViewResponseDTO {

    @JsonIgnore
    private Long organizationId;

    private String divisionName;

    private String divisionChiefName;

    private String divisionChiefPosition;

    private String generalDepartment;

    private String generalHeadName;

    private String generalHeadPosition;

    private String department;

    private String departmentHeadName;

    private String departmentHeadPosition;

    private String section;

    private String sectionHeadName;

    private String sectionHeadPosition;

    private String type;

}
