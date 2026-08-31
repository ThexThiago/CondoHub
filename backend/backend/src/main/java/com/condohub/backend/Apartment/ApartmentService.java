package com.condohub.backend.Apartment;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ApartmentService {

    private final ApartmentRepository apartmentRepository;

    public ApartmentService(ApartmentRepository apartmentRepository) {
        this.apartmentRepository = apartmentRepository;
    }

    public List<Apartment> findAll() {
        return apartmentRepository.findAll();
    }
    public Apartment create(Apartment apartment) {
        return apartmentRepository.save(apartment);
    }
}