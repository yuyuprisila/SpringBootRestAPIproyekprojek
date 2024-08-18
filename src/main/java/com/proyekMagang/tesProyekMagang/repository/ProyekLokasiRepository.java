/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyekMagang.tesProyekMagang.repository;
    
import com.proyekMagang.tesProyekMagang.entity.Proyek_Lokasi;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Yuren
 */
public interface ProyekLokasiRepository extends JpaRepository<Proyek_Lokasi, Integer> {
//    List<Proyek_Lokasi> findByProyekId(Integer proyekId);    
}
