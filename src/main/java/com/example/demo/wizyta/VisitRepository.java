package com.example.demo.wizyta;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VisitRepository extends CrudRepository<Visit, String>
{
public List<Visit> findByPatientId(String patientId);


}
