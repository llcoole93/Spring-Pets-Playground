package services;

import handler.springframework.springpetsplayground.model.Vet;

import java.util.Set;

/**
 * Created by Evan on 04 / 2021
 */
public interface VetService {

    Vet findById(Long Id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
