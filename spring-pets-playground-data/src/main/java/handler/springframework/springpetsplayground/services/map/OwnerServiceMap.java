package handler.springframework.springpetsplayground.services.map;

import handler.springframework.springpetsplayground.model.Owner;
import handler.springframework.springpetsplayground.model.Pet;
import handler.springframework.springpetsplayground.services.OwnerService;
import handler.springframework.springpetsplayground.services.PetService;
import handler.springframework.springpetsplayground.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Evan on 4/7/2021
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner save(Owner object) {
        if(object != null) {
            if (object.getPets() != null) {
                object.getPets().forEach(pet -> {
                    if (pet.getPetType() == null || pet.getPetType().getId() == null) {
                        pet.setPetType(petTypeService.save(pet.getPetType()));
                    } else {
                        throw new RuntimeException("Pet Type or pet Type ID cannot be null");
                    }

                    if (pet.getId() == null) {
                        Pet savedPet = petService.save(pet);
                    }
                });
            }

            return super.save(object);
        } else {
            return null;
        }
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }


    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
