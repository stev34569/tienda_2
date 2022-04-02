/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import com.tienda.domain.Articulo;
import java.util.List;

/**
 *
 * @author karen
 */
public interface ArticuloService {
    public List<Articulo> getArticulos(boolean activos);
    public void save(Articulo articulo);
    public void delete(Articulo articulo);
    public Articulo getArticulo(Articulo articulo);
}
