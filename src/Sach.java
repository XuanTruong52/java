import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.util.Scanner;

public class Sach extends HangHoa {
    private String ID_Sach;
    private String tieuDe;
    private String tacGia;
    private String ngayXuatBan;
    private int soLuong;
    private int soLuongBan;
    private int thangKhuyenMai;

    public Sach() {
        super();
    }

    public Sach(String maHangHoa, String loaiHangHoa, float giaBan, String ID_Sach, String tieuDe, String tacGia, String ngayXuatBan, int soLuong, int soLuongBan, int thangKhuyenMai) {
        super(maHangHoa, loaiHangHoa, giaBan);
        this.ID_Sach = ID_Sach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.ngayXuatBan = ngayXuatBan;
        this.soLuong = soLuong;
        this.soLuongBan = soLuongBan;
        this.thangKhuyenMai = thangKhuyenMai;
    }

    public String getID_Sach() {
        return ID_Sach;
    }

    public void setID_Sach(String ID_Sach) {
        this.ID_Sach = ID_Sach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getNgayXuatBan() {
        return ngayXuatBan;
    }

    public void setNgayXuatBan(String ngayXuatBan) {
        this.ngayXuatBan = ngayXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }

    public int getThangKhuyenMai() {
        return thangKhuyenMai;
    }

    public void setThangKhuyenMai(int thangKhuyenMai) {
        this.thangKhuyenMai = thangKhuyenMai;
    }

    @Override
    public void Input() {
        Scanner scanner = new Scanner(System.in);
        super.Input();
        System.out.println(" ID s??ch : ");
        ID_Sach = scanner.nextLine();
        System.out.println(" Ti??u ????? : ");
        tieuDe = scanner.nextLine();
        System.out.println(" T??c gi??? : ");
        tacGia = scanner.nextLine();
        System.out.println(" Ng??y xu???t b???n : ");
        ngayXuatBan = scanner.nextLine();
        System.out.println(" S??? l?????ng : ");
        soLuong = scanner.nextInt();
        System.out.println(" S??? l?????ng b??n : ");
        soLuong = scanner.nextInt();
        System.out.println(" Th??ng mua s??ch : ");
        thangKhuyenMai = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println(" ID s??ch : " + getID_Sach() +
                " || Ti??u ????? : " + getTieuDe() +
                " || T??c gi??? : " + getTacGia() +
                " || Ng??y xu???t b???n : " + getNgayXuatBan() +
                " || S??? l?????ng : " + getSoLuong() +
                " || S??? luog75n b??n : " + getSoLuongBan() +
                " || Th??ng mua s??ch : " + getThangKhuyenMai());
    }

    public void display_TienBanSach() {
        System.out.print(" ID s??ch : " + getID_Sach() +
                " || Ti??u ????? : " + getTieuDe() +
                " || T??c gi??? : " + getTacGia() +
                " || Ng??y xu???t b???n : " + getNgayXuatBan() +
                " || S??? l?????ng : " + getSoLuong() +
                " || S??? luog75n b??n : " + getSoLuongBan() +
                " || Th??ng mua s??ch : " + getThangKhuyenMai() +
                " || T???ng ti???n b??n s??ch : " + tinhTienSoSachBanDuoc());
    }

    private int tinhTienSoSachBanDuoc() {
        int tienSoSachBanDuoc = 0;

        /**
         * C??ch t??nh ti???n khuy???n m??i c??c th??ng trong n??m
         * th??ng 1 > 3 gi???m 50%
         * th??ng 4 > 8 kh??ng khuy???n m??i
         * th??ng 9 >11 gi???m 25%
         * th??ng 12 gi???m 75%
         * **/

        if (this.thangKhuyenMai == 1 || this.thangKhuyenMai == 2 || this.thangKhuyenMai == 3) {
            tienSoSachBanDuoc = (int) ((this.getSoLuongBan() * this.getSoLuongBan()) * (0.5));
            return tienSoSachBanDuoc;
        } else if (this.thangKhuyenMai == 4 || this.thangKhuyenMai == 5 || this.thangKhuyenMai == 6
                || this.thangKhuyenMai == 7 || this.thangKhuyenMai == 8) {
            tienSoSachBanDuoc = (int) ((this.getGiaBan()) * this.getSoLuongBan() * (1));
            return tienSoSachBanDuoc;
        } else if (this.thangKhuyenMai == 9 || this.thangKhuyenMai == 10 || this.thangKhuyenMai == 11) {
            tienSoSachBanDuoc = (int) ((this.getGiaBan()) * this.getSoLuongBan() * (0.25));
            return tienSoSachBanDuoc;
        } else {
            tienSoSachBanDuoc = (int) ((this.getGiaBan() * this.getSoLuongBan()) * (0.75));
            return tienSoSachBanDuoc;
        }
    }
}
