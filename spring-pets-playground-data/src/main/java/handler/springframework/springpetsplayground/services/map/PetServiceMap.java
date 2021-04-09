package handler.springframework.springpetsplayground.services.map;

import handler.springframework.springpetsplayground.model.Pet;
import handler.springframework.springpetsplayground.services.PetService;

import java.util.Set;

/**
 * Created by Evan on 4/7/2021
 */

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
