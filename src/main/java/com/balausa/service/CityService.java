package com.balausa.service;

import com.balausa.domain.City;
import com.balausa.mapper.CityMapper;
import com.balausa.repository.CityRepository;
import com.balausa.service.dto.CityDTO;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    private CityRepository repository;
    private CityMapper mapper;

    public CityService(CityRepository repository,
                       CityMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public CityDTO create(CityDTO dto) {
        City city = mapper.toEntity(dto);
        city = repository.save(city);
        return mapper.toDto(city);
    }
}
