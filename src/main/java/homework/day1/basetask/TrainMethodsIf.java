package homework.day1.basetask;

public class TrainMethodsIf {
    public void returnNewInt(int i) {
        if (i < 8) {
            i = i * 7;
            System.out.println(i);
        } else {
            i = i / 4;
            System.out.println(i);
        }
    }

    public void returnNewLong(long l) {
        if (l > 300L) {
            l = l - 300;
            System.out.println(l);
        } else {
            l = l + 20;
            System.out.println(l);
        }
    }

    public void returnNewChar(char c) {
        if (c == 'g') {
            System.out.println(c + "o");
        } else {
            System.out.println("o" + c);
        }
    }

    public void returnNewFloat(float f) {
        if (f == (float) 0.67) {
            System.out.println(f);
        } else {
            f = f * 2;
            System.out.println(f);
        }
    }

    public void returnNewDouble(double d) {
        if (d > 30 & d < 80) {
            d = d + 87;
            System.out.println(d);
        } else if (d > 80 & d < 400) {
            d = d - 87;
            System.out.println(d);
        } else if (d > 400) {
            d = d / 4;
            System.out.println(d);
        } else {
            System.out.println(d);
        }
    }

    public void returnNewBoolean(boolean b) {
        if (b) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }
}
