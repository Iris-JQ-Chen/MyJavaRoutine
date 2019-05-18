import com.sun.org.apache.xerces.internal.parsers.BasicParserConfiguration;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jTest {

//    private static Logger logger1 = LogManager.getLogger(Log4jTest.class);
    private static org.apache.log4j.Logger logger2 = org.apache.log4j.Logger.getLogger(Log4jTest.class);

    public static void main (String args[]){
//        logger1.debug("第一个logger.debug");
////        System.out.println("第一个System.out");
////        logger1.error("第一个logger.error");
//        logger1.trace("第一个logger.trace");

        BasicConfigurator.configure();
        logger2.setLevel(Level.ALL);
        logger2.debug("第一个debug");
        logger2.error("第一个error");
        logger2.info("第一个info");

    }

}
