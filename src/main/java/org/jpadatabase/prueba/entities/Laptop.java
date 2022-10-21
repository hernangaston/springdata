package org.jpadatabase.prueba.entities;

import javax.persistence.*;

@Entity
@Table(name = "Laptops")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String marca;
    private Integer hardDiskCapacity;
    private Boolean available;
    private Double price;

    public Laptop() {
    }

    public Laptop(Long id, String name, String marca, Integer hardDiskCapacity, Boolean available, Double price) {
        this.id = id;
        this.name = name;
        this.marca = marca;
        this.hardDiskCapacity = hardDiskCapacity;
        this.available = available;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getHardDiskCapacity() {
        return hardDiskCapacity;
    }

    public void setHardDiskCapacity(Integer hardDiskCapacity) {
        this.hardDiskCapacity = hardDiskCapacity;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
