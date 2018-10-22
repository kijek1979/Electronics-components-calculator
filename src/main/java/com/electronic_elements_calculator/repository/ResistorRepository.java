package com.electronic_elements_calculator.repository;

import com.electronic_elements_calculator.model.Resistor;

import java.util.ArrayList;
import java.util.List;

public abstract class ResistorRepository implements ElementRepository {

    protected List<Resistor> resistorList = new ArrayList<>();

    public List<Resistor> getResistorList() {
        return resistorList;
    }


    public abstract Resistor elementAddToList(Object o);


    public abstract void elementRemoveFromList(int index);



}
