package com.giacomini.products;

public abstract class Computer {
    protected MotherBoard motherBoard;
    protected Processor processor;
    protected GraphicCard graphicCard;

    public abstract String getDescription();

    @Override
    public String toString() {
        return "Computer{" +
                "motherBoard=" + motherBoard +
                ", processor=" + processor +
                ", graphicCard=" + graphicCard +
                '}';
    }
}
