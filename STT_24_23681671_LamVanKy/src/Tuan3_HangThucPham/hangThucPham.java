package Tuan3_HangThucPham;

public class hangThucPham {
	private int maHang;
	String name;
	private int DonGia;
	private ngay SX;
	private ngay HH;

	public hangThucPham(int maHang, String name, int DonGia, ngay SX, ngay HH) {
		this.maHang = maHang;
		this.name = name;
		this.HH = HH;
		this.SX = SX;
		this.DonGia = DonGia;
	}

	public hangThucPham(int maHang) {
		this.maHang = maHang;
	}

	public int getMaHang() {
		return maHang;
	}

	public void setMaHang(int maHang) {
		this.maHang = maHang;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDonGia() {
		return DonGia;
	}

	public void setDonGia(int donGia) {
		DonGia = donGia;
	}

	public String kiemTra(ngay SX, ngay HH) {
		ngay A = new ngay();
		return A.kiemTraHSD(SX, HH);
	}

	public String toString() {
		ngay A = new ngay();
		return String.format("%5d %-10s %10d %-12s %-12s", this.maHang, this.name, this.DonGia, this.SX.toString(),
				this.HH.toString());
	}

}
