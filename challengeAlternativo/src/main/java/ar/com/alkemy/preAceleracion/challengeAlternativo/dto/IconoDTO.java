package ar.com.alkemy.preAceleracion.challengeAlternativo.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class IconoDTO {
    private String denominacion;
    private String imagen;
    private Long id;
    private Long altura;
    private String historia;
    private LocalDate fechaCreacion;
    private List<PaisDTO> paises;

}
