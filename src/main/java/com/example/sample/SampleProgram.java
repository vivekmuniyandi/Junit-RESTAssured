package com.example.sample;

public class SampleProgram {

  public long multiply(int a, int b) {
    return a * b;
  }

  public float divide(int a, int b) {
    if(b == 0)
      throw new IllegalArgumentException("b cannot be zero");
    return a / b;
  }
}
