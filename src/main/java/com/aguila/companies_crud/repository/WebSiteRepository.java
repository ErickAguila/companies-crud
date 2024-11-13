package com.aguila.companies_crud.repository;

import com.aguila.companies_crud.entities.WebSite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebSiteRepository extends JpaRepository<WebSite, Long> {
}
