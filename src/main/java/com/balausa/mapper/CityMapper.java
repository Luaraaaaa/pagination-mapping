package com.balausa.mapper;

import com.balausa.domain.City;
import com.balausa.service.dto.CityDTO;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface CityMapper {

    CityDTO toDto(City entity);

    City toEntity(CityDTO dto);

}
