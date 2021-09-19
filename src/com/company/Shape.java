package com.company;

public class Shape {
    private char Type; //будет 3 типа фигуры с разными параметрами - круг(r-round), квадрат(s-square), треугольник(triangle)
    private int NumberOfV;//число вершин в фигуре
    private char NumberOfEdges;//число ребер фигуры

    public Shape(char Type){
        switch(Type){
            case('r'):
                NumberOfV = 0;
                NumberOfEdges = 'i';// i - infinite
                break;
            case('s'):
                NumberOfV = 4;
                NumberOfEdges = '4';
                break;
            case('t'):
                NumberOfV = 3;
                NumberOfEdges = '3';
                break;
            default:
                NumberOfEdges = 'e';//e - error

        }

    }
    public void getV(){
        if((NumberOfV==0)|(NumberOfV==4)|(NumberOfV==3))
        {
            System.out.println(NumberOfV);
        }
        else
        {
            System.out.println("Error");
        }
    }
    public void getE(){
        switch(NumberOfEdges)
        {
            case('i'):
                System.out.println("Infinite");
                break;
            case('4'):
                System.out.println("Four");
                break;
            case('3'):
                System.out.println("Three");
                break;
            default:
                System.out.println("Error");
        }

    }
}
