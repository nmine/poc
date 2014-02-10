package be.nmine.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	public static final Logger LOG = LoggerFactory.getLogger(App.class);
	
    public static void main( String[] args )
    {
        LOG.info("test logging... {}", "arg1");
    }
}
