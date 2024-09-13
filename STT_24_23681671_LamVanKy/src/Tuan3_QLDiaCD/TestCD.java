package Tuan3_QLDiaCD;

import java.util.Scanner;

public class TestCD {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DanhSachCD dsCD = new DanhSachCD(10);

		while (true) {
			System.out.println("Menu:");
			System.out.println("1. Thêm CD");
			System.out.println("2. Tính số lượng CD");
			System.out.println("3. Tính tổng giá thành");
			System.out.println("4. Sắp xếp theo giá thành (giảm dần)");
			System.out.println("5. Sắp xếp theo tựa CD (tăng dần)");
			System.out.println("6. Xuất toàn bộ danh sách");
			System.out.println("0. Thoát");
			System.out.print("Chọn chức năng: ");

			int luaChon = scanner.nextInt();
			scanner.nextLine();

			switch (luaChon) {
			case 1:
				System.out.print("Nhập mã CD: ");
				int maCD = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Nhập tựa CD: ");
				String tuaCD = scanner.nextLine();
				System.out.print("Nhập ca sĩ: ");
				String caSy = scanner.nextLine();
				System.out.print("Nhập số bài hát: ");
				int soBaiHat = scanner.nextInt();
				System.out.print("Nhập giá thành: ");
				double giaThanh = scanner.nextDouble();
				scanner.nextLine();

				CD cd = new CD(maCD, tuaCD, caSy, soBaiHat, giaThanh);
				dsCD.themCD(cd);
				break;

			case 2:
				System.out.println("Số lượng CD trong danh sách: " + dsCD.soLuongCD());
				break;

			case 3:
				System.out.println("Tổng giá thành của các CD: " + dsCD.tinhTongGiaThanh());
				break;

			case 4:
				dsCD.sapXepGiamDanTheoGia();
				System.out.println("Danh sách sau khi sắp xếp theo giá thành (giảm dần):");
				dsCD.xuatDanhSach();
				break;

			case 5:
				dsCD.sapXepTangDanTheoTua();
				System.out.println("Danh sách sau khi sắp xếp theo tựa CD (tăng dần):");
				dsCD.xuatDanhSach();
				break;

			case 6:
				dsCD.xuatDanhSach();
				break;

			case 0:
				System.out.println("Thoát chương trình.");
				scanner.close();
				return;

			default:
				System.out.println("Chọn không hợp lệ. Vui lòng chọn lại.");
			}
		}
	}
}
