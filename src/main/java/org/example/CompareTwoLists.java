package org.example;

public class CompareTwoLists {

    NumList list1;
    NumList list2;

    public CompareTwoLists(NumList list1, NumList list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public void byArithmeticMean() {
        Double arithmeticMean1 = list1.calculateTheArithmeticMeanOfTheList();
        Double arithmeticMean2 = list2.calculateTheArithmeticMeanOfTheList();

        if (arithmeticMean1 > arithmeticMean2){
            System.out.println("Первый список имеет большее среднее значение");
        }
        else if (arithmeticMean1.equals(arithmeticMean2)){
            System.out.println("Средние значения равны");
        }
        else {
            System.out.println("Второй список имеет большее среднее значение");
        }
    }
}
