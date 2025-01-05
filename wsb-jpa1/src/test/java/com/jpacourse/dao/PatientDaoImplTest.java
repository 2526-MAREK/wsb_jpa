package com.jpacourse.dao;

import com.jpacourse.persistence.dao.impl.PatientDaoImpl;
import com.jpacourse.persistence.entity.PatientEntity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PatientDaoImplTest {

    @Autowired
    private PatientDaoImpl patientDao;

    @Test
void testFindByLastName() {
    // Wykonanie metody findByLastName
    List<PatientEntity> patients = patientDao.findByLastName("Doe");

    // Weryfikacja wyników
    assertEquals(1, patients.size());
    assertEquals("John", patients.get(0).getFirstName());
}
}
