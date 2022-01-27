package br.com.gavs.skyfly.service.service.mapper;

import br.com.gavs.skyfly.service.domain.Onibus;
import br.com.gavs.skyfly.service.service.dto.OnibusDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OnibusMapper extends EntityMapper<OnibusDTO, Onibus> {

    @Override
    Onibus toEntity(OnibusDTO dto);

    @Override
    @InheritInverseConfiguration
    OnibusDTO toDto(Onibus entity);
}
