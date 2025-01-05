DELETE FROM visit_treatment;
DELETE FROM visit;
DELETE FROM medical_treatment;
DELETE FROM patient;
DELETE FROM doctor;
DELETE FROM address;



INSERT INTO address ( id, city, address_line1, address_line2, postal_code)
VALUES 
(1, 'Warsaw', 'Main Street 10', NULL, '00-001'),
(2, 'Cracow', 'High Street 20', NULL, '30-002');

INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id)
VALUES 
(1, 'Jan', 'Kowalski', '123456789', 'jan.kowalski@example.com', 'DOC001', 'CARDIOLOGIST', 1),
(2, 'Anna', 'Nowak', '987654321', 'anna.nowak@example.com', 'DOC002', 'PEDIATRICIAN', 2);


INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id, is_insured) 
VALUES 
(1, 'Marek', 'Zielinski', '111222333', 'marek.zielinski@example.com', 'PAT001', '1985-05-15', 1, true),
(2, 'John', 'Doe', '123456789', 'john.doe@example.com', 'P001', '1990-01-01', 2, true);






INSERT INTO visit (id, description, time, doctor_id, patient_id)
VALUES 
(1, 'Regular Checkup', '2024-11-30T10:00:00', 1, 1),
(2, 'Follow-up', '2024-12-01T12:00:00', 1, 1);


INSERT INTO medical_treatment (id, description, type)
VALUES 
(1, 'Blood Pressure Monitoring', 'DIAGNOSTIC');

INSERT INTO visit_treatment (visit_id, treatment_id)
VALUES 
(1, 1);
