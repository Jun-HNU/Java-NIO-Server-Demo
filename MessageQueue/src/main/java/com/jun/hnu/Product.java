package com.jun.hnu;

public class Product {

    private Integer id;
    private String name;
    private String ProducerName;

    public Product(Integer id, String name, String producerName) {
        this.id = id;
        this.name = name;
        ProducerName = producerName;
    }

    public Product(String name, String producerName) {
        this.name = name;
        ProducerName = producerName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducerName() {
        return ProducerName;
    }

    public void setProducerName(String producerName) {
        ProducerName = producerName;
    }
}
