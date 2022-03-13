import java.util.Scanner;

/**
 * palindromNumber
 */
public class palindromNumber {

// Buraya method yazacağız:
//---------------------------------
static String isPalindrom(int N) {
  

  int temp = N, reverseN = 0, lastN;

  while (temp != 0){

    lastN = temp % 10;
    reverseN = (reverseN * 10) + lastN;

    temp /= 10;
  }

    if (N == reverseN){
      return "Polindrom Sayıdır.";
    }
    else {
      return "Polindrom Sayı Değildir.";
    }
  }
  //---------------------------------
  public static void main(String[] args) {
    Scanner newin = new Scanner(System.in);
    System.out.print("Bir Sayı Giriniz: ");
    int N = newin.nextInt();
    isPalindrom(N);
    System.out.println(isPalindrom(N));
    



    newin.close();
  }
}