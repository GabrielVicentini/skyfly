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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ONIBUS")
    @SequenceGenerator(name = "SEQ_ONIBUS", sequenceName = "SEQ_ONIBUS", allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "CIDADE", length = 50, nullable = false)
    private String cidade;

    @Column(name = "ESTADO", length = 2, nullable = false)
    private String estado;

    @Column(name = "NOME_LINHA", length = 100, nullable = false)
    private String nomeLinha;

    @Column(name = "INICIO_CIRCULACAO", nullable = false)
    private Time inicioCirculacao;

    @Column(name = "FIM_CIRCULACAO", nullable = false)
    private Time fimCirculacao;

}