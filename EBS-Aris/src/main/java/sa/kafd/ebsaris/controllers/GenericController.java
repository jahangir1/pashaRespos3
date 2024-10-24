package sa.kafd.ebsaris.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sa.kafd.ebsaris.httpBodies.response.EmployeeViewResponseDTO;
import sa.kafd.ebsaris.httpBodies.response.JobInfoViewResponseDTO;
import sa.kafd.ebsaris.httpBodies.response.OrganizationInfoViewResponseDTO;
import sa.kafd.ebsaris.services.GenericService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/ebsAris/api/v1")
@Tag(name = "KAFD EBS APIs", description = "APIs to transfer data from EBS to ARIS")
public class GenericController {

    @Autowired
    GenericService genericService;

    private static final Logger log = LoggerFactory.getLogger(GenericController.class);

    @Operation(summary = "Get All Employees from EBS")
    @ApiResponse(responseCode = "200", description = "Ok")
    @GetMapping("/getAllEmployees")
    private List<EmployeeViewResponseDTO> getEmployees() {
        log.info("Calling getEmployees");
        List<EmployeeViewResponseDTO> responseDTO = new ArrayList<>();
        try {
            responseDTO = genericService.getEmployees();
            return responseDTO;
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new RuntimeException("Exception occurred in controller");
        }
    }

    @Operation(summary = "Get All Jobs from EBS")
    @ApiResponse(responseCode = "200", description = "Ok")
    @GetMapping("/getAllJobPositions")
    private List<JobInfoViewResponseDTO> getAllJobPositions() {
        log.info("Calling getEmployees");
        List<JobInfoViewResponseDTO> responseDTO = new ArrayList<>();
        try {
            responseDTO = genericService.getAllJobPositions();
            return responseDTO;
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new RuntimeException("Exception occurred in controller");
        }
    }

    @Operation(summary = "Get organization structure from EBS")
    @ApiResponse(responseCode = "200", description = "Ok")
    @GetMapping("/getOrganizationStructure")
    private List<OrganizationInfoViewResponseDTO> getOrganizationStructure() {
        log.info("Calling getOrganizationStructure");
        List<OrganizationInfoViewResponseDTO> responseDTO = new ArrayList<>();
        try {
            responseDTO = genericService.getOrganizationStructure();
            return responseDTO;
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new RuntimeException("Exception occurred in controller");
        }
    }


}
