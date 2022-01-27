package br.com.gavs.skyfly.service.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "cobranca_viagem")
@Getter
@Setter
@Entity
public class CobrancaViagem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cobranca_viagem")
    @SequenceGenerator(name = "seq_cobranca_viagem", sequenceName = "seq_cobranca_viagem", allocationSize = 1)
    @Column(name = "id_cobranca", nullable = false)
    private Long idCobranca;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "id_passe", nullable = false)
    private Long idPasse;

}