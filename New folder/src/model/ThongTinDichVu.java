
package model;


public class ThongTinDichVu {
    private String maPhong;
    private float soNuocCu;
    private float soNuocMoi;
    private float soDienCu;
    private float soDienMoi;
    private double tienDien;
    private double tienNuoc;

    public ThongTinDichVu() {
    }

    public ThongTinDichVu(String maPhong, float soNuocCu, float soNuocMoi, float soDienCu, float soDienMoi, double tienDien, double tienNuoc) {
        this.maPhong = maPhong;
        this.soNuocCu = soNuocCu;
        this.soNuocMoi = soNuocMoi;
        this.soDienCu = soDienCu;
        this.soDienMoi = soDienMoi;
        this.tienDien = tienDien;
        this.tienNuoc = tienNuoc;
    }

    public ThongTinDichVu(String maPhong, float soNuocCu, float soNuocMoi, float soDienCu, float soDienMoi) {
        this.maPhong = maPhong;
        this.soNuocCu = soNuocCu;
        this.soNuocMoi = soNuocMoi;
        this.soDienCu = soDienCu;
        this.soDienMoi = soDienMoi;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public float getSoNuocCu() {
        return soNuocCu;
    }

    public void setSoNuocCu(float soNuocCu) {
        this.soNuocCu = soNuocCu;
    }

    public float getSoNuocMoi() {
        return soNuocMoi;
    }

    public void setSoNuocMoi(float soNuocMoi) {
        this.soNuocMoi = soNuocMoi;
    }

    public float getSoDienCu() {
        return soDienCu;
    }

    public void setSoDienCu(float soDienCu) {
        this.soDienCu = soDienCu;
    }

    public float getSoDienMoi() {
        return soDienMoi;
    }

    public void setSoDienMoi(float soDienMoi) {
        this.soDienMoi = soDienMoi;
    }

    public double getTienDien() {
        return tienDien;
    }

    public void setTienDien(double tienDien) {
        this.tienDien = tienDien;
    }

    public double getTienNuoc() {
        return tienNuoc;
    }

    public void setTienNuoc(double tienNuoc) {
        this.tienNuoc = tienNuoc;
    }
    
    
}
