package com.basework.footprint.service.interfac;

import com.basework.footprint.dto.Response;
import com.basework.footprint.entity.IncidentReport;
import org.springframework.web.multipart.MultipartFile;

public interface IIncidentService {
    Response saveIncidentReport(IncidentReport report, MultipartFile file);
    Response getAllIncidents();
    Response getIncidentById(String id);
}