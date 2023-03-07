import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    static ArrayList<Sach> sachArrayList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public void add(){
        System.out.print(" Số sách muốn nhập : ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            Sach sach = new Sach();
            sach.Input();
            sachArrayList.add(sach);
        }
    }

    public void displaylaySach(){
        for (int i = 0; i < sachArrayList.size(); i++) {
            sachArrayList.get(i).Output();
        }
    }

    public void hienThiThongTinMaHH(){

    }

    public void sortGiaBanGiamDan(){

    }
}
