# Cheap Farming Simulator.
* General info
* Screenshots
* Technologies
* Features
* Code sample
* Status

## General info
Text game about farms.
## Screenshots
  ![Image of the game](https://github.com/SboTeaman/CheapFarmingSimulator/blob/master/farm.png)
## Technologies
Language: 
* Java

## Features
Player can:
* Buys Farms
* Buys Land
* Buys Silos
* Buys crops
* Buys animals
* Sell crops
* Sell animals
* Plant cropls
* Harvest crops
* Breed animals

## Code sample
```
public  void buySilos(Player player) {
        if (player.getCash() > this.getPrice()) {
            player.setCash(-this.getPrice());
            player.isSilos = true;
            System.out.println("You bought " + this.name);
        } else {
            System.out.println("You don't have money for " + this.name);
        }
    }
 ``` 
## Status
Project is: *finished*.
