package com.marcosfagiano.challenge.models;

public class Product extends Menu{
    private String name;
    private Float price;
    

    //constructors
    public Product(){}


    public Product(String name, Float price){
        this.name = name;
        this.price = price;
    }

    // setters y getters
    
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Float getPrice() {
        return price;
    }
    @Override
    public String toString(){
        return """
                =============================
                Producto: %s
                Precio: %.2f
                """.formatted(this.name, this.price);
    }
}
