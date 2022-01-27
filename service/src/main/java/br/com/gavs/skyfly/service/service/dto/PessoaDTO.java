package br.com.gavs.skyfly.service.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PessoaDTO {

    private Long id;

    @NotNull(message = "O campo não pode ser nulo")
    @NotEmpty(message = "O campo está vazio")
    private String nome;

    @NotNull(message = "O campo não pode ser nulo")
    @Past
    private LocalDate dataNascimento;

    @NotNull(message = "O campo não pode ser nulo")
    @NotEmpty(message = "O campo está vazio")
    private String cidade;

    @NotNull(message = "O campo não pode ser nulo")
    @NotEmpty(message = "O campo está vazio")
    private String estado;

    @NotNull(message = "O campo não pode ser nulo")
    @NotEmpty(message = "O campo está vazio")
    private String telefone;

    @NotNull(message = "O campo não pode ser nulo")
    @Email
    private String email;

    @NotNull(message = "O campo não pode ser nulo")
    @NotEmpty(message = "O campo não pode ser vazio")
    private byte[] foto;

}
