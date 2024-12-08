package com.jpacourse.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class VisitTO implements Serializable {
    private LocalDateTime time;
    private String doctorName;
    private List<String> treatments;
    public LocalDateTime getTime() {
        return time;
    }
    public void setTime(LocalDateTime time) {
        this.time = time;
    }
    public String getDoctorName() {
        return doctorName;
    }
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    public List<String> getTreatments() {
        return treatments;
    }
    public void setTreatments(List<String> treatments) {
        this.treatments = treatments;
    }

    // Gettery i settery
}
