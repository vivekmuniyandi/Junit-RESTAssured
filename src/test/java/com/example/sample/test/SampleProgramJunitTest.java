package com.example.sample.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.example.sample.SampleProgram;

public class SampleProgramJunitTest {

  static SampleProgram s;

  @BeforeClass
  public static void setup() {
    s = new SampleProgram();
  }

  @Test
  public void testAdd() {
    assertEquals(4, s.add(2, 2));
  }

  @Test
  public void testSubtract() {
    assertEquals(10, s.subtract(15, 5));
  }

  @Test
  public void testMultiply() {
    assertEquals(6, s.multiply(3, 2));
    assertTrue(s.multiply(4, 2) == 8);
  }

  // @Test
  public void failingTest() {
    assertFalse(9 == s.add(4, 5));
  }

  @Test
  public void testDivide() {
    assertEquals(4.0, s.divide(16, 4), 0.0002);
    try {
      s.divide(10, 0);
      fail("Should have thrown an illegal argument exception");
    } catch (IllegalArgumentException e) {
      System.out.println("Expected exception because it is a divide by zero error");
    }
  }
}
