package ru.geekbrains.lesson1.store3D.models;

import java.lang.reflect.Type;
import java.net.Proxy;
import java.util.*;

public class Scene {
    private static int counter;
    private final int id;

    private List<PoligonalModel> poligonalModels;
    private List<Flash> flashes;
    private List<Camera> cameras;

    static {
        counter = 0;
    }

    public Scene(List<PoligonalModel> poligonalModels, List<Flash> flashes, List<Camera> cameras) {

        if (poligonalModels.size() < 1){
            throw new RuntimeException("At least one polygonal model is needed.");
        }

        if (cameras.size() < 1){
            throw new RuntimeException("At least one camera is needed.");
        }

        this.id = ++counter;
        this.poligonalModels = poligonalModels;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public Scene(List<PoligonalModel> poligonalModels, List<Camera> cameras) {
        this(poligonalModels,new ArrayList<>(),cameras);
    }

    public int getId() {
        return id;
    }


    public Type method1(Type type) {
        return type;
    }


    public Type method2(Type type1,Type type2) {
        return type1;
    }

}
