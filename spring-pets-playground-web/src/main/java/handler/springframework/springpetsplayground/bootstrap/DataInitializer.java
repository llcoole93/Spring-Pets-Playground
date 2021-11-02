package handler.springframework.springpetsplayground.bootstrap;

import handler.springframework.springpetsplayground.model.Owner;
import handler.springframework.springpetsplayground.model.PetType;
import handler.springframework.springpetsplayground.model.Vet;
import handler.springframework.springpetsplayground.services.OwnerService;
import handler.springframework.springpetsplayground.services.PetTypeService;
import handler.springframework.springpetsplayground.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Evan on 4/8/2021
 */
@Component
public class DataInitializer implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataInitializer(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("cat");
        PetType savedCatPetType = petTypeService.save(cat);

        System.out.println("loaded Pet Types");

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Evan");
        owner2.setLastName("Michale");

        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setFirstName("simpsons");
        owner3.setLastName("dev");

        ownerService.save(owner3);

        System.out.println("Loaded owners......");

        Vet vet1 = new Vet();
        vet1.setFirstName("Prince");
        vet1.setLastName("Goopy");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Danny");
        vet2.setLastName("Devito");

        vetService.save(vet2);

        Vet vet3 = new Vet();
        vet3.setFirstName("Ron");
        vet3.setLastName("Johnson");

        vetService.save(vet3);

        System.out.println("loaded vets.....");

    }
}
