package ar.com.alkemy.preAceleracion.challengeAlternativo.service;

import ar.com.alkemy.preAceleracion.challengeAlternativo.dto.IconoDTO;

import java.util.List;

public interface IconoService {

    IconoDTO save (IconoDTO dto);

    List<IconoDTO>getAllIconos();

    void delete(Long id);
}
