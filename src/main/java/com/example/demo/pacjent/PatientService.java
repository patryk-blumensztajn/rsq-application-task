package com.example.demo.pacjent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService
{

    @Autowired
    private PatientRepository patientRepository;


    public List<Patient> getAllPatients()
    {

        List<Patient> patients = new ArrayList<>();
        patientRepository.findAll()
        .forEach(patients::add);
        return patients;
    }

    public Patient getPatient(String id)
    {

      return   patientRepository.findOne(id);
    }

    public void addPatient(Patient patient)
    {
        patientRepository.save(patient);

    }

    public void updatePatient(String id, Patient patient)
    {

        patientRepository.save(patient);
    }

    public void deletePatient(String id)
    {
        patientRepository.delete(id);
    }

}
