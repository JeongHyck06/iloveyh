package oop1;

public class ValueData {
    int value;

    void add(ValueData valueData) {
        value++;
        System.out.println("숫자 증가 value: " + valueData.value);
    }
}
