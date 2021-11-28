package com.company;

public class Rectangle {
    private Point corner;
    private int width;
    private int length;

    public Rectangle(Point corner, int width, int length) {
        this.corner = corner;
        this.width = width;
        this.length = length;
    }

    public Point getCorner() {
        return corner;
    }

    public void setCorner(Point corner) {
        this.corner = corner;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public Point getRightCorner (){
        Point a = getCorner();
        int b = getLength() + getLength();
        int c = getWidth() + getWidth();
          corner.setX(corner.getX() + c);
          corner.setY(corner.getY() + b);


        return getCorner();
    }
    public void Operational(){
    corner.setX(corner.getX()+1);

    }

    @Override
    public String toString() {
        return "Rectangle( " + corner + ")" + "," + "dimentions" + "[ " +
                width + "," + length + "]";
    }
}
