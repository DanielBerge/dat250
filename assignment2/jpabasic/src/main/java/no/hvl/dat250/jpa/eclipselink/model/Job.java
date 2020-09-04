package no.hvl.dat250.jpa.eclipselink.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private double salery;
    private String jobDescr;
}


