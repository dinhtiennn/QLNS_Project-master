package bean;

import java.util.Date;

public class chitietdangkybean {
	private Long MaCTDK;
	private String MaDonDK;
	private String MaLoaiDK;
	private String MaNguoiDuyet;
	private String MaLoaiCa;
	private Date NgayDangKy;
	private String LyDo;
	public chitietdangkybean() {
		super();
		// TODO Auto-generated constructor stub
	}
//	
	public chitietdangkybean(Long maCTDK, String maDonDK, String maLoaiDK, String maNguoiDuyet, String maLoaiCa,
			Date ngayDangKy, String lyDo) {
		super();
		MaCTDK = maCTDK;
		MaDonDK = maDonDK;
		MaLoaiDK = maLoaiDK;
		MaNguoiDuyet = maNguoiDuyet;
		MaLoaiCa = maLoaiCa;
		NgayDangKy = ngayDangKy;
		LyDo = lyDo;
	}
	public Long getMaCTDK() {
		return MaCTDK;
	}
	public void setMaCTDK(Long maCTDK) {
		MaCTDK = maCTDK;
	}
	public String getMaDonDK() {
		return MaDonDK;
	}
	public void setMaDonDK(String maDonDK) {
		MaDonDK = maDonDK;
	}
	public String getMaLoaiDK() {
		return MaLoaiDK;
	}
	public void setMaLoaiDK(String maLoaiDK) {
		MaLoaiDK = maLoaiDK;
	}
	public String getMaNguoiDuyet() {
		return MaNguoiDuyet;
	}
	public void setMaNguoiDuyet(String maNguoiDuyet) {
		MaNguoiDuyet = maNguoiDuyet;
	}
	public String getMaLoaiCa() {
		return MaLoaiCa;
	}
	public void setMaLoaiCa(String maLoaiCa) {
		MaLoaiCa = maLoaiCa;
	}
	public Date getNgayDangKy() {
		return NgayDangKy;
	}
	public void setNgayDangKy(Date ngayDangKy) {
		NgayDangKy = ngayDangKy;
	}
	public String getLyDo() {
		return LyDo;
	}
	public void setLyDo(String lyDo) {
		LyDo = lyDo;
	}
	@Override
	public String toString() {
		return "chitietdangkybean [MaCTDK=" + MaCTDK + ", MaDonDK=" + MaDonDK + ", MaLoaiDK=" + MaLoaiDK
				+ ", MaNguoiDuyet=" + MaNguoiDuyet + ", MaLoaiCa=" + MaLoaiCa + ", NgayDangKy=" + NgayDangKy + ", LyDo="
				+ LyDo + "]";
	}
	
}
