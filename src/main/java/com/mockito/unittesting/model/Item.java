package com.mockito.unittesting.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Item {
    @Id
    private int id;
    private int quantity;
    private int price;
    private String name;
    @Transient
    private int value;
public Item(){}
    public Item(int id, String name, int price, int quantity) {
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString(){
     return   String.format("Item[%d, %s, %d, %d ]",id, name, price, quantity);
    }
}
