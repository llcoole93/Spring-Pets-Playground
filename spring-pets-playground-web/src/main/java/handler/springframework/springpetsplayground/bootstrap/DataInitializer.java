package handler.springframework.springpetsplayground.bootstrap;

import handler.springframework.springpetsplayground.model.*;
import handler.springframework.springpetsplayground.services.OwnerService;
import handler.springframework.springpetsplayground.services.PetTypeService;
import handler.springframework.springpetsplayground.services.SpecialtyService;
import handler.springframework.springpetsplayground.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created by Evan on 4/8/2021
 */
@Component
public class DataInitializer implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;

    public DataInitializer(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();

        if (count == 0) {
            loadData();
        }

    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Specialty radiology = new Specialty();
        radiology.setDescription("Radiology");
        Specialty savedRadiology = specialtyService.save(radiology);

        Specialty surgery = new Specialty();
        surgery.setDescription("surgery");
        Specialty savedSurgery = specialtyService.save(surgery);

        Specialty dentistry = new Specialty();
        dentistry.setDescription("dentistry");
        Specialty savedDentistry = specialtyService.save(dentistry);

        System.out.println("loaded specialties...");

        System.out.println("loaded Pet Types...");

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        owner1.setCity("Cincinnati1");
        owner1.setAddress("1 cherry ln");

        Pet michaelsPet = new Pet();
        michaelsPet.setPetType(savedDogPetType);
        michaelsPet.setName("Rufus");
        michaelsPet.setBirthDate(LocalDate.now());
        michaelsPet.setOwner(owner1);
        owner1.getPets().add(michaelsPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Evan");
        owner2.setLastName("Michale");
        owner2.setCity("Cincinnati2");
        owner2.setAddress("2 cherry ln");

        Pet evansPet = new Pet();
        evansPet.setPetType(savedCatPetType);
        evansPet.setName("Mimi");
        evansPet.setBirthDate(LocalDate.now());
        evansPet.setOwner(owner2);
        owner2.getPets().add(evansPet);

        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setFirstName("simpsons");
        owner3.setLastName("dev");
        owner3.setCity("Cincinnati3");
        owner3.setAddress("3 cherry ln");
        Pet simpsonsPet = new Pet();
        simpsonsPet.setPetType(savedDogPetType);
        simpsonsPet.setName("chuck");
        simpsonsPet.setBirthDate(LocalDate.now());
        simpsonsPet.setOwner(owner3);
        owner3.getPets().add(simpsonsPet);

        ownerService.save(owner3);

        System.out.println("Loaded owners......");

        Vet vet1 = new Vet();
        vet1.setFirstName("Prince");
        vet1.setLastName("Goopy");
        vet1.getSpecialties().add(savedDentistry);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Danny");
        vet2.setLastName("Devito");
        vet2.getSpecialties().add(savedRadiology);

        vetService.save(vet2);

        Vet vet3 = new Vet();
        vet3.setFirstName("Ron");
        vet3.setLastName("Johnson");
        vet3.getSpecialties().add(savedSurgery);

        vetService.save(vet3);

        System.out.println("loaded vets.....");
    }
}
