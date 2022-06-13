package ar.com.alkemy.preAceleracion.challengeAlternativo.service.implemen;

import ar.com.alkemy.preAceleracion.challengeAlternativo.dto.PaisDTO;
import ar.com.alkemy.preAceleracion.challengeAlternativo.entidades.PaisEntity;
import ar.com.alkemy.preAceleracion.challengeAlternativo.mapper.PaisMapper;
import ar.com.alkemy.preAceleracion.challengeAlternativo.service.PaisService;
import ar.com.alkemy.preAceleracion.challengeAlternativo.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisServiceImple implements PaisService {

    @Autowired
    private PaisMapper paisMapper;
    @Autowired
    private PaisRepository paisRepository;

    public PaisDTO save(PaisDTO dto){
        PaisEntity entity = paisMapper.paisDTO2Entity(dto);
        PaisEntity entitySaved = paisRepository.save(entity);
        PaisDTO result = paisMapper.paisEntity2DTO(entitySaved);
        return result;
    }

    public List<PaisDTO> getAllPaises() {
        List<PaisEntity> entities = paisRepository.findAll();
        List<PaisDTO> result = paisMapper.paisEntityList2DTOList(entities);
        return result;
    }


}
