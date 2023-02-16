package com.company.service.product;

public class Product {
    private Integer id;
    private String name;
    private Integer weight;
    private String container;
    private Integer lot;


    public Product(Integer id, String name, Integer weight, String container, Integer lot) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.container = container;
        this.lot = lot;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getWeight() {
        return weight;
    }

    public String getContainer() {
        return container;
    }

    public Integer getLot() {
        return lot;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public void setLot(Integer lot) {
        this.lot = lot;
    }
}
