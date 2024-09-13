package Tuan3_HangThucPham;

public class test {
	private String toStringt() {
		return String.format("%-5s %-10s %-10s %-12s %-12s", "Ma SP", "Ten", "Don Gia", "NgaySX", "Hang SD");
	}

	public static void main(String[] args) {
		test A = new test();
		ngay ngaySX = new ngay();
		ngay ngayHH = new ngay();

		ngaySX.setDate(30, 1, 2024);
		ngayHH.setDate(1, 1, 2024);

		hangThucPham thucPham = new hangThucPham(1, "Sua", 10000, ngaySX, ngayHH);

		System.out.println("Thông tin hàng thực phẩm: ");
		System.out.println(A.toStringt());
		System.out.println(thucPham.toString());
		System.out.println("Kiểm tra hạn sử dụng: " + thucPham.kiemTra(ngaySX, ngayHH));
	}
}
