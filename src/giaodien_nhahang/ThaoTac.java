package giaodien_nhahang;

import java.io.File;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class ThaoTac  {

    private ArrayList<NhanVien> a = new ArrayList<>();
    
    public void del(){
        a.clear();
    }

    public void add(NhanVien x) {
        a.add(x);

    }

    public void ghifile(String s) {
        try {
            File f = new File(s);
            if (!f.exists()) {
                PrintStream out = new PrintStream(f);
                for (int i = 0; i < a.size(); i++) {
                    out.println(a.get(i));
                }
                out.close();
            } else {
                System.out.println("file da ton tai ");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }


    public void xoa(int i) {
        a.remove(i);
    }

     public void docfile(String tenFile) {
        ArrayList<NhanVien> b = new ArrayList<NhanVien>();
         System.out.println(tenFile);
        try {
            File f = new File(tenFile);
            if (f.exists()) {
                Scanner read = new Scanner(f);
                while (read.hasNextLine()) {
                    
                    String[] m = read.nextLine().split("~");
                    
                    String HoTen = m[0], ChucVu =m[1] ;
                    int NamSinh =Integer.valueOf(m[3]);
                    double SoNgayLam=Double.valueOf(m[4]), Luong=Double.valueOf(m[5]) ;
                    String GioiTinh=m[2];
                    String Sdt=m[6];
                    System.out.println(m[0]+m[1]+m[2]+m[3]+m[4]+m[5]+m[6]);
                    NhanVien x;
                    String timeStamp = new SimpleDateFormat("yyyy").format(Calendar.getInstance().getTime());
                    if((Integer.valueOf(timeStamp) - NamSinh)>18){
                        x = new NV_tren18t (HoTen, ChucVu, GioiTinh, NamSinh, SoNgayLam, Luong, Sdt);
                    }
                    else { String HoTenNguoiDamHo = m[7];
                    x = new NV_tu16den18t (HoTenNguoiDamHo,HoTen, ChucVu, GioiTinh, NamSinh, SoNgayLam, Luong,Sdt);
                        }
                    a.add(x);
                }
            } else {
                System.out.println("Khong ton tai file");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Thong tin cac thiet bi sau khi ghi tu file ra :");
        for (int i = 0; i < b.size(); i++) {
            System.out.println(b.get(i));
        }
    } 
    public int size() {
        return a.size();
    }

    public NhanVien get(int i) {
        return a.get(i);
    }

  
    

    
}
