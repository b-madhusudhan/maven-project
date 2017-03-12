package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

/**
* @param name string
* @return greeting with name passed as parameter 

*/
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
