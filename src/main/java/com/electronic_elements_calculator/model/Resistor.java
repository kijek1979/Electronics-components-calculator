package com.electronic_elements_calculator.model;


public class Resistor {




    private Long id;
    private ResistorStrapsColors strap1;
    private ResistorStrapsColors strap2;
    private ResistorStrapsColors multiplier;
    private ResistorStrapsColors tolerance;


    public Resistor() {
    }

    public Resistor(Long id, ResistorStrapsColors strap1, ResistorStrapsColors strap2,
                    ResistorStrapsColors multiplier,ResistorStrapsColors tolerance) {
        this.strap1 = strap1;
        this.strap2 = strap2;
        this.multiplier = multiplier;
        this.tolerance = tolerance;
        this.id = id;
    }

    public Resistor(ResistorStrapsColors strap1, ResistorStrapsColors strap2,
                    ResistorStrapsColors multiplier, ResistorStrapsColors tolerance) {
        this.strap1 = strap1;
        this.strap2 = strap2;
        this.multiplier = multiplier;
        this.tolerance = tolerance;
    }

    public Long getId() {
        return id;
    }

    public ResistorStrapsColors getStrap1() {
        return strap1;
    }

    public ResistorStrapsColors getStrap2() {
        return strap2;
    }

    public ResistorStrapsColors getMultiplier() {
        return multiplier;
    }

    public ResistorStrapsColors getTolerance() {
        return tolerance;
    }


}
