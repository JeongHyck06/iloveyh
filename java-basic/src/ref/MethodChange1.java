package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전 a : " + a);
        changeprimitive(a);
        System.out.println("메서드 호출 후 a : " + a);
    }
    static void changeprimitive(int x) {
        x = 20 ;
    }
}
