package com.example.cw7;

public class Pokemon {

    String Name;
    int Image;
    int Attack;
    int Defence;
    int Total;

    public Pokemon(String name, int image, int attack, int defence, int total) {
        Name = name;
        Image = image;
        Attack = attack;
        Defence = defence;
        Total = total;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public int getAttack() {
        return Attack;
    }

    public void setAttack(int attack) {
        Attack = attack;
    }

    public int getDefence() {
        return Defence;
    }

    public void setDefence(int defence) {
        Defence = defence;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }
}
