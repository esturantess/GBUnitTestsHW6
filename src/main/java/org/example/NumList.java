package org.example;

import java.util.List;

public class NumList {
  private List<Double> list;

  public NumList(List<Double> list) {
    this.list = list;
  }

  public Double calculateTheArithmeticMeanOfTheList() {
    double sum = 0;
    for (Double aDouble : list) {
      sum += aDouble;
    }
    return sum / list.size();
  }

  @Override
  public String toString() {
    return "list = " + list;
  }

  public List<Double> getList() {
    return list;
  }

  public void setList(List<Double> list) {
    this.list = list;
  }
}
