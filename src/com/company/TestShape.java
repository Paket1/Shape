package com.company;

public class TestShape {
    public static void main(String[] args) {
        Shape Round = new Shape('r');
        Round.getV();
        Round.getE();
        Shape Square = new Shape('s');
        Square.getV();
        Square.getE();
        Shape Triangle = new Shape('t');
        Triangle.getV();
        Triangle.getE();
        Shape Another = new Shape('b');
        Another.getV();
        Another.getE();
    }
}