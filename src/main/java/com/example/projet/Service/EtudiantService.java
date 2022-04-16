package com.example.projet.Service;

import com.example.projet.Dao.EtudiantDao;
import com.example.projet.bean.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EtudiantService {

    public Etudiant findByNom(String nom) {
        return etudiantDao.findByNom(nom);
    }

    public Etudiant findByCin(String cin) {
        return etudiantDao.findByCin(cin);
    }

    @Transactional
    public int deleteByNom(String nom) {
        return etudiantDao.deleteByNom(nom);
    }

    @Transactional
    public int deleteByCin(String cin) {
        return etudiantDao.deleteByCin(cin);
    }

    public List<Etudiant> findAll() {
        return etudiantDao.findAll();
    }

    public int save(Etudiant etudiant) {
        if (findByNom(etudiant.getNom()) != null) {
            return -1;
        } else if (findByCin((etudiant.getCin()))!=null){
            return -1;
        }
        else {
            etudiantDao.save(etudiant);
            return 1;
        }
    }

    @Autowired
    private EtudiantDao etudiantDao;
}
