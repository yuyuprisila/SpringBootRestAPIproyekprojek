/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyekMagang.tesProyekMagang.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



/**
 *
 * @author Yuren
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Lokasi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String namaLokasi;
    private String negara;
    private String provinsi;
    private String kota;
    private LocalDateTime created_at;
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaLokasi() {
        return namaLokasi;
    }

    public void setNamaLokasi(String namaLokasi) {
        this.namaLokasi = namaLokasi;
    }

    public String getNegara() {
        return negara;
    }
    
    public void setNegara(String negara) {
        this.negara = negara;
    }
    
    public String getProvinsi() {
        return provinsi;
    }
    
    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getKota() {
        return kota;
    }
    
    public void setKota(String kota) {
        this.kota = kota;
    }
    
    public LocalDateTime getCreateAt() {
        return created_at;
    }

    public void setCreateAt() {
        this.created_at = LocalDateTime.now();
    }
    
}
