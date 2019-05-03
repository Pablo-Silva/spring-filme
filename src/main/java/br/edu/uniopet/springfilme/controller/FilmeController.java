package br.edu.uniopet.springfilme.controller;

import br.edu.uniopet.springfilme.domain.Filme;
import br.edu.uniopet.springfilme.reppository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("filmes")
public class FilmeController {

    @Autowired
    private FilmeRepository filmeRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Filme> findAll(){
        return filmeRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Filme getById(@PathVariable Integer id) {
        return filmeRepository.findById(id).orElse(null);
    }
}
