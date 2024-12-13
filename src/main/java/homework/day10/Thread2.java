package homework.day10;

import java.util.ArrayList;
import java.util.List;

public class Thread2 {
    public static void main(String[] str) {
        List<Mouse> miceList = new ArrayList<>();
        for (int i = 1; i <= 18; i++) {
            miceList.add(new Mouse(i));
        }

        for (int i = 0; i < 7; i++) {
            new Thread(() -> {
                for (int j = 0; j < miceList.size(); j++) {
                    if (j % 2 != 0) {
                        miceList.get(j).peep();
                    }
                }
            }).start();
        }
    }
}