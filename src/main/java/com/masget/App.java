package com.masget;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Logger log = Logger.getLogger(App.class);

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        log.debug("Test Log........");
    }
}
