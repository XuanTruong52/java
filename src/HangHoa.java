import java.util.Scanner;

public class HangHoa implements HangHoa_interface {
    private String maHangHoa;
    private String loaiHangHoa;
    private float giaBan;

    public HangHoa() {
    }

    public HangHoa(String maHangHoa, String loaiHangHoa, float giaBan) {
        this.maHangHoa = maHangHoa;
        this.loaiHangHoa = loaiHangHoa;
        this.giaBan = giaBan;
    }

    public String getMaHangHoa() {
        return maHangHoa;
    }

    public boolean setMaHangHoa(String maHangHoa) {
        if (maHangHoa != null && maHangHoa.length() <= 8) {
            this.maHangHoa = maHangHoa;
            return true;
        } else {
            return false;
        }
    }

    public String getLoaiHangHoa() {
        return loaiHangHoa;
    }

    public boolean setLoaiHangHoa(String loaiHangHoa) {
        if (loaiHangHoa != null && loaiHangHoa.equals("SACH") || loaiHangHoa.equals("Sach") || loaiHangHoa.equals("sach")) {
            this.loaiHangHoa = loaiHangHoa;
            return true;
        } else {
            return false;
        }
    }

    public float getGiaBan() {
        return giaBan;
    }

    public boolean setGiaBan(float giaBan) {
        if (giaBan >= 10000) {
            this.giaBan = giaBan;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void Input() {
        Scanner scanner = new Scanner(System.in);
        // Mã hàng hoá chỉ tối đa chứa 8 ký tự lớn hơn 8 thì vui lòng nhập lại


        while (true) {
            try {
                System.out.print(" Nhap ma hang hoa");
                String maHangHoa = scanner.nextLine();
                boolean check = setMaHangHoa(maHangHoa);
                if (check == true) {
                    break;
                } else {
                    System.err.println("Ma hang hoa <= 8 ky tu");
                }
            } catch (Exception exception) {
                System.out.println("Nhap ma hang hoa");
            }
        }


        // loại hàng hoá chỉ có là Sách nếu nhập sai vui lòng nhập lại
        while (true) {
            try {
                System.out.print(" Nhap ma hang hoa");
                String loaiHangHoa = scanner.nextLine();
                boolean check = setLoaiHangHoa(loaiHangHoa);
                if (check == true) {
                    break;
                } else {
                    System.err.println("Loai hang hoa trong thư vien chi có sách");
                }
            } catch (Exception exception) {
                System.out.println("Nhap lai loai hang hoa");
            }
        }


        // giá bán 1 quyển sách phải >= 10000 nếu không lớn hơn nhập lại cho đúng
        while (true) {
            try {
                System.out.print(" Nhap gia ban");
                float giaBan = scanner.nextFloat();
                boolean check = setGiaBan(giaBan);
                if (check == true) {
                    break;
                } else {
                    System.err.println("Loai hang hoa trong thư vien chi có sách");
                }
            } catch (Exception exception) {
                System.out.println("Nhap lai loai hang hoa");
            }
        }
    }

    @Override
    public void Output() {
        System.out.println("");
        System.out.println(" Mã hàng hoá : "+getLoaiHangHoa()+
                " || Loại hàng hoá : "+getLoaiHangHoa()+
                " || Giá bán : "+getGiaBan());
    }
}
