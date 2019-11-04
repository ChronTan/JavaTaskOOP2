package com.netcracker;

public class MyPolinomial {
//    private double[] coeffs={2.0,5.0,3.0};
    String pnl="";

    public MyPolinomial(double[] coeffs) {
       for(int i=coeffs.length-1;i>=0;i--){
               this.pnl+="+ "+coeffs[i]+"x^"+(i+1);
       }
    }

    @Override
    public String toString() {
        return "MyPolinomial: " +
                 pnl;
    }

    public static void main(String[] args) {
        double[] mas={2.0,5.0,3.0};
        MyPolinomial mp=new MyPolinomial(mas);
        System.out.println(mp.pnl);
        mp.toString();
    }
}
