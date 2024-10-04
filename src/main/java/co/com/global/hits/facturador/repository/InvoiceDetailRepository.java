package co.com.global.hits.facturador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.com.global.hits.facturador.model.InvoiceDetail;

public interface InvoiceDetailRepository extends JpaRepository<InvoiceDetail, Long> {

}
