package com.eps.marcacionesapp.persistence;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "afiliados")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Afiliado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre", length = 100)
    @NonNull
    private String nombre;

    @Column(name = "documento", length = 200)
    private String documento;

    @Column(name = "apellido", length = 100)
    private String apellido;

    @OneToMany(mappedBy = "afiliado")
    @JsonIgnoreProperties(value = { "marcacion" }, allowSetters = true)
    private Set<Marcacion> marcaciones = new HashSet<>();
}