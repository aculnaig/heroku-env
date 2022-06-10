package com.bytecode.heroku;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.getenv().forEach((k, v) -> System.out.printf("%s=%s\n", k, v));
    }
}
