package bean;

import java.util.Date;

public class bangdangkybean {
	private String Manv;
	private String MaLoaiCa;
	private String MaLoaiDK;
	private Date NgayDangKy;
	private Boolean Duyet;
	private String LyDo;
	public bangdangkybean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public bangdangkybean(String manv, String maLoaiCa, String maLoaiDK, Date ngayDangKy, Boolean duyet, String lyDo) {
		super();
		Manv = manv;
		MaLoaiCa = maLoaiCa;
		MaLoaiDK = maLoaiDK;
		NgayDangKy = ngayDangKy;
		Duyet = duyet;
		LyDo = lyDo;
	}
	public String getManv() {
		return Manv;
	}
	public void setManv(String manv) {
		Manv = manv;
	}
	public String getMaLoaiCa() {
		return MaLoaiCa;
	}
	public void setMaLoaiCa(String maLoaiCa) {
		MaLoaiCa = maLoaiCa;
	}
	public String getMaLoaiDK() {
		return MaLoaiDK;
	}
	public void setMaLoaiDK(String maLoaiDK) {
		MaLoaiDK = maLoaiDK;
	}
	public Date getNgayDangKy() {
		return NgayDangKy;
	}
	public void setNgayDangKy(Date ngayDangKy) {
		NgayDangKy = ngayDangKy;
	}
	public Boolean getDuyet() {
		return Duyet;
	}
	public void setDuyet(Boolean duyet) {
		Duyet = duyet;
	}
	public String getLyDo() {
		return LyDo;
	}
	public void setLyDo(String lyDo) {
		LyDo = lyDo;
	}
	@Override
	public String toString() {
		return "bangdangkybean [Manv=" + Manv + ", MaLoaiCa=" + MaLoaiCa + ", MaLoaiDK=" + MaLoaiDK + ", NgayDangKy="
				+ NgayDangKy + ", Duyet=" + Duyet + ", LyDo=" + LyDo + "]";
	}
	
}
