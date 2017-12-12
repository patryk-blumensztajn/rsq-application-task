package com.example.demo.pacjent;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient
{
    @Id
    private String id;
    private String name;
    private String surname;
    private String address;

    public Patient()
    {

    }
    public Patient(String id, String name, String surname, String address)
    {
        super();
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public  void setSurname(String surname)
    {
        this.surname = surname;
    }
    public String getAddress()
    {
        return address;
    }

    public  void setAddress(String address)
    {
        this.address = address;
    }
}
