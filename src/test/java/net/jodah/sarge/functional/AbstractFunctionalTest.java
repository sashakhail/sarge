package net.jodah.sarge.functional;

import net.jodah.sarge.Sarge;

import org.testng.annotations.BeforeMethod;

abstract class AbstractFunctionalTest {
  protected Sarge sarge;

  @BeforeMethod
  protected void beforeMethod() {
    sarge = new Sarge();
  }
}