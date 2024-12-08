package com.jpacourse.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class PatientTO implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private boolean isInsured;
    private List<VisitTO> visits;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public boolean isInsured() {
        return isInsured;
    }
    public void setIsInsured(boolean isInsured) {
        this.isInsured = isInsured;
    }
    public List<VisitTO> getVisits() {
        return visits;
    }
    public void setVisits(List<VisitTO> visits) {
        this.visits = visits;
    }

  
}
