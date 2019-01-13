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
        ownerService.save(new Owner(1L, "Michael", "Weston"));
        ownerService.save(new Owner(2L, "James", "Bond"));
        System.out.println("Loaded Owners...");

        vetService.save(new Vet(1L, "Sam", "Axe"));
        vetService.save(new Vet(2L, "Lucy", "Sky"));
        System.out.println("Loaded Vets...");
    }
}
