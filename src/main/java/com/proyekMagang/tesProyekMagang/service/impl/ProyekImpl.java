/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyekMagang.tesProyekMagang.service.impl;

import com.proyekMagang.tesProyekMagang.entity.Lokasi;
import com.proyekMagang.tesProyekMagang.entity.Proyek;
import com.proyekMagang.tesProyekMagang.entity.ProyekLokasiResponse;
import com.proyekMagang.tesProyekMagang.entity.Proyek_Lokasi;
import com.proyekMagang.tesProyekMagang.repository.LokasiRepository;
import com.proyekMagang.tesProyekMagang.repository.ProyekLokasiRepository;
import com.proyekMagang.tesProyekMagang.repository.ProyekRepository;
import com.proyekMagang.tesProyekMagang.service.ProyekService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

/**
 *
 * @author Yuren
 */
@Service
public class ProyekImpl implements ProyekService{
    @Autowired
    private ProyekRepository proyekRepository;
    @Autowired
    private LokasiRepository lokasiRepository;
    @Autowired
    private ProyekLokasiRepository proyekLokasiRepository;
    
    @Override
    public Proyek addProyek(Proyek proyek, Lokasi lokasi){
        Proyek savedProyek = proyekRepository.save(proyek);
        Lokasi savedLokasi = lokasiRepository.save(lokasi);

        Proyek_Lokasi proyekLokasi = new Proyek_Lokasi();
        
        proyekLokasi.setProyekId(savedProyek.getId());
        proyekLokasi.setLokasiId(savedLokasi.getId());

        proyekLokasiRepository.save(proyekLokasi);

        return savedProyek;
    }

    @Override
    public void updateProyek(Integer id, Proyek proyek) {
        proyekRepository
                .findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "invalid user id"+ id));
        
        proyek.setId(id);
        
        proyekRepository.save(proyek);
    }

    @Override
    public void deleteProyek(Integer id) {
        Proyek proyek = proyekRepository
                .findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "invalid user id"+ id));
        
        proyekRepository.delete(proyek);
    }

    @Override
    public List<Proyek> getProyek() {
        
        return proyekRepository.findAll();
    }

    @Override
    public Proyek getProyekById(Integer id) {
        return proyekRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Proyek with ID " + id + " not found"));
    }

    @Override
    public Proyek saveProyek(Proyek proyek) {
        return proyekRepository.save(proyek);
    }


}
