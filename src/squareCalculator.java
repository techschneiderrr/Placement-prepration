import java.util.Scanner;
class squareCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.print("enter a number to get its square : ");
    num = sc.nextInt();
    square(num);
  }

  public static int square(int var){
    int sq = var*var;
    System.out.print(sq);
    return 0;
  }
}
