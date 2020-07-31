package com.giacomini.factories;

import com.giacomini.products.GraphicCard;
import com.giacomini.products.MotherBoard;
import com.giacomini.products.Processor;

public class GamerComputerDetailsFactory implements ComputerDetailsFactory {
    @Override
    public MotherBoard createMotherBoard() {
        // TODO: create a new gamer mother board (maybe b450)
        return null;
    }

    @Override
    public Processor createProcessor() {
        // TODO: create a new gamer processor (maybe ryzen 5 3600x)
        return null;
    }

    @Override
    public GraphicCard createGraphicCard() {
        // TODO: create a new gamer graphic card (maybe rtx 590 8gb)
        return null;
    }
}
