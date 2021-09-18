
package giaodien_nhahang;

public abstract class NhanVien{
    private String HoTen,ChucVu,  GioiTinh;
    private int NamSinh;
    private double   SoNgayLam;
    private double Luong;
    private String Sdt;
    

    public NhanVien(String HoTen, String ChucVu, String GioiTinh, int NamSinh, double SoNgayLam, double Luong, String Sdt) {
        this.HoTen = HoTen;
        this.ChucVu = ChucVu;
        this.GioiTinh = GioiTinh;
        this.NamSinh = NamSinh;
        this.SoNgayLam = SoNgayLam;
        this.Luong = Luong;
        this.Sdt = Sdt;
    }


    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String  isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    public double getSoNgayLam() {
        return SoNgayLam;
    }

    public void setSoNgayLam(double SoNgayLam) {
        this.SoNgayLam = SoNgayLam;
    }

    public double getLuong() {
        return Luong;
    }

    public void setLuong(double Luong) {
        this.Luong = Luong;
    }

    public String  getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }
    public double TinhLuong(){
        return Luong/30*SoNgayLam;
    }
    
    public String getHoTenNguoiDamHo() {
        return "";
    }

    @Override
    public String toString() {
        return  HoTen +"~"+  ChucVu   +"~"+ GioiTinh   + "~"+NamSinh   + "~"+SoNgayLam  + "~"+Luong +"~"+ Sdt +"~"+getHoTenNguoiDamHo() +"\n";
    }
    
}
