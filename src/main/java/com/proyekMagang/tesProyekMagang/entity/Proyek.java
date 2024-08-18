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
public class Proyek {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nama_proyek;
    private String client;
    private LocalDateTime tgl_mulai;
    private LocalDateTime tgl_selesai;
    private String pimpinan_proyek;
    private String keterangan;
    private LocalDateTime created_at;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaProyek() {
        return nama_proyek;
    }

    public void setNamaProyek(String namaProyek) {
        this.nama_proyek = namaProyek;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public LocalDateTime getTglMulai() {
        return tgl_mulai;
    }

    public void setTglMulai(LocalDateTime tglMulai) {
        this.tgl_mulai = tglMulai;
    }

    public LocalDateTime getTglSelesai() {
        return tgl_selesai;
    }

    public void setTglSelesai(LocalDateTime tglSelesai) {
        this.tgl_selesai = tglSelesai;
    }

    public String getPimpinanProyek() {
        return pimpinan_proyek;
    }

    public void setPimpinanProyek(String pimpinanProyek) {
        this.pimpinan_proyek = pimpinanProyek;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public LocalDateTime getCreateAt() {
        return created_at;
    }

    public void setCreateAt() {
        this.created_at = LocalDateTime.now();
    }

    
}
