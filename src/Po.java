import java.util.Scanner;

class Pokemon{
    int count = 0;
    private String owner;
    String[] skills;

    public Pokemon(String owner, String skills) {
        this.owner = owner;
        this.skills = skills.split("/");
        count += 1;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void info(){
        System.out.println(owner + "의 포켓몬이 사용 가능한 스킬");
        for (int i=0; i< skills.length; i++) {
            System.out.println(i+1 + " : " + skills[i]);
        }
    }

    void attack(int idx){
        System.out.println(skills[idx] + "공격 시전!");
    }
}

class Pikachu extends Pokemon{

    public Pikachu(String owner, String skills) {
        super(owner, skills);
    }
    String name = "피카츄";
    @Override
    void attack(int idx) {
        super.attack(idx);
        System.out.printf("[삐까삐까] %s의 %s가 %s 공격 시전!\n", getOwner(), name, skills[idx]);
    }
}

class Ggoboogi extends Pokemon{
    public Ggoboogi(String owner, String skills) {
        super(owner, skills);
    }
    String name = "꼬부기";
    @Override
    void attack(int idx) {
        super.attack(idx);
        System.out.printf("[꼬북꼬북] %s의 %s가 %s 공격 시전!", getOwner(), name, skills[idx]);
    }
}

class Pairi extends Pokemon{

    public Pairi(String owner, String skills) {
        super(owner, skills);
    }
    String name = "파이리";
    @Override
    void attack(int idx) {
        super.attack(idx);
        System.out.printf("[파읠파읠] %s의 %s가 %s 공격 시전!", getOwner(), name, skills[idx]);
    }
}

public class Po {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            Pokemon p = null;
//            System.out.println("총" +  + "마리의 포켓몬이 생성되었습니다");
            System.out.print("1) 포켓몬 생성  2) 프로그램 종료 : ");
            String menu = sc.nextLine();
            if (menu.equals("2")) {
                System.out.println("프로그램 종료");
                break;
            }
            else if (menu.equals("1")) {
                System.out.print("1) 피카츄  2) 꼬부기  3) 파이리 : ");
                String pokemon = sc.nextLine();
                System.out.print("플레이어 이름 입력 : ");
                String n = sc.nextLine();
                System.out.print("사용 가능한 기술 입력(/로 구분하여 입력) : ");
                String s = sc.nextLine();
                switch (pokemon) {
                    case "1" -> p = new Pikachu(n, s);
                    case "2" -> p = new Ggoboogi(n, s);
                    case "3" -> p = new Pairi(n, s);

                    default -> System.out.println("메뉴에서 골라주세요");
                }
                p.info();
                System.out.print("공격 번호 선택 : ");
                int attack_menu = (sc.nextInt())-1;
                p.attack(attack_menu);
                sc.nextLine();
            }
            else {
                System.out.println("보기에서 골라주세요");
            }
        }
    }
}

