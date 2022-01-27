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
public class PasseDTO {

    private Long id;

    @NotNull(message = "O campo não pode ser nulo")
    @NotEmpty(message = "O campo está vazio")
    private String codigoRFID;

    @NotNull(message = "O campo não pode ser nulo")
    @NotEmpty(message = "O campo está vazio")
    private String ativo;

    @NotNull(message = "O campo não pode ser nulo")
    @NotEmpty(message = "O campo está vazio")
    private String categoriaEstudantil;

    @NotNull(message = "O campo não pode ser nulo")
    @NotEmpty(message = "O campo não pode ser vazio")
    private Long pessoaDtoId;

}
