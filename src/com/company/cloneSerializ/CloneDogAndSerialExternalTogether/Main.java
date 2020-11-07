package com.company.cloneSerializ.CloneDogAndSerialExternalTogether;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Horse horse = new Horse("white", 150, 10, "Altai", 165);
        System.out.println(horse + "\n");

        try {
            System.out.println("used Serializable");
            horse.serialize();
            Horse.deserialize();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        Cat cat = new Cat("ginger", 7, 3, "Mars", "Pers");
        System.out.println(cat + "\n");
        System.out.println("used Externalizable");
        try {
            cat.serialize();
            Cat.deserialize();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        Dog dog1 = new Dog("black", 15, 5, "Boston", DogBreedEnum.BIGL, new DogBreedClass("Bigl"), true);
        Dog dog2 = new Dog("brown", 10, 2, "Kim", DogBreedEnum.TERRIER, new DogBreedClass("Terrier"), false);
        cloneDog(dog1);
        System.out.println(dog1+ "\n");
        cloneDog(dog2);
        System.out.println(dog2+ "\n");

    }


    public static void cloneDog(Dog dog) {
        try {
            dog = (Dog) dog.clone();
            dog.setBreedEnum(DogBreedEnum.SPANIEL);
            dog.getBreedClass().setName("Spaniel");

        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Clone: " + dog );

    }
}

