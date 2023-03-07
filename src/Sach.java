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
        System.out.println(" ID sách : ");
        ID_Sach = scanner.nextLine();
        System.out.println(" Tiêu đề : ");
        tieuDe = scanner.nextLine();
        System.out.println(" Tác giả : ");
        tacGia = scanner.nextLine();
        System.out.println(" Ngày xuất bản : ");
        ngayXuatBan = scanner.nextLine();
        System.out.println(" Số lượng : ");
        soLuong = scanner.nextInt();
        System.out.println(" Số lượng bán : ");
        soLuong = scanner.nextInt();
        System.out.println(" Tháng mua sách : ");
        thangKhuyenMai = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println(" ID sách : " + getID_Sach() +
                " || Tiêu đề : " + getTieuDe() +
                " || Tác giả : " + getTacGia() +
                " || Ngày xuất bản : " + getNgayXuatBan() +
                " || Số lượng : " + getSoLuong() +
                " || Số luog75n bán : " + getSoLuongBan() +
                " || Tháng mua sách : " + getThangKhuyenMai());
    }

    public void display_TienBanSach() {
        System.out.print(" ID sách : " + getID_Sach() +
                " || Tiêu đề : " + getTieuDe() +
                " || Tác giả : " + getTacGia() +
                " || Ngày xuất bản : " + getNgayXuatBan() +
                " || Số lượng : " + getSoLuong() +
                " || Số luog75n bán : " + getSoLuongBan() +
                " || Tháng mua sách : " + getThangKhuyenMai() +
                " || Tổng tiền bán sách : " + tinhTienSoSachBanDuoc());
    }

    private int tinhTienSoSachBanDuoc() {
        int tienSoSachBanDuoc = 0;

        /**
         * Cách tính tiền khuyến mãi các tháng trong năm
         * tháng 1 > 3 giảm 50%
         * tháng 4 > 8 không khuyến mãi
         * tháng 9 >11 giảm 25%
         * tháng 12 giảm 75%
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
