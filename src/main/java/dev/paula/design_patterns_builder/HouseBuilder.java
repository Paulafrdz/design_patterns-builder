package dev.paula.design_patterns_builder;

public class HouseBuilder implements IBuilder {

    private HouseEntity house;

    public void reset() {
    this.house = new HouseEntity();
    }   

    @Override
    public HouseBuilder hasPool() {
        house.setHasPool(true); 
        return this;
    }

    @Override
    public HouseBuilder hasStatues() {
        house.setHasStatues(true); 
        return this;
    }

    @Override
    public HouseBuilder hasGarage() {
        house.setHasGarage(true); 
        return this;
    }

    @Override
    public HouseBuilder hasGarden() {
        house.setHasGarden(true); 
        return this;
    }

    @Override
    public HouseEntity build() {
        return this.house;
    }
}
