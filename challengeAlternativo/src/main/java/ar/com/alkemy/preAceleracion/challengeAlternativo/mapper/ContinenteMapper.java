package ar.com.alkemy.preAceleracion.challengeAlternativo.mapper;

import ar.com.alkemy.preAceleracion.challengeAlternativo.entidades.ContinenteEntity;
import ar.com.alkemy.preAceleracion.challengeAlternativo.dto.ContinenteDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ContinenteMapper {

    public ContinenteEntity continenteDTO2Entity(ContinenteDTO dto){
        ContinenteEntity continenteEntity = new ContinenteEntity();
        continenteEntity.setImagen(dto.getImagen());
        continenteEntity.setDenominacion(dto.getDenominacion());
        return continenteEntity;
    }

    public ContinenteDTO continenteEntity2DTO(ContinenteEntity entity){
        ContinenteDTO dto = new ContinenteDTO();
        dto.setId(entity.getId());
        dto.setImagen(entity.getImagen());
        dto.setDenominacion(entity.getDenominacion());
        return dto;
    }

    public List<ContinenteDTO> continenteEntityList2DTOList(List<ContinenteEntity> entities){
        List<ContinenteDTO> dtos = new ArrayList<>();
        for (ContinenteEntity entity : entities){
            dtos.add(this.continenteEntity2DTO(entity));
        }
        return dtos;
    }
}
