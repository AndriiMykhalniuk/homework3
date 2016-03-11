package com.goit.gojavaonline;

import java.util.List;

/**
 * Created by amikhalnyuk on 11.03.2016.
 */
public class Music_store  {
    private List<Guitar> Guitar;
    private List<Piano> Piano;
    private List<Tromba> Tromba;

    public List<com.goit.gojavaonline.Guitar> getGuitar() {
        return Guitar;
    }

    public void setGuitar(List<com.goit.gojavaonline.Guitar> guitar) {
        Guitar = guitar;
    }

    public List<com.goit.gojavaonline.Piano> getPiano() {
        return Piano;
    }

    public void setPiano(List<com.goit.gojavaonline.Piano> piano) {
        Piano = piano;
    }

    public List<com.goit.gojavaonline.Tromba> getTromba() {
        return Tromba;
    }

    public void setTromba(List<com.goit.gojavaonline.Tromba> tromba) {
        Tromba = tromba;
    }
}
