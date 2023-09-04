package ru.geekbrains.lesson1.store3D.models;

public class Angle3D {
    private Point3D target;

    private int horizonDev;
    private int verticalDev;

    public Angle3D(Point3D target, int horizonDev, int verticalDev) {
        this.target = target;
        this.horizonDev = horizonDev;
        this.verticalDev = verticalDev;
    }

    public Point3D getTarget() {
        return target;
    }

    public void setTarget(Point3D target) {
        this.target = target;
    }

    public Angle3D(Point3D target) {
        this(target,0,0);
    }

    public int getHorizonDev() {
        return horizonDev;
    }

    public void setHorizonDev(int horizonDev) {
        this.horizonDev = horizonDev;
    }

    public int getVerticalDev() {
        return verticalDev;
    }

    public void setVerticalDev(int verticalDev) {
        this.verticalDev = verticalDev;
    }
}
