package br.com.gavs.skyfly.service.repository;

import br.com.gavs.skyfly.service.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
