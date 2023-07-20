package FinalWork;

import java.util.logging.*;

public class CalculatorLogger {
    private static final Logger LOGGER = Logger.getLogger(CalculatorLogger.class.getName());

    public static void log(String message) {
        LOGGER.log(Level.INFO, message);
    }
}

