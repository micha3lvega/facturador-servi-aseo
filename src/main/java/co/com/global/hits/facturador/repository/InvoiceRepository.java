package co.com.global.hits.facturador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.global.hits.facturador.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
