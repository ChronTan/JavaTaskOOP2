package com.netcracker;

public class MyPolinomial {
    private double[] coeffs;
    String pnl="";

    public MyPolinomial(double[] ... coeffs) {
       for(int i=0;i<coeffs.length;i++){
           this.pnl+=i+"x^"+(coeffs.length-i);
       }
    }

    public static void main(String[] args) {
        double[] mas={2.0,5.0,3.0};
        MyPolinomial mp=new MyPolinomial(mas);
        System.out.println(mp.pnl);
    }
}
