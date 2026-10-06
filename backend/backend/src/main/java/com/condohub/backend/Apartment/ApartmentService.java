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

    public Apartment findById(Long id) {
        return apartmentRepository.findById(id)
                .orElseThrow();
    }

    public Apartment update(Long id, Apartment newData) {
        Apartment    existingApartment = findById(id);

        existingApartment.setNumber(newData.getNumber());
        existingApartment.setFloor(newData.getFloor());
        existingApartment.setOccupied(newData.getOccupied());

        return apartmentRepository.save(existingApartment);
    }
    public void delete(Long id) {
        Apartment apartment = findById(id);
        apartmentRepository.delete(apartment);
    }
}