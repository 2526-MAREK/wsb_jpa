-- Wstawianie danych do tabeli Address
INSERT INTO address (id, city, address_line1, address_line2, postal_code)
VALUES 
(1, 'Warsaw', 'Main Street 10', NULL, '00-001'),
(2, 'Cracow', 'High Street 20', NULL, '30-002');

-- Wstawianie danych do tabeli Doctor
INSERT INTO doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization, address_id)
VALUES 
(1, 'Jan', 'Kowalski', '123456789', 'jan.kowalski@example.com', 'DOC001', 'CARDIOLOGIST', 1),
(2, 'Anna', 'Nowak', '987654321', 'anna.nowak@example.com', 'DOC002', 'NEUROLOGIST', 2);

-- Wstawianie danych do tabeli Patient
INSERT INTO patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth, address_id, is_insured) 
VALUES 
(1, 'Marek', 'Zieliński', '111222333', 'marek.zielinski@example.com', 'PAT001', '1985-05-15', 1, true),
(2, 'Ewa', 'Wiśniewska', '444555666', 'ewa.wisniewska@example.com', 'PAT002', '1990-07-20', 2, false);

-- Wstawianie danych do tabeli MedicalTreatment
INSERT INTO medical_treatment (id, description, type)
VALUES 
(1, 'Blood Pressure Monitoring', 'DIAGNOSTIC'),
(2, 'MRI Scan', 'DIAGNOSTIC');

-- Wstawianie danych do tabeli Visit
INSERT INTO visit (id, description, time, doctor_id, patient_id)
VALUES 
(1, 'Regular Checkup', '2024-11-30T10:00:00', 1, 1),
(2, 'Neurological Exam', '2024-12-01T15:00:00', 2, 2);

-- Wstawianie danych do tabeli pośredniej visit_treatment
INSERT INTO visit_treatment (visit_id, treatment_id)
VALUES 
(1, 1),
(2, 2);
