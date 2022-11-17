package io.github.renatoganske.dsmeta.repositories;

import io.github.renatoganske.dsmeta.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
