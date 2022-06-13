package ar.com.alkemy.preAceleracion.challengeAlternativo.mapper;

import ar.com.alkemy.preAceleracion.challengeAlternativo.entidades.PaisEntity;
import ar.com.alkemy.preAceleracion.challengeAlternativo.dto.PaisDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PaisMapper {

    public PaisEntity paisDTO2Entity(PaisDTO dto){
        PaisEntity paisEntity = new PaisEntity();
        paisEntity.setDenominacion(dto.getDenominacion());
        paisEntity.setImagen(dto.getImagen());
        paisEntity.setCantidadHabitantes(dto.getCantidadHabitantes());
        paisEntity.setId(dto.getId());
        paisEntity.setSuperficie(dto.getSuperficie());
        paisEntity.setContinenteId(dto.getContinenteId());
        return paisEntity;
    }

    public PaisDTO paisEntity2DTO(PaisEntity entity){
        PaisDTO dto = new PaisDTO();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setDenominacion(entity.getDenominacion());
        dto.setCantidadHabitantes(entity.getCantidadHabitantes());
        dto.setSuperficie(entity.getSuperficie());
        dto.setContinenteId(entity.getContinenteId());
        return dto;
    }

    public List<PaisDTO> paisEntityList2DTOList(List<PaisEntity> entities){
        List<PaisDTO> dtos = new ArrayList<>();
        for (PaisEntity entity : entities){
            dtos.add(this.paisEntity2DTO(entity));
        }
        return dtos;
    }

}
