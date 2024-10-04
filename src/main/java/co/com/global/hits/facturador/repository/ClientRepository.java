package co.com.global.hits.facturador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.global.hits.facturador.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
