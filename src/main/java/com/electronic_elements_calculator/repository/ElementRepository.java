package com.electronic_elements_calculator.repository;

import com.electronic_elements_calculator.model.Resistor;


public interface ElementRepository {



     Resistor elementAddToList(Object o);

    void elementRemoveFromList(int index);




}
