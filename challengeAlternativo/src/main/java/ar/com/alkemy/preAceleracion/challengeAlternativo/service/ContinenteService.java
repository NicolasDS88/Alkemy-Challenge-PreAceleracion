package ar.com.alkemy.preAceleracion.challengeAlternativo.service;

import ar.com.alkemy.preAceleracion.challengeAlternativo.dto.ContinenteDTO;

import java.util.List;

public interface ContinenteService {

    ContinenteDTO save(ContinenteDTO dto);

    List<ContinenteDTO>getAllContinentes();
}
