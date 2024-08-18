/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyekMagang.tesProyekMagang.service.impl;

import com.proyekMagang.tesProyekMagang.entity.Lokasi;
import com.proyekMagang.tesProyekMagang.entity.Proyek;
import com.proyekMagang.tesProyekMagang.entity.Proyek_Lokasi;
import com.proyekMagang.tesProyekMagang.repository.LokasiRepository;
import com.proyekMagang.tesProyekMagang.repository.ProyekLokasiRepository;
import com.proyekMagang.tesProyekMagang.service.LokasiService;
import com.proyekMagang.tesProyekMagang.service.ProyekLokasiService;
import com.proyekMagang.tesProyekMagang.service.ProyekService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Yuren
 */

@Service
public class ProyekLokasiImpl implements ProyekLokasiService {
    @Autowired
    private ProyekLokasiRepository proyekLokasiRepository;
    @Autowired
    private LokasiService lokasiservice;
    @Autowired
    private ProyekService proyekservice;

    @Override
    public List<Proyek_Lokasi> getProyekLokasi() {
        // Mengambil semua data Proyek_Lokasi dari repository
        List<Proyek_Lokasi> proyekLokasiList = proyekLokasiRepository.findAll();
        
        // Loop melalui semua data Proyek_Lokasi dan ambil detail Lokasi dan Proyek
        for (Proyek_Lokasi proyekLokasi : proyekLokasiList) {
            Lokasi lokasi = lokasiservice.getLokasiById(proyekLokasi.getLokasiId());
            Proyek proyek = proyekservice.getProyekById(proyekLokasi.getProyekId());
            
            // Jika Anda ingin menambahkan informasi detail lokasi dan proyek ke proyekLokasi
            proyekLokasi.setLokasi(lokasi); // Pastikan Proyek_Lokasi memiliki field untuk Lokasi
            proyekLokasi.setProyek(proyek);  // Pastikan Proyek_Lokasi memiliki field untuk Proyek
        }
        
        return proyekLokasiList;
    }

    @Override
    public Proyek_Lokasi getProyekLokasiByid(Integer id) {
        return proyekLokasiRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Proyek with ID " + id + " not found"));
    }

    @Override
    public Proyek_Lokasi saveProyekLokasi(Proyek_Lokasi proyekLokasi) {
        return proyekLokasiRepository.save(proyekLokasi);
    }
    
}
