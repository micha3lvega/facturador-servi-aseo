package co.com.global.hits.facturador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.global.hits.facturador.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
