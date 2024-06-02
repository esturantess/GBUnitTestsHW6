package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
public class CompareTwoListsTest {

  private final PrintStream standardOut = System.out;
  private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

  @BeforeEach
  public void setUp() {
    System.setOut(new PrintStream(outputStreamCaptor));
  }

  @Test
  public void compareTwoListsFirstArithmeticMeanIsGreaterTest() {
    NumList numList1 = new NumList(Arrays.asList(250.4, 11.0, 134.56, 175.0));
    NumList numList2 = new NumList(Arrays.asList(11.0, 99.1));
    CompareTwoLists compareTwoLists = new CompareTwoLists(numList1, numList2);
    compareTwoLists.byArithmeticMean();
    Assertions.assertEquals("Первый список имеет большее среднее значение", outputStreamCaptor.toString().trim());
  }

  @Test
  public void compareTwoListsArithmeticMeansAreEqualTest() {
    NumList numList1 = new NumList(Arrays.asList(250.4, 11.0, 134.56, 175.0));
    NumList numList2 = new NumList(Arrays.asList(250.4, 11.0, 134.56, 175.0));
    CompareTwoLists compareTwoLists = new CompareTwoLists(numList1, numList2);
    compareTwoLists.byArithmeticMean();
    Assertions.assertEquals("Средние значения равны", outputStreamCaptor.toString().trim());
  }

  @Test
  public void compareTwoListsSecondArithmeticMeanIsGreaterTest() {
    NumList numList1 = new NumList(Arrays.asList(-250.4, -11.0));
    NumList numList2 = new NumList(Arrays.asList(250.4, 11.0, 134.56, 175.0));
    CompareTwoLists compareTwoLists = new CompareTwoLists(numList1, numList2);
    compareTwoLists.byArithmeticMean();
    Assertions.assertEquals("Второй список имеет большее среднее значение", outputStreamCaptor.toString().trim());
  }

  @Test
  public void emptyListsArithmeticMeanCompareTest() {
    NumList numList1 = new NumList(Arrays.asList());
    NumList numList2 = new NumList(Arrays.asList());
    CompareTwoLists compareTwoLists = new CompareTwoLists(numList1, numList2);
    compareTwoLists.byArithmeticMean();
    Assertions.assertEquals("Средние значения равны", outputStreamCaptor.toString().trim());
  }

  @AfterEach
  public void tearDown() {
    System.setOut(standardOut);
  }
}
