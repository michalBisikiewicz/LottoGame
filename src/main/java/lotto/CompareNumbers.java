package lotto;

import java.util.List;

public class CompareNumbers {

    public void listAreEqual(List list1, List list2) {
        if (list1.equals(list2)) {
            System.out.println("Numbers are matched!");
        } else {
            System.out.println("Numbers are not matched!");
        }
//        System.out.println(list1.equals(list2));
    }
}
