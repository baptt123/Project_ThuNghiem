package Log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

public class LogTest {
    private static final Logger LOGGER= LogManager.getLogger(LogTest.class);
    public static void main(String[] args) throws IOException {
        LOGGER.fatal("Loi khong xuat hien");
    }
}
