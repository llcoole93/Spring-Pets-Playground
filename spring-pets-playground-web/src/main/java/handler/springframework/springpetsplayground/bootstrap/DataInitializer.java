package handler.springframework.springpetsplayground.bootstrap;

import handler.springframework.springpetsplayground.model.Owner;
import handler.springframework.springpetsplayground.model.Vet;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import services.OwnerService;
import services.VetService;
import services.map.OwnerServiceMap;
import services.map.VetServiceMap;

/**
 * Created by Evan on 4/8/2021
 */
@Component
public class DataInitializer implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataInitializer() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");
        
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner1.setFirstName("Evan");
        owner1.setLastName("Michale");
        
        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setId(3L);
        owner1.setFirstName("simpsons");
        owner1.setLastName("dev");
        
        ownerService.save(owner3);

        System.out.println("Loaded owners......");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Prince");
        vet1.setLastName("Goopy");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Danny");
        vet2.setLastName("Devito");

        vetService.save(vet2);

        Vet vet3 = new Vet();
        vet3.setId(3L);
        vet3.setFirstName("Ron");
        vet3.setLastName("Johnson");

        vetService.save(vet3);

        System.out.println("loaded vets.....");

    }
}
