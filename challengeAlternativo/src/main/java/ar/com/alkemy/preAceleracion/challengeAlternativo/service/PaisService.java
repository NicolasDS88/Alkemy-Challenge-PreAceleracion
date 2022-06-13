package ar.com.alkemy.preAceleracion.challengeAlternativo.service;

import ar.com.alkemy.preAceleracion.challengeAlternativo.dto.PaisDTO;

import java.util.List;

public interface PaisService {

    PaisDTO save(PaisDTO dto);

    List<PaisDTO>getAllPaises();
}
