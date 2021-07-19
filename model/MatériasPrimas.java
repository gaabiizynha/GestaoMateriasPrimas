package com.projeto.gestãoMP.model;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "tb_matériasprimas")
public class MatériasPrimas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Nome do produto é obrigatório")
    @Size(min = 3, max = 256)
    private String nome;

    @NotNull(message = "Quantidade é obrigatorio")
    @Min(value=0, message="Quantidade tem que ser maior que 0 gramas ")
    @Max(value=1001, message="Quantidade tem que ser menor ou igual a 1000 gramas ")
    private Integer valorR$;

	public Object save(MatériasPrimas matériasprimas) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object findById(Long id2) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object findAllByNomeContainingIgnoreCase(String nome2) {
		// TODO Auto-generated method stub
		return null;
	}
    
}