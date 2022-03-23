package by.itland.itjava.materials.lesson18.patterns.structure.adapter;

public class AdapterJavaToDatabase extends JavaApplication implements Database {

    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }

}
