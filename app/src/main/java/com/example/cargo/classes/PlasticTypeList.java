package com.example.cargo.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlasticTypeList {
    private ArrayList<PlasticType> plasticTypes = new ArrayList<PlasticType>(
            Arrays.asList(
                    new PlasticType("PET plastics are transparent \nPET plastics are infinitely recyclable\nMassively linked to plastic pollution", "Found in:\nWater and soda bottles \nPackaging, clothes, wipes", "Tips to avoid:\nRefuse single-use plastics and use non-plastic counterparts\nWear natural textiles like cotton\nUse alternate packaging like paper", "Rating: SAFE"),
                    new PlasticType("type 2 desc", "type 2 found in", "type 2 tips to avoid", "Rating: SAFE"),
                    new PlasticType("type 3 desc", "type 3 found in", "type 3 tips to avoid", "Rating: SAFE"),
                    new PlasticType("type 4 desc", "type 4 found in", "type 4 tips to avoid", "Rating: SAFE"),
                    new PlasticType("type 5 desc", "type 5 found in", "type 5 tips to avoid", "Rating: SAFE"),
                    new PlasticType("type 6 desc", "type 6 found in", "type 6 tips to avoid", "Rating: SAFE"),
                    new PlasticType("type 7 desc", "type 7 found in", "type 7 tips to avoid", "Rating: SAFE"))
    );

    public PlasticType GetPlasticType(int plasticType) throws Exception {
        if(plasticType < 1 || plasticType > 7)
            throw new Exception("Plastic type must be between 1-7.");
        else
            return plasticTypes.get(plasticType - 1);
    }


}
