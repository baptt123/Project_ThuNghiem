import org.apache.logging.log4j.LogManager;

import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppController {

    private static final Logger LOGGER = Logger.getLogger(AppController.class.getName());

    public static void main(String[] args) {
        LOGGER.fine("Debug log message");
        divide(4, 2);
        divide(4, 0);
        LOGGER.fine("Fatal log message");
    }

    public static void divide(int number1, int number2) {
        try {
            int number = number1 / number2;
            LOGGER.fine("Info: {} / {} = {}");
        } catch (ArithmeticException e) {
            String message = MessageFormat.format("Error: Cannot divide two number {0}/{1}", number1, number2);
            LOGGER.finest(message);
        }
    }
}
