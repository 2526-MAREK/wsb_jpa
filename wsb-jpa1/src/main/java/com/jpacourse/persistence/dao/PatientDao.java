package com.jpacourse.persistence.dao;

import java.util.List;

import com.jpacourse.persistence.entity.PatientEntity;

public interface PatientDao extends Dao<PatientEntity, Long> {
    List<PatientEntity> findByLastName(String lastName);

}

