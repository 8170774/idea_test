package com.test;

public class Test extends TestServiceImpl {

  public static void main(String[] args) {
    SelectInterface<String, ?> s = new Test();

    System.err.println(s.operF1120("123"));
  }

  @Override
  public Integer operF1120(String p) {
    return 234;
  }

}
