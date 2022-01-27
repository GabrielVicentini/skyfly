package br.com.gavs.skyfly.service.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "passe")
@Getter
@Setter
@Entity
public class Passe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PASSE")
    @SequenceGenerator(name = "SEQ_PASSE", sequenceName = "SEQ_PASSE", allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "CODIGO_RFID", nullable = false, unique = true)
    private Long codigoRFID;

    @Column(name = "SALDO", nullable = false)
    private Double saldo;

    @Column(name = "ATIVO", nullable = false)
    private Boolean ativo;

    @Column(name = "CATEGORIA_ESTUDANTIL", nullable = false)
    private Boolean categoriaEstudantil;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "ID_PESSOA")
    private Pessoa idPessoa;

}