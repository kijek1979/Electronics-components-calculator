package com.electronic_elements_calculator.model;

public enum TypeOfElement {

    RESISTOR("resistor"),
    CAPACITOR("capacitor");






    private String description;

     TypeOfElement(String opornik) {
         this.description = opornik;
    }

    public String getDescription() {
        return description;
    }
}
