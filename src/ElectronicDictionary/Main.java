package ElectronicDictionary;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("메뉴 번호를 입력하세요!");
            System.out.println("1. 단어 등록");
            System.out.println("2. 단어 조회");
            System.out.println("3. 종료");
            int menu = sc.nextInt();

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다!");
                break;
            }

            if (menu == 1) {
                System.out.println("단어 등록 기능 실행!");
                continue;
            }

            if (menu == 2) {
                System.out.println("단어 조회 기능 실행!" + menu);
                continue;
            }

            System.out.println("잘못된 메뉴입니다. 다시 입력해주세요!");
        }
        sc.close();
    }
}
