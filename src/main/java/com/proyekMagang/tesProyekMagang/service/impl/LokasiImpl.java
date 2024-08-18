/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyekMagang.tesProyekMagang.service.impl;

import com.proyekMagang.tesProyekMagang.entity.Lokasi;
import com.proyekMagang.tesProyekMagang.repository.LokasiRepository;
import com.proyekMagang.tesProyekMagang.service.LokasiService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


/**
 *
 * @author Yuren
 */
@Service
public class LokasiImpl implements LokasiService{
    
    @Autowired
    private LokasiRepository lokasiRepository;
    
    @Override
    public void addLokasii(Lokasi lokasi) {
        lokasiRepository.save(lokasi);
    }


    @Override
    public List<Lokasi> getLokasi() {
        return lokasiRepository.findAll();
    }

    @Override
    public void updateLokasi(Integer id, Lokasi lokasi) {
        lokasiRepository
                .findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "invalid user id"+ id));
        
        lokasi.setId(id);
        
        lokasiRepository.save(lokasi);
    }

    @Override
    public void deleteLokasi(Integer id) {
        Lokasi lokasi = lokasiRepository
                .findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "invalid user id"+ id));
        lokasiRepository.delete(lokasi);
    }

    @Override
    public Lokasi getLokasiById(Integer id) {
        return lokasiRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Proyek with ID " + id + " not found"));
    }

    @Override
    public Lokasi saveLokasi(Lokasi lokasi) {
        return lokasiRepository.save(lokasi);
    }
    
    
}
