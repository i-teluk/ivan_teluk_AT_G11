package main.homework.day1.basetask;

public class TrainMethodsReturn {
    public void returnNewInt(int i) {
        i = i * 3;
        System.out.println(i);
    }

    public void returnNewLong(long l) {
        l = l - 4;
        System.out.println(l);
    }

    public void returnNewChar(char c) {
        System.out.println(c + " " + c);
    }

    public void returnNewFloat(float f) {
        f = f / 2;
        System.out.println(f);
    }

    public void returnNewDouble(double d) {
        d = d + 8;
        System.out.println(d);
    }

    public void returnNewShort(short s) {
        s = (short) (s - 1);
        System.out.println(s);
    }

    public void returnNewByte(byte b) {
        b = (byte) (b * 2);
        System.out.println(b);
    }

    public void returnNewBoolean(boolean b) {
        b = !b;
        System.out.println(b);
    }
}
