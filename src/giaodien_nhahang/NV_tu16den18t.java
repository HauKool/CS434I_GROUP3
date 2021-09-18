package giaodien_nhahang;

public class NV_tu16den18t extends NhanVien{
    private String HoTenNguoiDamHo;

    public NV_tu16den18t(String HoTenNguoiDamHo, String HoTen, String ChucVu, String GioiTinh, int NamSinh, double SoNgayLam, double Luong, String Sdt) {
        super(HoTen, ChucVu, GioiTinh, NamSinh, SoNgayLam, Luong, Sdt);
        this.HoTenNguoiDamHo = HoTenNguoiDamHo;
    }

    public String getHoTenNguoiDamHo() {
        return HoTenNguoiDamHo;
    }

    public void setHoTenNguoiDamHo(String HoTenNguoiDamHo) {
        this.HoTenNguoiDamHo = HoTenNguoiDamHo;
    }

 
    
}
