package com.nortec.escola.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nortec.escola.repository.MateriaRepository;

@RestController
@RequestMapping(value = "/materia")
public class MateriaController {
    
    @Autowired
    private MateriaRepository materiaRepository;

}
