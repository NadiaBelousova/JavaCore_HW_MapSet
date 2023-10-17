import java.util.*;

public class Main {
    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

    public static void main(String[] args) {
        task1();
//        task11();
        task2();
        task3();
        task33();
        task4();
    }

    public static void task1() {
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.print(num);
            }
        }

        System.out.println(" ");
    }

//    public static void task11() {
//        for (Iterator<Integer> it = nums.iterator(); it.hasNext(); ) {
//            if (it.next() % 2 == 0) {
//                it.remove();
//
//            }
//        }
//        System.out.println(nums);
//    }
    public static void task2 () {
        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;
        for (int num : nums) {
        if (num % 2 == 0 && num!=prevNum) {
            System.out.print(num);
            prevNum=num;
        }

    }
        System.out.println(" ");
}
public static void task3() {
    String previosWord = " ";
    for (String string : strings) {
        if (!string.equals(previosWord)) {
            System.out.print(string + " ");
            previosWord = string;
        }

    }
}

    public static void task33() {
        Set <String> uniq= new HashSet <>(strings);
        System.out.println(uniq);
    }
public static void task4() {
    Set <String> uniq= new HashSet <>(strings);
    System.out.println(strings.size()-uniq.size());
}
}



