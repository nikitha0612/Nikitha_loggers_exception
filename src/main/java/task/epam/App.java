package task.epam;

import java.util.logging.LogManager;
import java.util.logging.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
	static final Logger LOGGER = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        LOGGER.info( "Hello World!" );
    }
}
