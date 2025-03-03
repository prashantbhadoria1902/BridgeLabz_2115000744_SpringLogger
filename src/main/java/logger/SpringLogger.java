package logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpringLogger {
    private static final Logger logger = LoggerFactory.getLogger(SpringLogger.class);

    public static void main(String[] args) {
        logger.info("Application started...");
        logger.debug("This is a debug message");
        logger.warn("This is a warning message");
        logger.error("This is an error message");
    }
}
