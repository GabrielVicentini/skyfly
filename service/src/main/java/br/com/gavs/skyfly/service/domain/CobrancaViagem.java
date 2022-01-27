package br.com.gavs.skyfly.service.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Table(name = "cobranca_viagem")
@Getter
@Setter
@Entity
public class CobrancaViagem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cobranca_viagem")
    @SequenceGenerator(name = "seq_cobranca_viagem", sequenceName = "seq_cobranca_viagem", allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private Long id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "ID_PASSE", nullable = false)
    private Long idPasse;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "ID_ONIBUS", nullable = false)
    private Long idOnibus;

    @Column(name = "DATA_HORA", nullable = false)
    private Timestamp dataHora;

    @Column(name = "VALOR", nullable = false)
    private Long valor;

}