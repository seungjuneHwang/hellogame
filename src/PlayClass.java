import java.util.Scanner;

public class PlayClass {
    // 멤버 변수
    private Scanner sc;
    // 생성자
    public PlayClass(){
        sc = new Scanner(System.in);
    }
//    public PlayClass(String name){}

    // 메소드 만들기
    public int play1(String name) {
//        String name = "도라";
        System.out.println(name + "이 설정 되었습니다.");
        System.out.println(name + "이 여행을 떠난다");
        // 가다가 퉁퉁이를 만났다
        System.out.println(name + "이 길을 가다가 퉁퉁이를 만났다");
        // 1. 싸운다 2. 도망간다
        System.out.println("1. 싸운다 2. 도망간다");
        System.out.print("입력: ");
        return sc.nextInt();
    }
    public int play2(int num) {
        int ret = 0;
        // 만약에  num 1 이면 싸운다
        if (num == 1) {
            System.out.println("싸우자");
            System.out.println("1. 공격 2. 아이템 사용 3. 방어");
            System.out.print("입력: ");
            ret = sc.nextInt();
        } else if (num == 2) {
            // 2면 도망간다
            System.out.println();
        } else {
            // 잘못
            System.out.println();
        }
        return ret;
    }

    public void play3(int num) {
        if (num == 1) {
            System.out.println("그냥 공격");
        } else if (num == 2) {
            System.out.println("아이템 사용");
        }
    }
}
