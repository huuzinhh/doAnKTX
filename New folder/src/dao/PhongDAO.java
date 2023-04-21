package dao;

import Connector.KetNoiSQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.ThongTinPhong;


public class PhongDAO {
     private Connection conn;   
    
    
  public PhongDAO(){
      try {
          
          String DB_URL = "jdbc:mysql://localhost:3306/quanlyktxsinhvien";
          String USER_NAME = "root";
          String PASSWORD = "";
          
          conn=DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
          
      } catch (Exception e) {
          e.printStackTrace();
      }
  }
  
  public List<ThongTinPhong> getAllThongTinPhong(){
      List<ThongTinPhong> listPhong = new ArrayList<ThongTinPhong>();
      Connection conn = KetNoiSQL.getConnection();
      String sql = "select * from thongtinphong";
      try {
          
          PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
               ThongTinPhong phong = new ThongTinPhong();
               phong.setMaPhong(rs.getString("maPhong"));
               phong.setTenPhong(rs.getString("tenPhong"));
               phong.setSoLuongSVPhong(rs.getInt("soLuongSVPhong"));
               phong.setLoaiPhong(rs.getString("loaiPhong"));
               phong.setTienPhong(rs.getDouble("tienPhong"));
               listPhong.add(phong);
             }
          
      } catch (Exception e) {
          e.printStackTrace();
      }
      
      return listPhong;
  }
    
    
    public List<ThongTinPhong> getAllThongTinPhongSearch(String where,String text){
      List<ThongTinPhong> listPhong = new ArrayList<ThongTinPhong>();
      Connection conn = KetNoiSQL.getConnection();
      String sql = "select * from thongtinphong where "+where+" like N'%"+text+"%'";
      try {
          
          PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
               ThongTinPhong phong = new ThongTinPhong();
               phong.setMaPhong(rs.getString("maPhong"));
               phong.setTenPhong(rs.getString("tenPhong"));
               phong.setSoLuongSVPhong(rs.getInt("soLuongSVPhong"));
               phong.setLoaiPhong(rs.getString("loaiPhong"));
               phong.setTienPhong(rs.getDouble("tienPhong"));
               listPhong.add(phong);
             }
          
      } catch (Exception e) {
          e.printStackTrace();
      }
      
      return listPhong;
  }
    
    
    
}
