package com.jpacourse.persistence.dao.impl;

import com.jpacourse.persistence.dao.AddressDao;
import com.jpacourse.persistence.dao.PatientDao;
import com.jpacourse.persistence.entity.AddressEntity;
import com.jpacourse.persistence.entity.PatientEntity;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class PatientDaoImpl extends AbstractDao<PatientEntity, Long> implements PatientDao
{
    @Override
public List<PatientEntity> findByLastName(String lastName) {
    return entityManager.createQuery("SELECT p FROM PatientEntity p WHERE p.lastName = :lastName", PatientEntity.class)
                        .setParameter("lastName", lastName)
                        .getResultList();
}

@Override
public List<PatientEntity> findPatientsWithMoreThanXVisits(int visitCount) {
    return entityManager.createQuery(
            "SELECT p FROM PatientEntity p WHERE SIZE(p.visits) > :visitCount", 
            PatientEntity.class)
            .setParameter("visitCount", visitCount)
            .getResultList();
}



}
