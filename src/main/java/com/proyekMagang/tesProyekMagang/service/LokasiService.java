/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyekMagang.tesProyekMagang.service;

import com.proyekMagang.tesProyekMagang.entity.Lokasi;
import java.util.List;

//import java.util.List;

/**
 *
 * @author Yuren
 */

public interface LokasiService{

    public void addLokasii(Lokasi lokasi);

    List<Lokasi> getLokasi();

    public void updateLokasi(Integer id, Lokasi lokasi);

    public void deleteLokasi(Integer id);

    public Lokasi getLokasiById(Integer id);

    public Lokasi saveLokasi(Lokasi lokasi);
}
