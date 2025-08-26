package com.nortec.escola.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.nortec.escola.dto.MateriaDto;
import com.nortec.escola.modelo.Materia;
import com.nortec.escola.repository.MateriaRepository;

@RestController
@RequestMapping(value = "/materia")
public class MateriaController {
    
    @Autowired
    private MateriaRepository materiaRepository;

    @GetMapping(value = "/listaMateria")
    public List<Materia> findAll(){
        return materiaRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Materia> buscarMateriaPorId(@PathVariable Long id){
        Optional<Materia> materiaBanco = materiaRepository.findById(id);
        return ResponseEntity.ok(materiaBanco.get());
    }

    @PostMapping(value = "/insert")
    public ResponseEntity<?> insert(@RequestBody MateriaDto materiaDto){
       System.out.println(materiaDto.toString());
    //     Materia materia = materiaDto.novaMateria();
    //     System.out.println(materia.toString());

    //     materiaRepository.save(materia);

    //     URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
    //     .path("/id")
    //     .buildAndExpand(materia.getId())
    //     .toUri();

    // return ResponseEntity.created(uri).body(materia);
    return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Materia> atualizar(@PathVariable Long id, @RequestBody Materia materiaDto ){
       Materia materia = materiaRepository.findById(id).get();

       materia.setNome(materiaDto.getNome());
       materia.setProfessor(materiaDto.getProfessor());

       materiaRepository.save(materia);
       return ResponseEntity.ok(materia);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        materiaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
