package com.chrometech.smoothie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chrometech.smoothie.dto.SmoothieDto;
import com.chrometech.smoothie.entity.Product;
import com.chrometech.smoothie.repository.ProductRepository;

@Service
public class SmoothieService {

    @Autowired
    private ProductRepository repository;

    public List<SmoothieDto> getSmoothies() {
        return repository.findAll().stream().map((p) -> mapToDto(p)).toList();
    }

    public void addSmoothie(SmoothieDto dto) {
        Product p = mapToEntity(dto);
        repository.save(p);
    }

    private SmoothieDto mapToDto(Product e) {
        SmoothieDto dto = new SmoothieDto();
        dto.setName(e.getName());
        dto.setDescription(e.getDescription());
        dto.setPrice(e.getPrice());
        return dto;
    }

        private Product mapToEntity(SmoothieDto dto) {
        Product e = new Product();
        e.setName(dto.getName());
        e.setDescription(dto.getDescription());
        e.setPrice(dto.getPrice());
        e.setIsEnabled(dto.isEnabled());
        return e;
    }
}
