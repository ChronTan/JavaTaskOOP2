package com.netcracker.moveBall;

public class Testing {

    public static void main(String[] args) {
        Ball ball=new Ball(3,1,2,3,45);
        Container container=new Container(3,8,8,5);
        System.out.println("coordinates сontainer top side: "+ container.getX1()+","+container.getY1()+"; "
                + container.getX1()+","+container.getY1());
        System.out.println(ball.getX()+","+ ball.getY()+ ": "+ container.collidesWidth(ball));
        ball.reflectVertical();
        ball.move();
        System.out.println(ball.getX()+","+ ball.getY()+ ": "+ container.collidesWidth(ball));
        ball.move();
        System.out.println(ball.getX()+","+ ball.getY()+ ": "+ container.collidesWidth(ball));
        System.out.println(container.getHeight());
        System.out.println(container.getWidth());
    }
}
