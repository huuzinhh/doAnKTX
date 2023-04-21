
package dao;

import Connector.KetNoiSQL;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ThongTinSinhVien;
import model.ThongTinSinhVienDangKy;

/**
 *
 * @author PhanTien
 */
public class SinhVienDangKyDAO {
    
    private Connection conn;
    public SinhVienDangKyDAO(){
        try {
          
          String DB_URL = "jdbc:mysql://localhost:3306/quanlyktxsinhvien";
          String USER_NAME = "root";
          String PASSWORD = "";
          
          conn=DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
          
      } catch (Exception e) {
          e.printStackTrace();
      }
    }
    
    public List<ThongTinSinhVienDangKy> getAllThongTinSinhVienDangKy(){
        List<ThongTinSinhVienDangKy> listSinhVien = new ArrayList<ThongTinSinhVienDangKy>();
      Connection conn = KetNoiSQL.getConnection();
      String sql = "select * from thongtinsinhviendangky";
      try {
          
          PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
               ThongTinSinhVienDangKy sv = new ThongTinSinhVienDangKy();
               sv.setMaSV(rs.getString("maSV"));
               sv.setTenSV(rs.getString("tenSV"));
               sv.setCCCD(rs.getString("CCCD"));
               sv.setGioiTinh(rs.getString("gioiTinh"));
               sv.setNgaySinh(rs.getDate("ngaySinh"));
               sv.setEmail(rs.getString("email"));
               sv.setTenDangNhap(rs.getString("tenDangNhap"));
               sv.setSoDienThoai(rs.getString("soDienThoai"));
               sv.setQueQuan(rs.getString("queQuan"));
               sv.setMaLop(rs.getString("maLop"));
               sv.setPhanQuyen(rs.getString("phanQuyen"));
               listSinhVien.add(sv);
             }
          
      } catch (Exception e) {
          e.printStackTrace();
      }
      
      return listSinhVien;
    }
}
