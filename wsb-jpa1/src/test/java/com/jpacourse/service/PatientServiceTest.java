package com.jpacourse.service;

import com.jpacourse.dto.PatientTO;
import com.jpacourse.persistence.dao.PatientDao;
import com.jpacourse.persistence.entity.PatientEntity;
import com.jpacourse.service.impl.PatientServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private PatientService patientService;

    @Autowired
    private PatientDao patientDao;

    @Transactional
    @Test
    public void testShouldDeletePatientAndCascadingVisits() {
        // given
        PatientEntity patientEntity = patientDao.findOne(1L);
        assertThat(patientEntity).isNotNull();
        assertThat(patientEntity.getVisits()).isNotEmpty();
        long visitCountBefore = patientEntity.getVisits().size();

        // when
        patientDao.delete(1L);

        // then
        assertThat(patientDao.findOne(1L)).isNull();
        assertThat(visitCountBefore).isGreaterThan(0);
    }

    @Test
    public void testShouldNotDeleteDoctors() {
        // given
        long doctorCountBefore = patientDao.count();

        // when
        patientDao.delete(1L);

        // then
        long doctorCountAfter = patientDao.count();
        assertThat(doctorCountAfter).isEqualTo(doctorCountBefore);
    }

    @Transactional
    @Test
    public void testShouldFetchPatientById() {
        // given
        long patientId = 1L;

        // when
        PatientTO patientTO = patientService.findById(patientId);

        // then
        assertThat(patientTO).isNotNull();
        assertThat(patientTO.getFirstName()).isEqualTo("Marek");
        assertThat(patientTO.getVisits()).isNotEmpty();
        assertThat(patientTO.getVisits().get(0).getDoctorName()).isEqualTo("Jan Kowalski");
        assertThat(patientTO.isInsured()).isTrue();
    }
}
