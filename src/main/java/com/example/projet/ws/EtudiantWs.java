package com.example.projet.ws;

import com.example.projet.Service.EtudiantService;
import com.example.projet.bean.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("etudiant/etudiant")
@CrossOrigin("http://localhost:4200")
public class EtudiantWs {

    @GetMapping("/nom/{nom}")
    public Etudiant findByNom(@PathVariable String nom) {
        return etudiantService.findByNom(nom);
    }

    @GetMapping("/cin/{cin}")
    public Etudiant findByCin(@PathVariable String cin) {
        return etudiantService.findByCin(cin);
    }

    @DeleteMapping("/nom/{nom}")
    public int deleteByNom(@PathVariable String nom) {
        return etudiantService.deleteByNom(nom);
    }

    @DeleteMapping("/cin/{cin}")
    public int deleteByCin(@PathVariable String cin) {
        return etudiantService.deleteByCin(cin);
    }

    @GetMapping("/")
    public List<Etudiant> findAll() {
        return etudiantService.findAll();
    }

    @PostMapping("/")
    public int save(@RequestBody Etudiant etudiant) {
        return etudiantService.save(etudiant);
    }

    @Autowired
    private EtudiantService etudiantService;
}
