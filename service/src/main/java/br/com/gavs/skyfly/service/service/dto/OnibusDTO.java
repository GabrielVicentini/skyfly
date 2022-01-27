package br.com.gavs.skyfly.service.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Time;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OnibusDTO {

    private Long id;

    @NotNull(message = "O campo não pode ser nulo")
    @NotEmpty(message = "O campo está vazio")
    private String cidade;

    @NotNull(message = "O campo não pode ser nulo")
    @NotEmpty(message = "O campo está vazio")
    private String estado;

    @NotNull(message = "O campo não pode ser nulo")
    @NotEmpty(message = "O campo está vazio")
    private String nomeLinha;

    @NotNull(message = "O campo não pode ser nulo")
    private Time inicioCirculacao;

    @NotNull(message = "O campo não pode ser nulo")
    private Time fimCirculacao;

}
