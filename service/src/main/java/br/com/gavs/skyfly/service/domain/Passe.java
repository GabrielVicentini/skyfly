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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_passe")
    @SequenceGenerator(name = "seq_passe", sequenceName = "seq_passe", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "codigo_rfid", nullable = false, unique = true)
    private Long codigoRFID;

    @Column(name = "saldo", nullable = false)
    private Double saldo;

    @Column(name = "ativo", nullable = false)
    private Boolean ativo;

    @Column(name = "categoria_estudantil", nullable = false)
    private Boolean categoriaEstudantil;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "id_pessoa")
    private Pessoa idPessoa;

}