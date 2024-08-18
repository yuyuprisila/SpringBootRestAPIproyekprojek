/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyekMagang.tesProyekMagang.service;

import com.proyekMagang.tesProyekMagang.entity.Proyek_Lokasi;
import java.util.List;

/**
 *
 * @author Yuren
 */
public interface ProyekLokasiService {

    public List<Proyek_Lokasi> getProyekLokasi();

    public Proyek_Lokasi getProyekLokasiByid(Integer id);

    public Proyek_Lokasi saveProyekLokasi(Proyek_Lokasi proyekLokasi);
    
}
