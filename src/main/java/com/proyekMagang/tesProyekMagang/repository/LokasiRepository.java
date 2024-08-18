/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyekMagang.tesProyekMagang.repository;

import com.proyekMagang.tesProyekMagang.entity.Lokasi;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author Yuren
 */
public interface LokasiRepository extends JpaRepository<Lokasi, Integer>{

    public void save(Integer id);
    
}
