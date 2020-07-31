package com.giacomini.factories;

import com.giacomini.products.GraphicCard;
import com.giacomini.products.MotherBoard;
import com.giacomini.products.Processor;

public interface ComputerDetailsFactory {
    MotherBoard createMotherBoard();
    Processor createProcessor();
    GraphicCard createGraphicCard();
}
