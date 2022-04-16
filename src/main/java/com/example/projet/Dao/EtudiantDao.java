package com.example.projet.Dao;

import com.example.projet.bean.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EtudiantDao extends JpaRepository<Etudiant,Long> {

    Etudiant findByNom(String nom);
    Etudiant findByCin(String cin);
    int deleteByNom(String nom);
    int deleteByCin(String cin);

}
