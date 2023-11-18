package br.com.projeto.estoque_automotivo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.estoque_automotivo.Veiculo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping("/veiculos")
public class VeiculosController {

    @Autowired
    private VeiculoRepository VeiculoRepository

    @GetMapping
    public List<Veiculo> listar() {
        return VeiculoRepository.findall();
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Veiculo adicionar (@RequestBody Veiculo veiculo){
        return VeiculoRepository.save(veiculo);
    }
}