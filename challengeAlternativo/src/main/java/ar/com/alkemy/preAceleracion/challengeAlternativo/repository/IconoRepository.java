package ar.com.alkemy.preAceleracion.challengeAlternativo.repository;

import ar.com.alkemy.preAceleracion.challengeAlternativo.entidades.IconoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface IconoRepository extends JpaRepository<IconoEntity, Long>, JpaSpecificationExecutor<IconoEntity> {

    //List<IconoEntity> findall(specification<IconoEntity> spec);
}
