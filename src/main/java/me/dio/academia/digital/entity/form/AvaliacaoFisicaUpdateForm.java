package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaUpdateForm {

    @Positive(message = "O peso precisa ser positivo")
    private double peso;

    @Positive(message = "A altura precisa ser positiva")
    private double altura;
}
