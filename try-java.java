import java.util.Scanner;

public class CekKabisat {
  static Scanner keyboard = new Scanner(System.in);

  public static String cekKabisat(int tahun) {
    if (tahun % 4 == 0) {
      return "Tahun " + tahun + " adalah tahun Kabisat.";
    } else {
      return "Tahun " + tahun + " bukan tahun Kabisat.";
    }
  }

  public static void main(String[] args) {
    int tahun;

    System.out.print("Masukkan tahun\t: ");
    tahun = keyboard.nextInt();

    System.out.println(cekKabisat(tahun));
  }
}
