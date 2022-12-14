package com.example.desire.model;

import lombok.Data;

@Data
public class Wish {
    private final Long id;
    private String name;
    private Type type;
    public enum Type {
        Товар, Услуга
    }
}
