import java.util.Scanner;

public class HelloClass {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        System.out.println("안녕 자바야");
        // 위에 자바를 내가 입력한 글자로 바꾸고 싶다.
        // 구글에 자바 입력 검색
        // 스캐너라는게 나오네 이걸 복붙
        Scanner sc = new Scanner(System.in);  // 키보드로 부터 입력 받기 준비
//        System.out.print("입력: ");
//        String name = sc.next();   // 키보드로 부터 글자를 입력 받기
//        // 위에 name는 사용자가 입력한 글자가 저장이 된다.
//        // name 에 저장된 글을 출력을 해보자
//        System.out.println("안녕 " + name + "야");
        // 캐릭터 이름 설정
        System.out.println("캐릭터 이름 설정");
        System.out.print("이름 입력: ");
        String name = sc.next();
        // 도라에몽이 여행을 떠난다
        System.out.println(name + "이 설정 되었습니다.");
        System.out.println(name + "이 여행을 떠난다");
        // 가다가 퉁퉁이를 만났다
        System.out.println(name + "이 길을 가다가 퉁퉁이를 만났다");
        // 1. 싸운다 2. 도망간다
        System.out.println("1. 싸운다 2. 도망간다");
        // 만약에 1번을 입력하면
        System.out.print("선택: ");
        int num = sc.nextInt();    // 숫자를 입력
        if (num == 1) {   // 싸운다 선택
            System.out.println("싸우자 덤벼라 퉁퉁아!");
            System.out.println("1. 10번 콤보 공격 2. 아이템 사용 3. 방어");
            System.out.print("선택: ");
            num = sc.nextInt();   // 숫자 입력받기
            // 만약에 1번이면 10번을 공격을한다.
            if (num == 1) {
                System.out.println("10번 콤보 공격!!");
                System.out.println("다다다다다다다다다");
            } else if (num == 2) {
                // 만약에 2번이면 아이템 메뉴가 출력이 되고 선택한 아이템으로 공격
                System.out.println("아이템 사용 아이템 메뉴가 나와서 선택해서 공격");

            } else if (num == 3) {
                // 3번이면 방어를 하고 퉁퉁이가 나를 공격한다
                System.out.println("방어 모드");
                System.out.println("퉁퉁이가 다다다다다다다다다다");
                System.out.println("퉁퉁이가 필살기를 사용하여 승!!");
            } else {
                System.out.println("잘못 입력 게임오버~");
            }
        } else if (num == 2) {  // 2번을 입력하면
            // 도망간다
            System.out.println("미안 퉁퉁아 도망가께~");
            System.out.println("게임 오버!");
        } else {
            System.out.println("잘 못 입력 게임오버!");
        }


        // 1번이면
        // 1. 10번 콤보 공격 2. 아이템 사용 3. 방어

    }
}

