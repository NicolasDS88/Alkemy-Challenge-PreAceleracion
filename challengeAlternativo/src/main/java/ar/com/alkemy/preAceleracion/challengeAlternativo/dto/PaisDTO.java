package ar.com.alkemy.preAceleracion.challengeAlternativo.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class PaisDTO{
    private String denominacion;
    private String imagen;
    private Long id;
    private Long cantidadHabitantes;
    private Long superficie;
    private Long continenteId;

}
