package com.test;

public abstract class TestServiceImpl implements SelectInterface<String, Integer> {

  @Override
  public Integer operF1120(String p) {
    return 1;
  }

  public void test(SelectInterface<? extends String, ? super Integer> s) {

  }
}
