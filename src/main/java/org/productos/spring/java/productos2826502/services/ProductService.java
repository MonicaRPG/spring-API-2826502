package org.productos.spring.java.productos2826502.services;

import java.util.List;

import org.productos.spring.java.productos2826502.entities.Product;
import org.productos.spring.java.productos2826502.repositories.ProductRepositorie;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    //inyectar la dependencia
    //al repositorio
    private ProductRepositorie repository 
            = new ProductRepositorie();

    //Operaciones de logica de negocio
    //casos de uso, historia de usuario
    //requerimientos funcionales

    public List<Product> findAllProducts(){
        return repository.findAll();
    }
}
