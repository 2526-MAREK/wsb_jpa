package com.jpacourse.mapper;

import com.jpacourse.dto.PatientTO;
import com.jpacourse.persistence.entity.PatientEntity;
import com.jpacourse.persistence.entity.VisitEntity;
import com.jpacourse.dto.VisitTO;
import java.util.stream.Collectors;

public final class PatientMapper {

    public static PatientTO mapToTO(final PatientEntity patientEntity) {
        if (patientEntity == null) {
            return null;
        }
        PatientTO patientTO = new PatientTO();
        patientTO.setId(patientEntity.getId());
        patientTO.setFirstName(patientEntity.getFirstName());
        patientTO.setLastName(patientEntity.getLastName());
        patientTO.setDateOfBirth(patientEntity.getDateOfBirth());
        patientTO.setIsInsured(patientEntity.isInsured());
        patientTO.setVisits(patientEntity.getVisits().stream()
                .map(PatientMapper::mapVisitToTO)
                .collect(Collectors.toList()));
        return patientTO;
    }

    private static VisitTO mapVisitToTO(final VisitEntity visitEntity) {
        VisitTO visitTO = new VisitTO();
        visitTO.setTime(visitEntity.getTime());
        visitTO.setDoctorName(visitEntity.getDoctor().getFirstName() + " " + visitEntity.getDoctor().getLastName());
        visitTO.setTreatments(visitEntity.getTreatments().stream()
                .map(treatment -> treatment.getDescription())
                .collect(Collectors.toList()));
        return visitTO;
    }
}
