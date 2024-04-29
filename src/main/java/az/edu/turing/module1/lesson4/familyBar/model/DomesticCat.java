package main.java.az.edu.turing.module1.lesson4.familyBar.model;

import main.java.az.edu.turing.module1.lesson4.familyBar.other.Fouling;

import java.util.Set;

public class DomesticCat  extends Pet implements Fouling {

    public DomesticCat(String nickname) {
        super(nickname);
    }

    public DomesticCat(Species species, String nickname, int age, int trickLevel, Set<String> habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    public DomesticCat() {
    }

    @Override
    public void respond() {
        System.out.println("Meowwwwww");
    }

    @Override
    public void foul() {

    }
}