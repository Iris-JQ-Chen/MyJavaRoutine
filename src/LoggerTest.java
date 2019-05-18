import sun.net.www.protocol.http.logging.HttpLogFormatter;

import java.io.IOException;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTest {

    private static Logger logger = Logger.getLogger("LoggerTest");
    static{
        logger.setLevel(Level.ALL);
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("LoggerTest.log");
        } catch (IOException e) {
            e.printStackTrace();
        }
        fileHandler.setLevel(Level.ALL);
        fileHandler.setFormatter(new HttpLogFormatter());
        logger.addHandler(fileHandler);
        logger.info("log准备就绪！");
    }

    public static void main (String args[]){
        LoggerTest logTest = new LoggerTest();
        logTest.getRandom();
    }


    private boolean getRandom(){
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 1){
            logger.info("得到“真”"+i);
            return true;
        }else {
            logger.log(Level.INFO,"得到“假”"+i);
            return false;
        }
    }

}
