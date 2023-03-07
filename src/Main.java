import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Sach> sachArrayList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static Menu menu = new Menu();
    static Sach sach = new Sach();

    public static void main(String[] args) {
        menu.add();
        menu.displaylaySach();
    }

}
