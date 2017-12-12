package com.example.demo.wizyta;

import com.example.demo.pacjent.Patient;



import javax.persistence.*;
import javax.persistence.Entity;

@Entity
public class Visit
{
    @Id
    private String id;
    private String date;
    private String hour;
    private String place;
    private String withWho;
    @OneToOne
    private Patient patient;

    public Visit()
    {

    }
    public Visit(String id, String date, String hour, String patientId)
    {
        super();
        this.id = id;
        this.date = date;
        this.hour = hour;
        this.place = place;
        this.withWho = withWho;
        this.patient = new Patient(patientId,"","","");
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public String getHour()
    {
        return hour;
    }

    public  void setHour(String hour)
    {
        this.hour = hour;
    }
    public String getPlace()
    {
        return place;
    }

    public  void setPlace(String place)
    {
        this.place = place;
    }
    public String getWithWho()
    {
        return withWho;
    }

    public  void setWithWho(String withWho)
    {
        this.withWho = withWho;
    }

    public void setPatient(Patient patient)
    {
        this.patient = patient;
    }
    public Patient getPatient()
    {
        return patient;
    }
}
