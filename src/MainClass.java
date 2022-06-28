public class MainClass {
    public static void main(String[] args) {
        System.out.println("헬로 월드");
        // 클래스를 불러서 사용
        NameSet ns = new NameSet();
        ns.setName();  // 이름 설정 기능
        // 이름을 출력을 해보자
        ns.getName();
        // 플레이 시작
        PlayClass pc = new PlayClass();
        pc.play1("도라");
    }
}
