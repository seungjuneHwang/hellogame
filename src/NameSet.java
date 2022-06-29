import java.util.ArrayList;
import java.util.Scanner;

/**
 * 이름을 설정하는 클래스
 */
public class NameSet {
    private String name;
    private Scanner sc;
    private ArrayList<ItemClass> list = new ArrayList<>();
    public NameSet() {
        sc = new Scanner(System.in);
    }
    // 메소드
    public void setName() {
        System.out.println("이름 설정 기능");

        System.out.print("이름 설정: ");
        name = sc.next();   // 문자열 입력 받기
    }

    public String getName() {
        System.out.println("이름 출력 기능능");
        System.out.println(name + "아 안녕!!!");
        return name;
    }

    // 아이템 셋팅
    // 사용자가 원하는만큼 아이템 셋팅
    public void setItem() {
        System.out.println("몇개의 아이템을 사용하시겠습니까? ");
        System.out.print("갯수 입력(너무 많이 하면 힘들어요):");
        int n = sc.nextInt();
        // n 만큼 반복해서 아이템 입력

        for (int i=0; i<n; i++) {
            // 아이템을 담을 그릇을 만들고
            ItemClass ic = new ItemClass();
            System.out.print("이름입력: ");
            String it = sc.next();
            ic.setName(it);   // 이름을 담고
//            System.out.println(i + ". 아이템: " + it);
            System.out.print("속성입력: ");
            it = sc.next();
            ic.setAtt(it);  // 속성을 담고
            // ItemClass가 셋팅된 오브젝트를 또 담는다(list)
            list.add(ic);
//            System.out.println(i + ". 속성: " + it);
        }
        // 입력한 아이템들을 출력 해보자
//        System.out.println("입력한 아이템 출력");
//        for (ItemClass ic : list) {
//            System.out.println("아이템 이름: " + ic.getName());
//            System.out.println("아이템 속성: " + ic.getAtt());
//        }
    }

    // 셋팅된 아이템 리스트를 전달 해주는 기능
    public ArrayList<ItemClass> getItemList() {
        return list;
    }
}
