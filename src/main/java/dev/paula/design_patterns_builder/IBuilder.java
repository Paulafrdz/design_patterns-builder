package dev.paula.design_patterns_builder;



public interface IBuilder {

    public  HouseBuilder hasPool();

    public HouseBuilder hasStatues();

    public HouseBuilder hasGarage();

    public HouseBuilder hasGarden();

    public HouseEntity build();

    public void reset();

}
