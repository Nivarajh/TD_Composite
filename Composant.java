package fr.miage;

import java.util.ArrayList;

/**
 * Created by nijeyaku on 08/11/2016.
 */
public  abstract class Composant<T> {

    String sujet;
    ArrayList<T> composite;


    public Composant()
    {

    }

    public void add(T t)
    {
        composite.add(t);
    }


    public void remove(T t)
    {
        composite.remove(t);
    }

    public void size()
    {
        composite.size();
    }

}

