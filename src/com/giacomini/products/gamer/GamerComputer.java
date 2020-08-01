package com.giacomini.products.gamer;

import com.giacomini.factories.ComputerDetailsFactory;
import com.giacomini.products.Computer;

public class GamerComputer extends Computer {
    public GamerComputer(ComputerDetailsFactory detailsFactory) {
        this.motherBoard = detailsFactory.createMotherBoard();
        this.processor = detailsFactory.createProcessor();
        this.graphicCard = detailsFactory.createGraphicCard();
    }

    @Override
    public String getDescription() {
        return "This is a Gamer Computer:\n" + super.toString();
    }
}
