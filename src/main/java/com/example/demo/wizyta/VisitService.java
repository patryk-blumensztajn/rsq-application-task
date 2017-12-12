package com.example.demo.wizyta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VisitService
{

    @Autowired
    private VisitRepository visitRepository;


    public List<Visit> getAllVisits(String patientId)
    {

        List<Visit> visits = new ArrayList<>();
        visitRepository.findByPatientId(patientId).forEach(visits::add);
        return visits;
    }

    public List<Visit> getAllVisitsWithoutPatient()
    {
        List<Visit> visits = new ArrayList<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    public Visit getVisit(String id)
    {


        return   visitRepository.findOne(id);
    }

    public void addVisit(Visit visit)
    {
        visitRepository.save(visit);

    }

    public void updateVisit(Visit visit) {

        visitRepository.save(visit);
    }

    public void deleteVisit(String id)
    {

        visitRepository.delete(id);
    }

}
