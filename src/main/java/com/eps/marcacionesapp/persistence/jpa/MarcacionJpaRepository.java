package com.eps.marcacionesapp.persistence.jpa;

import java.util.List;

import com.eps.marcacionesapp.persistence.Marcacion;

import org.springframework.data.jpa.repository.JpaRepository;
public interface MarcacionJpaRepository extends JpaRepository<Marcacion, Integer> {
    
}
