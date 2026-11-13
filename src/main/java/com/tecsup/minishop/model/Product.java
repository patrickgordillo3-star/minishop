package com.tecsup.minishop.model;
import jakarta.persistence.*; import lombok.*;
@Entity @Table(name="products") @Data @Builder @NoArgsConstructor @AllArgsConstructor
public class Product { @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id; @Column(nullable=false) private String name; @Column(nullable=false) private Double price; @Column(nullable=false) private Integer stock; }
