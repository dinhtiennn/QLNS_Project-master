package bean;

import java.util.Date;

public class nhanvienbean {
	private String MaNV;
	private String TenNV;
	private String MaCV;
	private Date NgaySinh;
	private String GioiTinh;
	private String Email;
	private String SDT;
	private String DVCT;
	private String ChucDanh;
	private String TenDangNhap;
	private String MatKhau;
	public nhanvienbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public nhanvienbean(String maNV, String tenNV, String maCV, Date ngaySinh, String gioiTinh, String email,
			String sDT, String dVCT, String chucDanh, String tenDangNhap, String matKhau) {
		super();
		MaNV = maNV;
		TenNV = tenNV;
		MaCV = maCV;
		NgaySinh = ngaySinh;
		GioiTinh = gioiTinh;
		Email = email;
		SDT = sDT;
		DVCT = dVCT;
		ChucDanh = chucDanh;
		TenDangNhap = tenDangNhap;
		MatKhau = matKhau;
	}
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public String getTenNV() {
		return TenNV;
	}
	public void setTenNV(String tenNV) {
		TenNV = tenNV;
	}
	public String getMaCV() {
		return MaCV;
	}
	public void setMaCV(String maCV) {
		MaCV = maCV;
	}
	public Date getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		NgaySinh = ngaySinh;
	}
	public String getGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		SDT = sDT;
	}
	public String getDVCT() {
		return DVCT;
	}
	public void setDVCT(String dVCT) {
		DVCT = dVCT;
	}
	public String getChucDanh() {
		return ChucDanh;
	}
	public void setChucDanh(String chucDanh) {
		ChucDanh = chucDanh;
	}
	public String getTenDangNhap() {
		return TenDangNhap;
	}
	public void setTenDangNhap(String tenDangNhap) {
		TenDangNhap = tenDangNhap;
	}
	public String getMatKhau() {
		return MatKhau;
	}
	public void setMatKhau(String matKhau) {
		MatKhau = matKhau;
	}
	@Override
	public String toString() {
		return "nhanvienbean [MaNV=" + MaNV + ", TenNV=" + TenNV + ", MaCV=" + MaCV + ", NgaySinh=" + NgaySinh
				+ ", GioiTinh=" + GioiTinh + ", Email=" + Email + ", SDT=" + SDT + ", DVCT=" + DVCT + ", ChucDanh="
				+ ChucDanh + ", TenDangNhap=" + TenDangNhap + ", MatKhau=" + MatKhau + "]";
	}
	
	
	
}
