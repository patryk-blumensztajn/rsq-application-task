package com.example.demo.pacjent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController
{
    @Autowired
    private PatientService patientService;

    @RequestMapping("/patients")
    public List<Patient> getAllPatients()
    {
        return patientService.getAllPatients();
    }

    @RequestMapping("/patients/{id}")
    public Patient getPatient(@PathVariable String id)
    {
        return patientService.getPatient(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/patients")
    public void addPatient(@RequestBody Patient patient)
    {
        patientService.addPatient(patient);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/patients/{id}")
    public void updatePatient(@RequestBody Patient patient, @PathVariable String id)
    {
        patientService.updatePatient(id, patient);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/patients/{id}")
    public void deletePatient(@PathVariable String id)
    {
       patientService.deletePatient(id);
    }


}
