package br.com.gavs.skyfly.service.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;

@Table(name = "onibus")
@Getter
@Setter
@Entity
public class Onibus implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_onibus")
    @SequenceGenerator(name = "seq_onibus", sequenceName = "seq_onibus", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "cidade", length = 50, nullable = false)
    private String cidade;

    @Column(name = "estado", length = 2, nullable = false)
    private String estado;

    @Column(name = "nome_linha", length = 100, nullable = false)
    private String nomeLinha;

    @Column(name = "inicio_circulacao", nullable = false)
    private Time inicioCirculacao;

    @Column(name = "fim_circulacao", nullable = false)
    private Time fimCirculacao;

}