package co.com.global.hits.facturador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.global.hits.facturador.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
