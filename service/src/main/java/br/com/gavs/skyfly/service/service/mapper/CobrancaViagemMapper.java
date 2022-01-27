package br.com.gavs.skyfly.service.service.mapper;

import br.com.gavs.skyfly.service.domain.CobrancaViagem;
import br.com.gavs.skyfly.service.service.dto.CobrancaViagemDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CobrancaViagemMapper extends EntityMapper<CobrancaViagemDTO, CobrancaViagem> {

    @Override
    @Mapping(source = "passeDtoId", target = "passe.id")
    @Mapping(source = "onibusDtoId", target = "onibus.id")
    CobrancaViagem toEntity(CobrancaViagemDTO dto);

    @Override
    @InheritInverseConfiguration
    CobrancaViagemDTO toDto(CobrancaViagem entity);
}
