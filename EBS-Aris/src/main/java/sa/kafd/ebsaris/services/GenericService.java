package sa.kafd.ebsaris.services;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sa.kafd.ebsaris.httpBodies.response.EmployeeViewResponseDTO;
import sa.kafd.ebsaris.httpBodies.response.JobInfoViewResponseDTO;
import sa.kafd.ebsaris.httpBodies.response.OrganizationInfoViewResponseDTO;
import sa.kafd.ebsaris.model.entities.EmployeeInfoView;
import sa.kafd.ebsaris.model.entities.JobInfoView;
import sa.kafd.ebsaris.model.entities.OrganizationInfoView;
import sa.kafd.ebsaris.model.repositories.EmployeeInfoViewRepository;
import sa.kafd.ebsaris.model.repositories.JobInfoViewRepository;
import sa.kafd.ebsaris.model.repositories.OrganizationInfoViewRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GenericService {

    @Autowired
    EmployeeInfoViewRepository employeeInfoViewRepository;

    @Autowired
    JobInfoViewRepository jobInfoViewRepository;

    @Autowired
    OrganizationInfoViewRepository organizationRepository;

    ModelMapper modelMapper = new ModelMapper();

    private static final Logger log = LoggerFactory.getLogger(GenericService.class);

    public List<EmployeeViewResponseDTO> getEmployees() {
        log.info("Inside getEmployees Service Method");
        try {
            List<EmployeeViewResponseDTO> employeeViewDTO = new ArrayList<>();
            List<EmployeeInfoView> allEmployees = employeeInfoViewRepository.findAll();
            System.out.println("size >> " + allEmployees.size());
            if(!allEmployees.isEmpty()){
                employeeViewDTO  = allEmployees.stream().map(employeeView -> modelMapper.map(employeeView, EmployeeViewResponseDTO.class)).collect(Collectors.toList());
            }
            return  employeeViewDTO;
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new RuntimeException("Excpetion in getEmployees service method");
        }
    }


    public List<JobInfoViewResponseDTO> getAllJobPositions() {
        log.info("Inside getAllJobPositions Service Method");
        try {
            List<JobInfoViewResponseDTO> jobsViewDTO = new ArrayList<>();
            List<JobInfoView> allJobsPosition = jobInfoViewRepository.findAll();
            System.out.println("size >> " + allJobsPosition.size());
            if (!allJobsPosition.isEmpty()) {
                jobsViewDTO = allJobsPosition.stream().map(jobPositions -> modelMapper.map(jobPositions, JobInfoViewResponseDTO.class)).collect(Collectors.toList());
            }
            return jobsViewDTO;
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new RuntimeException("Excpetion in getAllJobPositions service method");
        }
    }

    public List<OrganizationInfoViewResponseDTO> getOrganizationStructure() {
        log.info("Inside getAllJobPositions Service Method");
        try {
            List<OrganizationInfoViewResponseDTO> organizationResponseDTO = new ArrayList<>();
            List<OrganizationInfoView> organizationStructure = organizationRepository.findAll();
            System.out.println("size >> " + organizationStructure.size());
            if (!organizationStructure.isEmpty()) {
                organizationResponseDTO = organizationStructure.stream().map(orgStructure -> modelMapper.map(orgStructure, OrganizationInfoViewResponseDTO.class)).collect(Collectors.toList());
            }
            return organizationResponseDTO;
        } catch (Exception e) {
            log.error(e.getMessage());
            throw new RuntimeException("Excpetion in getOrganizationStructure service method");
        }
    }
}
