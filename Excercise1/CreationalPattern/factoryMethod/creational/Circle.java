package creational;

import utils.CustomLogger;
import java.util.logging.*;

public class Circle implements Shape {
    @Override
    public void draw() {
        Logger logger = (Logger) System.getLogger(Circle.class.getName());
        logger.log(Level.INFO, "Drawing a Circle");
        System.out.println("circle drawn.");
   }
}
