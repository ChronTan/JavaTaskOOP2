package com.netcracker;

import java.util.Objects;

public class MyComplex {
    private double real=0.0;
    private double image=0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double image) {
        this.real = real;
        this.image = image;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImage() {
        return image;
    }

    public void setImage(double image) {
        this.image = image;
    }

    public void setValue(double real, double image){
        this.real = real;
        this.image = image;
    }

    @Override
    public String toString() {
        return "real+ image"+(real+image);                                    //не совсем понял как именно переопределить,уточнить на занятии
    }

    public boolean isReal(){
        boolean flag=false;
        if(real!=0){
            flag=true;
        }
        return  flag;
    }
    public boolean isImaginary(){
        boolean flag=false;
        if(image!=0){
            flag=true;
        }
        return  flag;
    }

    public boolean equals(double real, double image) {
        boolean flag=false;
        if(real==image){
            flag=true;
        }

        return flag;
    }
    public boolean equals(MyComplex another) {
        boolean flag=false;
        if(another.getReal()==another.getImage()){
            flag=true;
        }

        return flag;
    }
    public double magnitude(){
        double module=1;
        module=Math.sqrt(Math.pow(real,2)+ Math.pow(image,2));
        return module;
    }

    public double argument(){
        double agt=1;
        agt=Math.atan2(image,real);
        agt=agt*Math.PI/180;
        return agt;
    }

    public MyComplex add(MyComplex right){
        return right;
    }
    public MyComplex addNew(MyComplex right){
        right=new MyComplex(5.0,3.0);
        return right;
    }

    public static void main(String[] args) {

    }

}
