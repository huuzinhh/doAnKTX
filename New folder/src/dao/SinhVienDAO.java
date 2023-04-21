package dao;

import Connector.KetNoiSQL;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.ThongTinSinhVien;


public class SinhVienDAO {
    
    
  private Connection conn;   
    
    
  public SinhVienDAO(){
      try {
          
          String DB_URL = "jdbc:mysql://localhost:3306/quanlyktxsinhvien";
          String USER_NAME = "root";
          String PASSWORD = "";
          
          conn=DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
          
      } catch (Exception e) {
          e.printStackTrace();
      }
  }
  
  public List<ThongTinSinhVien> getAllThongTinSV(){
      List<ThongTinSinhVien> listSinhVien = new ArrayList<ThongTinSinhVien>();
      Connection conn = KetNoiSQL.getConnection();
      String sql = "select * from thongtinsinhvien";
      try {
          
          PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
               ThongTinSinhVien sv = new ThongTinSinhVien();
               sv.setMaSV(rs.getString("maSV"));
               sv.setTenSV(rs.getString("tenSV"));
               sv.setCCCD(rs.getString("CCCD"));
               sv.setGioiTinh(rs.getString("gioiTinh"));
               sv.setNgaySinh(rs.getDate("ngaySinh"));
               sv.setEmail(rs.getString("email"));
               sv.setTenDangNhap(rs.getString("tenDangNhap"));
               sv.setMaPhong(rs.getString("maPhong"));
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
  
  
  
  public List<ThongTinSinhVien> getAllThongTinSVTheoPhong(String maPhong){
      List<ThongTinSinhVien> listSinhVien = new ArrayList<ThongTinSinhVien>();
      Connection conn = KetNoiSQL.getConnection();
      String sql = "select * from thongtinsinhvien where maPhong='"+maPhong+"'";
      try {
          
          PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
               ThongTinSinhVien sv = new ThongTinSinhVien();
               sv.setMaSV(rs.getString("maSV"));
               sv.setTenSV(rs.getString("tenSV"));
               sv.setCCCD(rs.getString("CCCD"));
               sv.setGioiTinh(rs.getString("gioiTinh"));
               sv.setNgaySinh(rs.getDate("ngaySinh"));
               sv.setEmail(rs.getString("email"));
               sv.setTenDangNhap(rs.getString("tenDangNhap"));
               sv.setMaPhong(rs.getString("maPhong"));
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
  
  public List<ThongTinSinhVien> getAllThongTinSVSearch(String where,String text){
      List<ThongTinSinhVien> listSinhVien = new ArrayList<ThongTinSinhVien>();
      Connection conn = KetNoiSQL.getConnection();
      String sql = "select * from thongtinsinhvien where "+where+" like N'%"+text+"%'";
      try {
          
          PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
               ThongTinSinhVien sv = new ThongTinSinhVien();
               sv.setMaSV(rs.getString("maSV"));
               sv.setTenSV(rs.getString("tenSV"));
               sv.setCCCD(rs.getString("CCCD"));
               sv.setGioiTinh(rs.getString("gioiTinh"));
               sv.setNgaySinh(rs.getDate("ngaySinh"));
               sv.setEmail(rs.getString("email"));
               sv.setTenDangNhap(rs.getString("tenDangNhap"));
               sv.setMaPhong(rs.getString("maPhong"));
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
  
  
  public ThongTinSinhVien getAllThongTinSVTheoemail(String email){
      ThongTinSinhVien sv = new ThongTinSinhVien();
      Connection conn = KetNoiSQL.getConnection();
      String sql = "select * from thongtinsinhvien where email ='"+email+"'";
      try {
          
          PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
               sv.setMaSV(rs.getString("maSV"));
               sv.setTenSV(rs.getString("tenSV"));
               sv.setCCCD(rs.getString("CCCD"));
               sv.setGioiTinh(rs.getString("gioiTinh"));
               sv.setNgaySinh(rs.getDate("ngaySinh"));
               sv.setEmail(rs.getString("email"));
               sv.setTenDangNhap(rs.getString("tenDangNhap"));
               sv.setMaPhong(rs.getString("maPhong"));
               sv.setSoDienThoai(rs.getString("soDienThoai"));
               sv.setQueQuan(rs.getString("queQuan"));
               sv.setMaLop(rs.getString("maLop"));
               sv.setPhanQuyen(rs.getString("phanQuyen"));
             }
          
      } catch (Exception e) {
          e.printStackTrace();
      }
      
      return sv;
  }
}
