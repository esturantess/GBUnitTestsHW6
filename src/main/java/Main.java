import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        NumList numList1 = new NumList(Arrays.asList(1.0, 2.0, 3.0, 6.0));
        NumList numList2 = new NumList(Arrays.asList(1.0, 2.0, 3.0, 5.0));
        System.out.println(Arrays.asList(1.0, 2.0, 3.0, 6.0));
        System.out.println(numList1.calculateTheArithmeticMeanOfTheList());

        CompareTwoLists compareLists = new CompareTwoLists(numList1, numList2);

    }
}
