package com.example.bt_th5_listviewnc;

public class Fruit {
    private String title;
    private String description;
     private int imag;

    public Fruit() {
    }

    public Fruit(String title, String description, int imag) {
        this.title = title;
        this.description = description;
        this.imag = imag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImag() {
        return imag;
    }

    public void setImag(int imag) {
        this.imag = imag;
    }
}
