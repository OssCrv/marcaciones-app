package com.eps.marcacionesapp.persistence.jpa;

import java.util.Optional;

import com.eps.marcacionesapp.persistence.Afiliado;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AfiliadoJpaRepository extends JpaRepository<Afiliado, Integer> {
}
