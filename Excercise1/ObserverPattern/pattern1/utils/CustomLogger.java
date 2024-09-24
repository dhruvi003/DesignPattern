package utils;

import java.util.logging.*;
import java.util.logging.Logger.*;

public class CustomLogger {
    private static final Logger logger = Logger.getLogger(CustomLogger.class.getName());

    public static void log(Level level, String message) {
        logger.log(level, message);
    }
}
