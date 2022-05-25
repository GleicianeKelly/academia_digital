package Entity.form;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Positive;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvaliacaoFisicaForm {

    @Positive(message = "O id do aluno precisa ser positivo")
    private Long aluniId;

    @NotNull
    @Positive(message = "'${validatedValue} 'precisa ser positivo")
    private double peso;

    @NotNull
    @Positive(message = "'${validatedValue}' precisa ser positivo")
    @DecimalMin(value = "150", message = "'${validatedValue}' precisa ser no mínimo {value}")
    private double altura;


}
