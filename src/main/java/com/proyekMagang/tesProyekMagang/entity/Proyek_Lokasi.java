/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyekMagang.tesProyekMagang.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Proyek_Lokasi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "proyek_id")
    private Proyek proyek;

    @ManyToOne
    @JoinColumn(name = "lokasi_id")
    private Lokasi lokasi;

    // Getter and Setter for proyekId and lokasiId
    public int getProyekId() {
        return proyek != null ? proyek.getId() : 0;
    }

    public void setProyekId(int proyekId) {
        // Method is needed for proper mapping
    }

    public int getLokasiId() {
        return lokasi != null ? lokasi.getId() : 0;
    }

    public void setLokasiId(int lokasiId) {
        // Method is needed for proper mapping
    }
}
