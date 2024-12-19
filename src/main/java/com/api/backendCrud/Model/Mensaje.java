package com.api.backendCrud.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "MENSAJES")
public class Mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")

    private Long id;

    @Column(name = "texto")
    @JsonProperty("TEXTO")
    private String texto;


}
