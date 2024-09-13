package Tuan3_QLDiaCD;

public class DanhSachCD {
	private CD[] danhSach;
	private int soLuong;

	public DanhSachCD(int kichThuoc) {
		danhSach = new CD[kichThuoc];
		soLuong = 0;
	}

	public boolean themCD(CD cd) {
		if (soLuong >= danhSach.length) {
			System.out.println("Danh sách đầy.");
			return false;
		}

		for (int i = 0; i < soLuong; i++) {
			if (danhSach[i].getMaCD() == cd.getMaCD()) {
				System.out.println("Mã CD đã tồn tại.");
				return false;
			}
		}

		danhSach[soLuong++] = cd;
		return true;
	}

	public int soLuongCD() {
		return soLuong;
	}

	public double tinhTongGiaThanh() {
		double tong = 0;
		for (int i = 0; i < soLuong; i++) {
			tong += danhSach[i].getGiaThanh();
		}
		return tong;
	}

	public void sapXepGiamDanTheoGia() {

		for (int i = 0; i < soLuong - 1; i++) {
			for (int j = 0; j < soLuong - i - 1; j++) {
				if (danhSach[j].getGiaThanh() < danhSach[j + 1].getGiaThanh()) {
					CD temp = danhSach[j];
					danhSach[j] = danhSach[j + 1];
					danhSach[j + 1] = temp;
				}
			}
		}
	}

	public void sapXepTangDanTheoTua() {

		for (int i = 0; i < soLuong - 1; i++) {
			for (int j = 0; j < soLuong - i - 1; j++) {
				if (danhSach[j].getTuaCD().compareTo(danhSach[j + 1].getTuaCD()) > 0) {

					CD temp = danhSach[j];
					danhSach[j] = danhSach[j + 1];
					danhSach[j + 1] = temp;
				}
			}
		}
	}

	public void xuatDanhSach() {
		for (int i = 0; i < soLuong; i++) {
			System.out.println(danhSach[i]);
		}
	}
}
