package no.hvl.dat250.jpa.eclipselink.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Family {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String description;

    @OneToMany(mappedBy = "family")
    private final List<Person> members = new ArrayList<Person>();
}

