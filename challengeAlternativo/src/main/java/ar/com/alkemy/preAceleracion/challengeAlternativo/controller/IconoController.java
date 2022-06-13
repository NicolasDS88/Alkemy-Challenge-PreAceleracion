package ar.com.alkemy.preAceleracion.challengeAlternativo.controller;

import ar.com.alkemy.preAceleracion.challengeAlternativo.dto.IconoDTO;
import ar.com.alkemy.preAceleracion.challengeAlternativo.service.IconoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Iconos")
public class IconoController {

    @Autowired
    private IconoService iconoService;

    @GetMapping
    public ResponseEntity<List<IconoDTO>> getAll(){
        List<IconoDTO>iconos = iconoService.getAllIconos();
        return ResponseEntity.ok().body(iconos);
    }

    @PostMapping //Insertar
    public ResponseEntity<IconoDTO> save(@RequestBody IconoDTO icono){
        IconoDTO iconoGuardado = iconoService.save(icono);
        return ResponseEntity.status(HttpStatus.CREATED).body(iconoGuardado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        this.iconoService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
