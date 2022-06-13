package ar.com.alkemy.preAceleracion.challengeAlternativo.service.implemen;

import ar.com.alkemy.preAceleracion.challengeAlternativo.dto.IconoDTO;
import ar.com.alkemy.preAceleracion.challengeAlternativo.entidades.IconoEntity;
import ar.com.alkemy.preAceleracion.challengeAlternativo.mapper.IconoMapper;
import ar.com.alkemy.preAceleracion.challengeAlternativo.service.IconoService;
import ar.com.alkemy.preAceleracion.challengeAlternativo.repository.IconoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class IconoServiceImple implements IconoService {

    @Autowired
    private IconoMapper iconoMapper;
    @Autowired
    private IconoRepository iconoRepository;

    public void delete(Long id) {
        this.iconoRepository.deleteById(id);
    }

    public IconoDTO save(IconoDTO dto){
        IconoEntity entity = iconoMapper.iconoDTO2Entity(dto);
        IconoEntity entitySaved = iconoRepository.save(entity);
        IconoDTO result = iconoMapper.iconoEntity2DTO(entitySaved);
        return result;
    }

    public List<IconoDTO> getAllIconos() {
        List<IconoEntity> entities = iconoRepository.findAll();
        List<IconoDTO> result = iconoMapper.iconoEntityList2DTOList(entities);
        return result;
    }
}

