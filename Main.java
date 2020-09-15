import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("나이를 입력 해주세요.");
    int age = scanner.nextInt();

    System.out.println("이름을 입력 해주세요.");
    String name = scanner.next();

    System.out.println("키를 입력 해주세요.");
    double height = scanner.nextDouble();

    System.out.println(name + " 님의 나이는 "+age+", 키는 " + height);

    scanner.close();
  }
}