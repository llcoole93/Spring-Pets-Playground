package services;

import handler.springframework.springpetsplayground.model.Pet;

import java.util.Set;

/**
 * Created by Evan on 04 / 2021
 */
public interface PetService {

    Pet findById(Long Id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
