package dev.paula.design_patterns_builder;

public class HouseDirector {
    
    private final IBuilder builder;

    public HouseDirector(IBuilder builder) {
        this.builder = builder;
    }

    public HouseEntity constructSimpleHouse() {
        builder.reset();
        return builder
               .hasGarage()
               .build();
    }

    public HouseEntity constructSummerHouse() {
        builder.reset();
        return builder
               .hasPool()
               .build();
    }

    public HouseEntity constructRusticHouse() {
        builder.reset();
        return builder
               .hasGarden()
               .build();
    }

    public HouseEntity constructFancyHouse() {        
        builder.reset();
        return builder
               .hasStatues()
               .build();
    }
}
