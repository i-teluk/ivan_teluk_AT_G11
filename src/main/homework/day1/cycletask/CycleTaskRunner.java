package main.homework.day1.cycletask;

public class CycleTaskRunner {
    public static void main(String[] args) {
        WhileTask runner = new WhileTask();
        runner.whileTask();

        ForTask runner2 = new ForTask();
        runner2.forTask();

        ReadArray runner3 = new ReadArray();
        runner3.readArray();

        ReadArrayFromEnd runner4 = new ReadArrayFromEnd();
        runner4.readArrayFromEnd();

        MultiArray runner5 = new MultiArray();
        runner5.multiArray();

        SquareArray runner6 = new SquareArray();
        runner6.squareArray();

        MinArray runner7 = new MinArray();
        runner7.minArray();

        FirstAndLast runner8 = new FirstAndLast();
        runner8.firstAndLast();

        SortArray runner9 = new SortArray();
        runner9.sortArray();
    }
}
