package handler.springframework.springpetsplayground.model;

import java.time.LocalDate;

/**
 * Created by Evan on 03 / 2021
 */
public class Pet {

    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }
}
