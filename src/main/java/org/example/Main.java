package org.example;


import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {


            Toy toy1 = new Toy("Медведь", 5, 30);
            Toy toy2 = new Toy("Кукла", 3, 30);
            Toy toy3 = new Toy("Робот", 6, 40);
            ToyShop shop = new ToyShop();

            shop.add(toy1);
            shop.add(toy2);
            shop.add(toy3);
            shop.randomDrop();

        }catch (IOException | RuntimeException e){
            System.out.println(e.getMessage());

        }
    }


}