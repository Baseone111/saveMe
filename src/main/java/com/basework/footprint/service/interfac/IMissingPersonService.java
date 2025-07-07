package com.basework.footprint.service.interfac;

import com.basework.footprint.dto.MissingPersonDto;
import com.basework.footprint.dto.Response;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.util.List;

public interface IMissingPersonService {
    Response submitMissingPerson(String fullName, Integer age, MultipartFile file, String location, LocalDate lastSeenDate,String description, String relationship);
    List<String> getAllRelationships();
    List<String> getAllLocations();

    Response getAllMissingPersons();
    Response deleteMissingPerson(String missingPersonId);

    Response updateMissingPerson(String fullName, Integer age, MultipartFile file, String location, LocalDate lastSeenDate,String description, String relationship);
    Response getMissingPersonById(String missingPersonId);
    Response getMissingPersonByAge(Integer age);

    Response getRecentMissingPersons(int limit);
    Response getMissingPersonByRelationshipAndDateRange(String relationship, LocalDate startDate, LocalDate endDate);
}
