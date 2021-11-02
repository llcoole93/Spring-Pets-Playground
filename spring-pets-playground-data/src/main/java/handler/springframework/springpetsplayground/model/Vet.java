package handler.springframework.springpetsplayground.model;

import java.util.Set;

/**
 * Created by Evan on 03 / 2021
 */
public class Vet extends Person {

    private Set<Specialty> specialties;

    public Set<Specialty> getSpecialties() { return specialties; }

    public void setSpecialties(Set<Specialty> specialties) { this.specialties = specialties; }
}
