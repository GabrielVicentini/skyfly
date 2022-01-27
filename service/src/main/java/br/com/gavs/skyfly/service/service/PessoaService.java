package br.com.gavs.skyfly.service.service;

import br.com.gavs.skyfly.service.domain.Pessoa;
import br.com.gavs.skyfly.service.repository.PessoaRepository;
import br.com.gavs.skyfly.service.service.dto.PessoaDTO;
import br.com.gavs.skyfly.service.service.mapper.PessoaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class PessoaService {

    private final PessoaRepository pessoaRepository;
    private final PessoaMapper pessoaMapper;

    public PessoaDTO salvar(PessoaDTO pessoaDTO){
        Pessoa pessoa = pessoaMapper.toEntity(pessoaDTO);
        pessoaRepository.save(pessoa);
        return pessoaMapper.toDto(pessoa);
    }

    public PessoaDTO atualizar(PessoaDTO pessoaDTO){
        Pessoa pessoa = pessoaMapper.toEntity(pessoaDTO);
        //Pessoa pessoaSalva = getPessoa(pessoa.getId());
        pessoaRepository.save(pessoa);
        return pessoaMapper.toDto(pessoa);
    }

    public void deletar(Long idPessoa){
        pessoaRepository.deleteById(idPessoa);
    }
}
