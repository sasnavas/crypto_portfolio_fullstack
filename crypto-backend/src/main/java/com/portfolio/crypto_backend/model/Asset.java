package com.portfolio.crypto_backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "assets")
@Data
public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String cripto_id;

    @Column(nullable = false)
    private String symbol;

    @Column(nullable = false)
    private String quantity;

}
