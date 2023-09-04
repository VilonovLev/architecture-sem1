package ru.geekbrains.lesson1.store3D.models;

public class Flash {

    private Point3D location;
    private Angle3D angle;
    private Color color;
    private float power;

    private class Color{
        private int red;
        private int green;
        private int blue;

        public Color(int red, int green, int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }
    }

    {
        this.color = new Color(256, 256, 256);
        this.power = 50;
    }

    public Flash(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public void rotate(Angle3D angle) {
        this.angle = angle;
    }

    public void move(Point3D location) {
        this.location = location;
    }

    public void dimmer(float power) {
        this.power = power;
    }

    public void setColor(int red, int green, int blue) {
        color.red = red;
        color.green = green;
        color.blue = blue;
    }



}
