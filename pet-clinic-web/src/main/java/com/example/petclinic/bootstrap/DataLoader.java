package com.example.petclinic.bootstrap;

import com.example.petclinic.model.Owner;
import com.example.petclinic.model.Vet;
import com.example.petclinic.services.OwnerService;
import com.example.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) {
        ownerService.save(new Owner("Michael", "Weston"));
        ownerService.save(new Owner("James", "Bond"));
        System.out.println("Loaded Owners...");

        vetService.save(new Vet("Sam", "Axe"));
        vetService.save(new Vet("Lucy", "Sky"));
        System.out.println("Loaded Vets...");
    }
}
