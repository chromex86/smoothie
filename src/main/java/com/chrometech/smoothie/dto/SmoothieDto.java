package com.chrometech.smoothie.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SmoothieDto {
    private String name;
    private BigDecimal price;
    private String description;
    private boolean isEnabled;
}

