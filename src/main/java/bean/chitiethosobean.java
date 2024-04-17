package bean;

public class chitiethosobean {
	private Long MaCTHS;
	private String SLPhaiNop;
	private String BatBuoc;
	private String SLDaNop;
	private String GhiChu;
	private String MaGiayTo;
	private String MaHS;
	public chitiethosobean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public chitiethosobean(Long maCTHS, String sLPhaiNop, String batBuoc, String sLDaNop, String ghiChu,
			String maGiayTo, String maHS) {
		super();
		MaCTHS = maCTHS;
		SLPhaiNop = sLPhaiNop;
		BatBuoc = batBuoc;
		SLDaNop = sLDaNop;
		GhiChu = ghiChu;
		MaGiayTo = maGiayTo;
		MaHS = maHS;
	}
	public Long getMaCTHS() {
		return MaCTHS;
	}
	public void setMaCTHS(Long maCTHS) {
		MaCTHS = maCTHS;
	}
	public String getSLPhaiNop() {
		return SLPhaiNop;
	}
	public void setSLPhaiNop(String sLPhaiNop) {
		SLPhaiNop = sLPhaiNop;
	}
	public String getBatBuoc() {
		return BatBuoc;
	}
	public void setBatBuoc(String batBuoc) {
		BatBuoc = batBuoc;
	}
	public String getSLDaNop() {
		return SLDaNop;
	}
	public void setSLDaNop(String sLDaNop) {
		SLDaNop = sLDaNop;
	}
	public String getGhiChu() {
		return GhiChu;
	}
	public void setGhiChu(String ghiChu) {
		GhiChu = ghiChu;
	}
	public String getMaGiayTo() {
		return MaGiayTo;
	}
	public void setMaGiayTo(String maGiayTo) {
		MaGiayTo = maGiayTo;
	}
	public String getMaHS() {
		return MaHS;
	}
	public void setMaHS(String maHS) {
		MaHS = maHS;
	}
	@Override
	public String toString() {
		return "chitiethosobean [MaCTHS=" + MaCTHS + ", SLPhaiNop=" + SLPhaiNop + ", BatBuoc=" + BatBuoc + ", SLDaNop="
				+ SLDaNop + ", GhiChu=" + GhiChu + ", MaGiayTo=" + MaGiayTo + ", MaHS=" + MaHS + "]" +"\n";
	}
	
}
