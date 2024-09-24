

import java.util.logging.*;
// import java.util.logging.Logger;

public class MyLogger {
    private static final Logger logger = Logger.getLogger(MyLogger.class.getName());

    public static void log(Level level, String message) {
        logger.log(level, message);
    }
}
