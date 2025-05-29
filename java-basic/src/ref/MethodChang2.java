package ref;

public class MethodChang2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 DataA.value : " + dataA.value);
        changeRefrence(dataA);
        System.out.println("메서드 호출 후 DataA.value : " + dataA.value);
    }
    static void changeRefrence(Data dataX) {
        dataX.value = 20 ;
    }
}
