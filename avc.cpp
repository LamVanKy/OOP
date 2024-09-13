#include <stdio.h>

int main() {
    float gioLamViec, luongMoiGio, tongLuong;

    printf("Nhap so gio lam viec: ");
    scanf("%f", &gioLamViec);

    printf("Nhap luong moi gio: ");
    scanf("%f", &luongMoiGio);

    tongLuong = gioLamViec * luongMoiGio;

    printf("Tong luong cua nhan vien la: %.2f\n", tongLuong);

    return 0;
}