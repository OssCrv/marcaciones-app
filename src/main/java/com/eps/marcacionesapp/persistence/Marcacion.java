package com.eps.marcacionesapp.persistence;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "marcaciones")
@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class Marcacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_afiliado")
    @JsonIgnoreProperties(value = { "marcaciones"})
    private Afiliado afiliado;

    @Column(name = "codigo_marcacion")
    @NonNull
    private String codigoMarcacion;
}