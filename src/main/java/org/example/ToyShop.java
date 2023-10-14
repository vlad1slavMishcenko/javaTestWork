package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Random;

public class ToyShop {

    private String path = "C:\\Users\\Владислав\\IdeaProjects\\ControlWork\\";
    LinkedList<Toy> listToy = new LinkedList<>();

    LinkedList<Toy> dropList = new LinkedList<>();


    public void write(Toy toy) throws IOException {
        try {

        FileWriter writer = new FileWriter(path+ "GetToy", true);
            writer.append("ID: "+toy.getId()+"\n" + "Name: " + toy.getName()+ "\n");
            writer.close();
        }catch (IOException e){
            throw new IOException("Ошибка записи файла");
        }

    }
    public void getToy() throws IOException {

            Toy value = dropList.pollFirst();
            if (value.getQuantity() > 0) {
                value.setQuantity(value.getQuantity() - 1);
                write(value);
            } else {
                throw new RuntimeException("Данной игрушки нет на складе");
            }

    }


    public void add(Toy toy){
        listToy.add(toy);
    }

    private boolean probabilityCheck(){
        int weight = 0;
        for (Toy toy: listToy){
            weight += toy.getWeight();
        }
        if (weight == 100){
            return true;
        }else {
            return false;
        }
    }
    public void randomDrop() throws IOException {
        Random rand = new Random();
        int sum = rand.nextInt(1,101);
        if (probabilityCheck()){
            int num =0;
            for (Toy toy: listToy) {
                num += toy.getWeight();
                if (sum <= num) {
                    dropList.add(toy);
                    getToy();
                    break;
                }
            }
        }else {
            throw new RuntimeException("Общая вероятность выпадения игрушек больше 100% ");
        }
    }
}
