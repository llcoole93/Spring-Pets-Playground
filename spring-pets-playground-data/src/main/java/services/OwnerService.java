package services;

import handler.springframework.springpetsplayground.model.Owner;

import java.util.Set;

/**
 * Created by Evan on 04 / 2021
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long Id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
