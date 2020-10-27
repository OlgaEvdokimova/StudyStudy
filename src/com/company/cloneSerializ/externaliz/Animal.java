package com.company.cloneSerializ.externaliz;

import java.io.*;
import java.util.Objects;

public class Animal implements Cloneable ,Externalizable {
    public static final long serialVersionUID = 2L;
    private String color;
    private int weight;
    private int age;

    public Animal() {
    }

    public Animal(String color, int weight, int age) {
        this.color = color;
        this.weight = weight;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        com.company.cloneSerializ.cloneANDSerializ.Animal clone = (com.company.cloneSerializ.cloneANDSerializ.Animal) super.clone();
        return clone;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isCat() {
        return true;
    }
    public boolean isHorse() {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return weight == animal.weight &&
                age == animal.age &&
                Objects.equals(color, animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, weight, age);
    }

    @Override
    public String toString() {
        return "color='" + color + '\'' +
                ", weight=" + weight +
                ", age=" + age + ", ";
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(color);
        out.writeObject(weight);
        out.writeObject(age);
    }
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.color = (String) in.readObject();
        this.weight = (Integer) in.readObject();
        this.age = (Integer) in.readObject();
    }
}

