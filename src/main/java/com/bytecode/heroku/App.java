package com.bytecode.heroku;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("[START] ENVIRONMENT_VARIABLES");
        System.getenv().forEach((k, v) -> System.out.printf("%s=%s\n", k, v));
        System.out.println("[END] ENVIRONMENT_VARIABLES");
    }
}
