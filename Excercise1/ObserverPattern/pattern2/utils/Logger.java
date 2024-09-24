package utils;
import java.util.logging.*;



public class Logger {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Logger.class.getName());

    public static void log(Level level, String message) {
        logger.log(level, message);
    }
}
