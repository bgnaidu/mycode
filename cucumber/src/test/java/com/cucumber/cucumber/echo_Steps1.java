package com.cucumber.cucumber;

import cucumber.api.java.en.Given;


import cucumber.api.java.en.Then;

public class echo_Steps1  {
	
	public String foo="Bar";
	
  @Given("^you are in Given annotation$")
  public void given() throws Throwable {
	  String foo;
  }

  @Then("^you are in Then annotation$")
  public void then() throws Throwable {
	  System.out.println(foo);
  }
  
  

}
