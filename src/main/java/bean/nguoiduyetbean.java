package bean;

public class nguoiduyetbean {
	private String MaNguoiDuyet;
	private String TenNguoiDuyet;
	private String MaCV;
	public nguoiduyetbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public nguoiduyetbean(String maNguoiDuyet, String tenNguoiDuyet, String maCV) {
		super();
		MaNguoiDuyet = maNguoiDuyet;
		TenNguoiDuyet = tenNguoiDuyet;
		MaCV = maCV;
	}
	public String getMaNguoiDuyet() {
		return MaNguoiDuyet;
	}
	public void setMaNguoiDuyet(String maNguoiDuyet) {
		MaNguoiDuyet = maNguoiDuyet;
	}
	public String getTenNguoiDuyet() {
		return TenNguoiDuyet;
	}
	public void setTenNguoiDuyet(String tenNguoiDuyet) {
		TenNguoiDuyet = tenNguoiDuyet;
	}
	public String getMaCV() {
		return MaCV;
	}
	public void setMaCV(String maCV) {
		MaCV = maCV;
	}
	
}
