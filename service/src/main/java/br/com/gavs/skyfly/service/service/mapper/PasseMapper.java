package br.com.gavs.skyfly.service.service.mapper;

import br.com.gavs.skyfly.service.domain.Passe;
import br.com.gavs.skyfly.service.service.dto.PasseDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PasseMapper extends EntityMapper<PasseDTO, Passe> {

    @Override
    @Mapping(source = "pessoaDtoId", target = "pessoa.id")
    Passe toEntity(PasseDTO dto);

    @Override
    @InheritInverseConfiguration
    PasseDTO toDto(Passe entity);
}
