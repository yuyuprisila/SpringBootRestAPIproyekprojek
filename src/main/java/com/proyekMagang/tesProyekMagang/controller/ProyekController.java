/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyekMagang.tesProyekMagang.controller;

import com.proyekMagang.tesProyekMagang.entity.Lokasi;
import com.proyekMagang.tesProyekMagang.entity.Proyek;
import com.proyekMagang.tesProyekMagang.entity.ProyekLokasiRequest;
import com.proyekMagang.tesProyekMagang.entity.Proyek_Lokasi;
import com.proyekMagang.tesProyekMagang.service.LokasiService;
import com.proyekMagang.tesProyekMagang.service.ProyekLokasiService;
import com.proyekMagang.tesProyekMagang.service.ProyekService;
import java.util.List;
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

/**
 *
 * @author Yuren
 */

@RestController
@RequestMapping("/proyek")

public class ProyekController {
    @Autowired
    private ProyekService proyekService;
    
    @Autowired
    private LokasiService lokasiService;
    
    @Autowired
    private ProyekLokasiService proyeklokasiService;
    
    @PostMapping("/addproyek")
    public ResponseEntity<Proyek> addProyek(@RequestBody ProyekLokasiRequest request) {
//        Proyek proyek = new Proyek();
//        proyek.setNamaProyek(request.getNamaProyek());
//        proyek.setClient(request.getClient());
//        proyek.setTglMulai(request.getTglMulai());
//        proyek.setTglSelesai(request.getTglSelesai());
//        proyek.setPimpinanProyek(request.getPimpinanProyek());
//        proyek.setKeterangan(request.getKeterangan());
//        proyek.setCreateAt();
//
//        Lokasi lokasi = new Lokasi();
//        lokasi.setNamaLokasi(request.getNamaLokasi());
//        lokasi.setNegara(request.getNegara());
//        lokasi.setProvinsi(request.getProvinsi());
//        lokasi.setKota(request.getKota());
//        lokasi.setCreateAt();
//
//
//        proyek = proyekService.addProyek(proyek, lokasi);
//        return ResponseEntity.ok(proyek);

        Proyek proyek = new Proyek();
        proyek.setNamaProyek(request.getNamaProyek());
        proyek.setClient(request.getClient());
        proyek.setTglMulai(request.getTglMulai());
        proyek.setTglSelesai(request.getTglSelesai());
        proyek.setPimpinanProyek(request.getPimpinanProyek());
        proyek.setKeterangan(request.getKeterangan());
        proyek.setCreateAt();

        proyek = proyekService.saveProyek(proyek);

        // Membuat dan menyimpan objek Lokasi
        Lokasi lokasi = new Lokasi();
        lokasi.setNamaLokasi(request.getNamaLokasi());
        lokasi.setNegara(request.getNegara());
        lokasi.setProvinsi(request.getProvinsi());
        lokasi.setKota(request.getKota());
        lokasi.setCreateAt();

        lokasi = lokasiService.saveLokasi(lokasi);

        // Membuat dan menyimpan objek Proyek_Lokasi
        Proyek_Lokasi proyekLokasi = new Proyek_Lokasi();
        proyekLokasi.setProyek(proyek);
        proyekLokasi.setLokasi(lokasi);

        proyeklokasiService.saveProyekLokasi(proyekLokasi);

        return ResponseEntity.ok(proyek);
    }
    
    @GetMapping
    public List<Proyek_Lokasi> getProyek(){
        return proyeklokasiService.getProyekLokasi();
    }   
    
    @PutMapping("/proyekUpdate/{id}")
    public ResponseEntity<Void> updateProyek(@PathVariable Integer id, @RequestBody Proyek proyek){
        proyekService.updateProyek(id, proyek);
        return ResponseEntity.noContent().build();
    }
    
    @DeleteMapping("/proyekDelete/{id}")
    public ResponseEntity<Void> deleteProyek(@PathVariable Integer id){
        proyekService.deleteProyek(id);
        
        return ResponseEntity.noContent().build();
    }
    
    @GetMapping("/getProyekById/{id}")
    public ResponseEntity<Proyek_Lokasi> getProyekById(@PathVariable Integer id){
        Proyek_Lokasi proyeklokasi = proyeklokasiService.getProyekLokasiByid(id);
        return ResponseEntity.ok(proyeklokasi);
    }  
}
