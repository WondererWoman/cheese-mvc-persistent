package org.launchcode.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Erin DeVries on 4/10/2017.
 */
@Entity
public class Menu {

    @NotNull
    @Size(min = 3, max = 15)
    private String name;

    @Id
    @GeneratedValue
    private int id;

    @ManyToMany
    @JoinColumn
    private List<Cheese> cheeses = new ArrayList<>();

    public Menu() {
    }

    public Menu(String name) {
        this.name = name;
    }

    public void addItem(Cheese item){}

    public int getId() {
        return id;
    }

    public List<Cheese> getCheeses() {
        return cheeses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
