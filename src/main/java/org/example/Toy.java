package org.example;

public class Toy {
    private int id;
    private String name;
    private int quantity;
    private int weight;

    private static int value = 1;


    public Toy(String name, int quantity, int weight) {
        this.id = value ++;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }
}
