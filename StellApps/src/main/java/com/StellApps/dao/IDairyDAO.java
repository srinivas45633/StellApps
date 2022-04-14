package com.StellApps.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.StellApps.model.Dairy;
@Repository
public interface IDairyDAO extends JpaRepository<Dairy, Long> {

}
