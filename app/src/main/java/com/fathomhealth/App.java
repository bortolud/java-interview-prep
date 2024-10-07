package com.fathomhealth;

public class App {

  public String getGreeting() {
    return "Hello Daniel!";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
  }
}
