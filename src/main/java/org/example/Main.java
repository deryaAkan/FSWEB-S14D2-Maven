package org.example;

import org.example.model.Bed;
import org.example.model.Bedroom;
import org.example.model.Ceiling;
import org.example.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        Bedroom bedroom = new Bedroom();
        bedroom.setName("Master Bedroom");
        bedroom.setBed(new Bed("Lovely", 3, 5, 6, 5));
        bedroom.setCeiling(new Ceiling(175, PaintColor.GREEN));
        System.out.println("Bedroom Name: " + bedroom.getName());
        System.out.println("Bed: " + bedroom.getBed());
        System.out.println("****************");
        System.out.println("Ceiling: " + bedroom.getCeiling());

    }
}