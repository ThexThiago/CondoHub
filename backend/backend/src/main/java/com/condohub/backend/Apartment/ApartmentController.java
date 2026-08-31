package com.condohub.backend.Apartment;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apartments")
public class ApartmentController {
    private final ApartmentService apartmentService;

    public ApartmentController(ApartmentService apartmentService) {
        this.apartmentService = apartmentService;
    }
    @GetMapping
    public List<Apartment> findAll() {
        return apartmentService.findAll();
    }
    @PostMapping
    public Apartment create(@RequestBody Apartment apartment) {
        return apartmentService.create(apartment);
    }

}
