package ar.com.alkemy.preAceleracion.challengeAlternativo.service.implemen;

import ar.com.alkemy.preAceleracion.challengeAlternativo.dto.ContinenteDTO;
import ar.com.alkemy.preAceleracion.challengeAlternativo.entidades.ContinenteEntity;
import ar.com.alkemy.preAceleracion.challengeAlternativo.mapper.ContinenteMapper;
import ar.com.alkemy.preAceleracion.challengeAlternativo.repository.ContinenteRepository;
import ar.com.alkemy.preAceleracion.challengeAlternativo.service.ContinenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContinenteServiceImple implements ContinenteService {

    @Autowired
    private ContinenteMapper continenteMapper;
    @Autowired
    private ContinenteRepository continenteRepository;

    public ContinenteDTO save(ContinenteDTO dto){
        ContinenteEntity entity = continenteMapper.continenteDTO2Entity(dto);
        ContinenteEntity entitySaved = continenteRepository.save(entity);
        ContinenteDTO result = continenteMapper.continenteEntity2DTO(entitySaved);
        return result;
    }

    public List<ContinenteDTO> getAllContinentes() {
        List<ContinenteEntity> entities = continenteRepository.findAll();
        List<ContinenteDTO> result = continenteMapper.continenteEntityList2DTOList(entities);
        return result;
    }

}
