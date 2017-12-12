package com.example.demo.wizyta;

import java.util.List;

import com.example.demo.pacjent.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class VisitController
{
    @Autowired
    private VisitService visitService;

    @RequestMapping("/patients/{id}/visits")
    public List<Visit> getAllVisits(@PathVariable String id)
    {
        return visitService.getAllVisits(id);
    }

    @RequestMapping("/visits")
    public List<Visit> getAllVisitsWithoutPatient()
    {
        return visitService.getAllVisitsWithoutPatient();
    }



    @RequestMapping("/patients/{patientId}/visits/{id}")
    public Visit getVisit(@PathVariable String id)
    {
        return visitService.getVisit(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/patients/{patientId}/visits")
    public void addVisit(@RequestBody Visit visit, @PathVariable String patientId)
    {
        visit.setPatient(new Patient(patientId,"","",""));
        visitService.addVisit(visit);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/patients/{patientId}/visits/{id}")
    public void updateVisit(@RequestBody Visit visit, @PathVariable String patientId, @PathVariable String id)
    {
        visit.setPatient(new Patient(patientId,"","",""));
        visitService.updateVisit(visit);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/patients/{patientId}/visits/{id}")
    public void deleteVisit(@PathVariable String id)
    {
        visitService.deleteVisit(id);
    }


}
