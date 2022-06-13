package ar.com.alkemy.preAceleracion.challengeAlternativo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class IconoFiltersDTO {
    private String name;
    private String date;
    private Set<Long> cities;
    private String order;

    public IconoFiltersDTO(String name, String date, Set<Long> cities, String order){
        this.name = name;
        this.date = date;
        this.cities = cities;
        this.order = order;
    }

    public boolean isASC() {return this.order.compareToIgnoreCase( "ASC") == 0;}

    public boolean isDESC() {return this.order.compareToIgnoreCase( "DESC") == 0;}
}
