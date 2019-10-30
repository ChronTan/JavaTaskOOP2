package com.netcracker.moveBall;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1=x;
        this.y1=y;
        this.x2=this.x1+width;
        this.y2=this.y1-height;
    }

    public int getX() {
        return x1;
    }
    public int getY() {
        return y1;
    }
    public int getHeight() {
        return y1-y2;
    }
    public int getWidth() {
        return Math.abs(x1-x2);
    }


    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void setX(int x1) {
        this.x1 = x1;
    }

    public boolean collidesWidth(Ball ball){
        boolean flag=false;
        if(ball.getX()+ball.getRadius()>=this.x1 && ball.getX()+ball.getRadius()<=this.x2 ){
            if(ball.getX()+ball.getRadius()>=this.y2 && ball.getY()+ball.getRadius()<=this.y1){
                flag=true;
            }
        }
        return flag;
    }

}
