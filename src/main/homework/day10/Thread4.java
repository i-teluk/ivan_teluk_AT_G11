package main.homework.day10;

import java.util.ArrayList;
import java.util.List;

public class Thread4 {
    public static void main(String[] str) {
        new Thread(
                () -> {
                    List<Mouse> miceList = new ArrayList<>();
                    for (int i = 1; i <= 380; i++) {
                        miceList.add(new Mouse(i));
                    }

                    for (int i = 0; i < 7; i++) {
                        new Thread(
                                () -> {
                                    while (!miceList.isEmpty()) {
                                        Mouse mouse;
                                        synchronized (miceList) {
                                            if (miceList.isEmpty()) {
                                                break;
                                            } else {
                                                mouse = miceList.removeFirst();
                                                mouse.peep();
                                            }
                                        }
                                        try {
                                            Thread.sleep(250);
                                        } catch (InterruptedException e) {
                                            throw new RuntimeException(e);
                                        }
                                    }
                                }
                        ).start();
                    }
                }
        ).start();
    }
}
