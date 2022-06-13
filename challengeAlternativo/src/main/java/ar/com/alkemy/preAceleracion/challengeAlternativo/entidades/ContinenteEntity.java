package ar.com.alkemy.preAceleracion.challengeAlternativo.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "continente")
@Getter
@Setter
public class ContinenteEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String imagen;
    private String denominacion;
}
