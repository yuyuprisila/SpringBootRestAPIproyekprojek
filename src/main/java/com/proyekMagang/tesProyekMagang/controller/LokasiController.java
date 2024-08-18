/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyekMagang.tesProyekMagang.controller;

import com.proyekMagang.tesProyekMagang.entity.Lokasi;
import com.proyekMagang.tesProyekMagang.service.LokasiService;
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
@RequestMapping("/lokasi")
public class LokasiController {
    @Autowired
    private LokasiService lokasiService;
    
    @PostMapping("/lokasiAdd")
    public String addLookasi(@RequestBody Lokasi lokasi){
        lokasiService.addLokasii(lokasi);
        return "success add lokasi";
    }
    
    @GetMapping
    public List<Lokasi> getLokasi(){
        return lokasiService.getLokasi();
    }  
    
    @PutMapping("/lokasiUpdate/{id}")
    public ResponseEntity<Void> updateLokasi(@PathVariable Integer id, @RequestBody Lokasi lokasi){
        lokasiService.updateLokasi(id, lokasi);
        return ResponseEntity.noContent().build();
    }
    
    @DeleteMapping("/lokasiDelete/{id}")
    public ResponseEntity<Void> deleteLokasi(@PathVariable Integer id){
        lokasiService.deleteLokasi(id);
        
        return ResponseEntity.noContent().build();
    }
    
    @GetMapping("/getlokasiById/{id}")
    public ResponseEntity<Lokasi> getLokasiById(@PathVariable Integer id){
        Lokasi lokasi = lokasiService.getLokasiById(id);
        return ResponseEntity.ok(lokasi);
    } 
}
