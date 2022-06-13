package ar.com.alkemy.preAceleracion.challengeAlternativo.mapper;

import ar.com.alkemy.preAceleracion.challengeAlternativo.entidades.IconoEntity;
import ar.com.alkemy.preAceleracion.challengeAlternativo.dto.IconoBasicDTO;
import ar.com.alkemy.preAceleracion.challengeAlternativo.dto.IconoDTO;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class IconoMapper {

    public IconoEntity iconoDTO2Entity(IconoDTO dto) {
        IconoEntity iconoEntity = new IconoEntity();
        iconoEntity.setDenominacion(dto.getDenominacion());
        iconoEntity.setImagen(dto.getImagen());
        iconoEntity.setHistoria(dto.getHistoria());
        iconoEntity.setFechaCreacion(dto.getFechaCreacion());
        iconoEntity.setAltura(dto.getAltura());
        return iconoEntity;
    }

    public IconoDTO iconoEntity2DTO(IconoEntity entity) {
        IconoDTO dto = new IconoDTO();
        dto.setId(entity.getId());
        dto.setAltura(entity.getAltura());
        dto.setDenominacion(entity.getDenominacion());
        dto.setImagen(entity.getImagen());
        dto.setHistoria(entity.getHistoria());
        return dto;
    }

    public List<IconoDTO> iconoEntityList2DTOList(List<IconoEntity> entities) {
        List<IconoDTO> dtos = new ArrayList<>();
        for (IconoEntity entity : entities) {
            dtos.add(this.iconoEntity2DTO(entity));
        }
        return dtos;
    }

    public List<IconoBasicDTO> iconoEntitySet2BasicDTOList(Collection<IconoEntity> entities) {
        List<IconoBasicDTO> dtos = new ArrayList<>(); //Es necesario tener esta sentencia para icono basic
        IconoBasicDTO basicDTO;
        for (IconoEntity entity : entities) {
            basicDTO = new IconoBasicDTO();
            basicDTO.setId(entity.getId());
            basicDTO.setImagen(entity.getImagen());
            basicDTO.setDenominacion(entity.getDenominacion());
            dtos.add(basicDTO);
        }
        return dtos;
    }
}
