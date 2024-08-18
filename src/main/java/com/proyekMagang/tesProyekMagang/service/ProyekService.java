/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyekMagang.tesProyekMagang.service;

import com.proyekMagang.tesProyekMagang.entity.Lokasi;
import com.proyekMagang.tesProyekMagang.entity.Proyek;
import com.proyekMagang.tesProyekMagang.entity.ProyekLokasiResponse;
import java.util.List;

/**
 *
 * @author Yuren
 */

public interface ProyekService{

    Proyek addProyek(Proyek proyek, Lokasi lokasi);

    List<Proyek> getProyek();

    public void updateProyek(Integer id, Proyek proyek);

    public void deleteProyek(Integer id);
    
    public Proyek getProyekById(Integer id);

    public Proyek saveProyek(Proyek proyek);
    
}
