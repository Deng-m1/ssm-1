package com.example.demo.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Book {
    private int id;
    private String type;
    private String name;
    private String description;

}
