# Builder pattern
<br>

## Instrucciones:
Partiendo de la entidad "House" deberás implementar el patrón de diseño Builder para permitir que la entidad "House" pueda construir diferentes tipos de casas, según las características mostradas en el diagrama proporcionado. Cada tipo de casa debe representar una combinación específica de atributos (garage, jardín, piscina, estatuas decorativas, etc.).

El objetivo es que el proceso de construcción sea flexible, escalable y desacoplado, siguiendo los principios de diseño orientado a objetos.

<img width="900" height="525" alt="image" src="https://github.com/user-attachments/assets/4d0cf5cb-a854-479e-9c67-fde52e4e63ff" />

<br>

## Class Diagram

```mermaid
classDiagram
    class HouseEntity {
        -Boolean hasPool
        -Boolean hasGarden
        -Boolean hasGarage
        -Boolean hasStatues
        +setHasPool(Boolean)
        +setHasGarden(Boolean)
        +setHasGarage(Boolean)
        +setHasStatues(Boolean)
        +toString() String
        +builder() HouseBuilder
    }

    class IBuilder {
        +hasPool() HouseBuilder
        +hasGarden() HouseBuilder
        +hasGarage() HouseBuilder
        +hasStatues() HouseBuilder
        +build() HouseEntity
        +reset()
    }

    class HouseBuilder {
        -HouseEntity house
        +hasPool() HouseBuilder
        +hasGarden() HouseBuilder
        +hasGarage() HouseBuilder
        +hasStatues() HouseBuilder
        +build() HouseEntity
        +reset()
    }

    class HouseDirector {
        -IBuilder builder
        +constructSimpleHouse() HouseEntity
        +constructSummerHouse() HouseEntity
        +constructRusticHouse() HouseEntity
        +constructFancyHouse() HouseEntity
    }

    HouseBuilder --> HouseEntity
    HouseBuilder ..|> IBuilder
    HouseDirector --> IBuilder
```
<br>

## Test Covegare
<img width="400" height="210" alt="image" src="https://github.com/user-attachments/assets/3a0f20dd-d8dd-41f7-9bc9-a0ccb01533c5" />
