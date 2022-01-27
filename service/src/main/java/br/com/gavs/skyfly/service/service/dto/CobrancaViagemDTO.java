package br.com.gavs.skyfly.service.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CobrancaViagemDTO {

    private Long id;

    @NotNull(message = "O campo não pode ser nulo")
    @NotEmpty(message = "O campo não pode ser vazio")
    private Long passeDtoId;

    @NotNull(message = "O campo não pode ser nulo")
    @NotEmpty(message = "O campo não pode ser vazio")
    private Long onibusDtoId;

    @NotNull(message = "O campo não pode ser nulo")
    @NotEmpty(message = "O campo não pode ser vazio")
    private Timestamp dataHora;

    @NotNull(message = "O campo não pode ser nulo")
    @NotEmpty(message = "O campo não pode ser vazio")
    private Long valor;

}
