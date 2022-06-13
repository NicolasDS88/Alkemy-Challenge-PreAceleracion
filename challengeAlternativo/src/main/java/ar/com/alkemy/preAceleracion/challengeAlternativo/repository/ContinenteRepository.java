package ar.com.alkemy.preAceleracion.challengeAlternativo.repository;

import ar.com.alkemy.preAceleracion.challengeAlternativo.entidades.ContinenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContinenteRepository extends JpaRepository<ContinenteEntity, Long> {
}
