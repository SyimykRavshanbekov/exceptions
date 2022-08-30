package HomeWork20;

import java.io.*;

public class Main {
    public static void main(String[] args) {

//        FileReader fileReader = new FileReader(String.valueOf(car))

        Car car = new Car();
        try{
            car.drive();
            throw new IOException();
        }catch (UncheckedIOException | IOException e) {
            car.close();
        }

    }
}