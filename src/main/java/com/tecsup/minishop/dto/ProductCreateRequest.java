package com.tecsup.minishop.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ProductCreateRequest(String name, Double price, Integer stock) {
}
