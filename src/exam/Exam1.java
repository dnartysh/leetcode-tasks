package exam;

import java.util.ArrayList;
import java.util.List;

public class Exam1 {
    public final int HH = 23;
    public final int MM = 59;
    public final int MIN_HH_AND_MM = 0;

    StringBuilder sb = new StringBuilder();
    public List<Integer> hhList = new ArrayList<>();
    public List<Integer> mmList = new ArrayList<>();

    public String largestTimeFromDigits(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int first = arr[i];

            for (int j = arr.length - 1; j >= 0; j--) {
                int second = arr[j];
                String numberString = String.valueOf(first) + String.valueOf(second);
                int numberValue = Integer.parseInt(numberString);

                if (numberValue <= HH && numberValue >= MIN_HH_AND_MM && i != j) {
                    hhList.add(numberValue);
                }

                if (numberValue <= MM && numberValue >= MIN_HH_AND_MM && i != j) {
                    mmList.add(numberValue);
                }
            }
        }

        hhList.sort((o1, o2) -> {
            if (o1 < o2) {
                return -1;
            } else if (o1 > o2) {
                return 1;
            }

            return 0;
        });

        mmList.sort((o1, o2) -> {
            if (o1 < o2) {
                return -1;
            } else if (o1 > o2) {
                return 1;
            }

            return 0;
        });

        if (mmList.size() != 0 && hhList.size() != 0) {
            String h1 = String.valueOf(hhList.get(hhList.size() - 1)).substring(0, 1);
            String h2 = String.valueOf(hhList.get(hhList.size() - 1)).substring(1, 2);
            sb.append(hhList.get(hhList.size() - 1));
            sb.append(":");

            for (int i = mmList.size() - 1; i >= 0; i--) {
                if (!String.valueOf(mmList.get(i)).contains(h1) && !String.valueOf(mmList.get(i)).contains(h2)) {
                    sb.append(mmList.get(i));
                    break;
                }
            }
        }

        return sb.toString();
    }
}
