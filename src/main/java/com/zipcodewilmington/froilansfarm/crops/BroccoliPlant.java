package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.edible.Broccoli;
import com.zipcodewilmington.froilansfarm.edible.Corn;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public class BroccoliPlant extends Crop {

    public BroccoliPlant(){

    }

    //IF isFertilized is true and isHarvested is false -> DONE
    //Then return a Corn, and set isHarvested to true -> DONE
    //caller will need to store returned food object some place
    public Edible yield() {
        if(isFertilized() && !isHarvested()){
            harvestCrop();
            return new Broccoli();
        }
        else{
            return null;
        }
    }

    @Override
    public String toString(){
        return "Broccoli Plant";
    }
}