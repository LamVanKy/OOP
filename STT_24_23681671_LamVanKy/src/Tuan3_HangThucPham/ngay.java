package Tuan3_HangThucPham;

public class ngay {
	int ngay;
	int thang;
	int nam;

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

	public void setDate(int a, int b, int c) {
		setNgay(a);
		setThang(b);
		setNam(c);
	}

	public String kiemTraHSD(ngay A, ngay B) {
		if (A.nam > B.nam)
			return ("Da Het Hang");
		else {
			if (A.thang > B.thang)
				return ("Da Het Hang");
			else {
				if (A.ngay > B.ngay)
					return ("Da Het Hang");
				else
					return ("Su Dung Dc");
			}
		}
	}

	public String toString() {
		return String.format("%d/%d/%d", this.ngay, this.thang, this.nam);
	}
}
