import java.util.List;
public class NumList {

    List<Double> list;

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
}
