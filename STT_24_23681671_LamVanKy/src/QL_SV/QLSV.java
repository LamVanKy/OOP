package QL_SV;

import java.util.Scanner;

public class QLSV {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số lượng sinh viên: ");
		int n = scanner.nextInt();
		scanner.nextLine();

		SinhVien[] danhSachSinhVien = new SinhVien[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
			System.out.print("Mã sinh viên: ");
			int maSinhVien = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Họ tên: ");
			String hoTen = scanner.nextLine();

			System.out.print("Địa chỉ: ");
			String diaChi = scanner.nextLine();

			System.out.print("Số điện thoại (7 chữ số): ");
			String soDienThoai = scanner.nextLine();

			danhSachSinhVien[i] = new SinhVien(maSinhVien, hoTen, diaChi, soDienThoai);
		}

		for (int i = 0; i < danhSachSinhVien.length - 1; i++) {
			for (int j = 0; j < danhSachSinhVien.length - 1 - i; j++) {
				if (danhSachSinhVien[j].getMaSinhVien() > danhSachSinhVien[j + 1].getMaSinhVien()) {

					SinhVien temp = danhSachSinhVien[j];
					danhSachSinhVien[j] = danhSachSinhVien[j + 1];
					danhSachSinhVien[j + 1] = temp;
				}
			}
		}

		System.out.println("Danh sách sinh viên sau khi sắp xếp:");
		for (SinhVien sinhVien : danhSachSinhVien) {
			System.out.println(sinhVien.toString());
		}

		scanner.close();
	}
}
