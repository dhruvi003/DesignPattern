package creational;

import utils.CustomLogger;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class Square implements Shape {
    @Override
    public void draw() {
        Logger logger = System.getLogger(Square.class.getName());
        logger.log(Level.INFO, "Drawing a Square");
        System.out.println("Square drawn.");
    }
}
