package dev.paula.design_patterns_builder;


public class HouseEntity {

    private Boolean hasPool;
    private Boolean hasGarden;
    private Boolean hasGarage;
    private Boolean hasStatues;

    public static HouseBuilder builder() {
        return new HouseBuilder();
    }

    public Boolean hasPool() {
       return hasPool;
    }
  
    public void setHasPool(Boolean hasPool) {
        this.hasPool = hasPool;
    }

    public Boolean hasGarden() {
        return hasGarden;
    }

    public void setHasGarden(Boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    public Boolean hasGarage() {
        return hasGarage;
    }

    public void setHasGarage(Boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public Boolean hasStatues() {
        return hasStatues;
    }

    public void setHasStatues(Boolean hasStatues) {
        this.hasStatues = hasStatues;
    }

    
    @Override
    public String toString() {
        return "HouseEntity [pool=" + hasPool + ", garden=" + hasGarden + ", garage=" + hasGarage + ", statues=" + hasStatues + "]";
    }
}
