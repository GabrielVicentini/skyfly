package br.com.gavs.skyfly.service.service.mapper;

import br.com.gavs.skyfly.service.domain.Pessoa;
import br.com.gavs.skyfly.service.service.dto.PessoaDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PessoaMapper extends EntityMapper<PessoaDTO, Pessoa> {

    @Override
    Pessoa toEntity(PessoaDTO dto);

    @Override
    @InheritInverseConfiguration
    PessoaDTO toDto(Pessoa entity);
}
