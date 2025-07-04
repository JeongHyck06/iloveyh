package construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        Memberinit member1 = new Memberinit();
        initMember(member1,"user1",15,90);
//        member1.name = "user1";
//        member1.age = 10;
//        member1.grade = 20;

        Memberinit member2 = new Memberinit();
        member2.name = "user2";
        member2.age = 30;
        member2.grade = 40;

        Memberinit[] memberinits = new Memberinit[]{member1, member2};

        for (Memberinit s : memberinits) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }

    static void initMember(Memberinit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}
