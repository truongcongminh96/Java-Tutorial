package Buoi6;
import java.util.Scanner;

public class BaiTapMang {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] mang; //kieu du liuu refference (tham chieu) duoc cap phát bang tu khóa new
		int slpt , luaChon = 0;//kieu du lieu primitive (co so) duoc cap phát bang phép gán thông thuong
		
		System.out.println("Moi ban nhap so luong phan tu mong muon: ");
		slpt = Integer.parseInt(scan.nextLine());
		
		mang = new int[slpt];
		
		nhapMang(scan, mang);//Gui 2 tham so? (scan và mang) vào hàm nhapMang
		do {
			luaChon = hienThiMenu(scan);
			switch (luaChon) {
			case 0:
				System.out.println("ban dã thoát");
				break;

			case 1: //Tính tong so duong
				tinhTongCacSoDuong (mang);
				break;
			case 2: //Ðem có bao nhiêu so duong trong mang
				//Ð?u ra
				System.out.println("So duong trong mang là: " + demSoLuongSoDuong(mang));
				break;
			case 3://Tìm so nho nhat trong mang
				
				System.out.println("So nho nhat trong mang là: " + mang[timSoNhoNhat(mang)]);
				
				break;
			case 4: //Tim so duong nho nhat trong mang
				timSoDuongNhoNhat(mang);
				break;
			case 5: //Tim so chan cuoi trong mang
				//neu mang ko co gia tri chan thi tra ve -1
				int viTriSoChanCuoi = timSoChanCuoiCung(mang);
				
				if (viTriSoChanCuoi == -1) {
					System.out.println("Khong co so chan");
				} else {
					System.out.println("So chan cuoi trong mang la: " + mang[viTriSoChanCuoi]);
				}
				
				break;
			case 10://So sánh so luong so duong và so âm trong mang
				
				break;
			}
		} while (luaChon != 0);
		
	}
	
	public static void timSoDuongNhoNhat (int[] mang) {
		int viTriDuongMin = timSoDuongDauTien(mang);
	}
	
	public static int timSoChanCuoiCung(int[] mang) {
		
		for(int i = mang.length - 1; i >= 0; i --) {
			if(mang[i] % 2 == 0) {
				return i;
	
			}
		}
		return -1;
	}
	
	/*4*/public static int demSoLuongSoDuong (int[] mang) {

		int soDuongTrongMang = 0;
		
		for (int i = 0; i < mang.length; i++) {
			if (mang[i] > 0) {
				soDuongTrongMang++;
			}
		}
		return soDuongTrongMang;
	}
	
	/*3*/public static void tinhTongCacSoDuong (int[] mang) {
		int tongCacSoDuong = 0;
		for (int i = 0; i < mang.length; i++) {
			if (mang[i] > 0) {
				tongCacSoDuong += mang[i];
			}
		}
		System.out.println("Tong các so duong trong mang là: " + tongCacSoDuong);
	}
	
	public static int timSoNhoNhat(int[] mang) {
		//Tìm kiem tuan tu:
		//Buoc 1: Cho phan tu dau tiên là min
		int viTriMin = 0; // vi tri thu 0 trong mang
		//Buoc 2: So sánh min voi các phan tu còn l
		//Neu phát hien min > phan tu[i] nào dó => can cap nhat lai min bang phan tu[i]
		for (int i = 1; i < mang.length; i++ ) {
			if (mang[viTriMin] > mang[i]) {
				viTriMin = i;
			}
		}
		//Buoc 3: Ket luan
		return viTriMin;
	}
	
	public static int timSoDuongDauTien(int[] mang) {
		for (int i = 0; i> mang.length; i++) {
			if(mang[i] > 0) {
				return i; //Tro den vi tri so duong dau tien
			}
		}
		return -1;
	}
	
	/*Hàm int s? return v? m?t giá tr? int*/
	/*2*/public static int hienThiMenu (Scanner scan) {
		System.out.println("MENU");
		System.out.println("1. Tong các so duong  trong mang.\n" + 
				"2. Ðem có bao nhiêu so duong trong mang.\n" + 
				"3. Tìm so nho nhat trong mang.\n" + 
				"4. Tìm so duong nho nhat trong mang\n" + 
				"5. Tìm so chan cuoi cùng trong mang. Neu mang không có giá tri chan thì tra ve -1.");
		System.out.println("Moi ban chon: ");
		return Integer.parseInt(scan.nextLine()); // return v? giá tr? int
	}
	
	/*1*/public static void nhapMang (Scanner scan, int[] mang) {
		for (int i = 0; i < mang.length ; i++) {
			System.out.println("Nh?p s? th? " + i + ":");
			mang[i] = Integer.parseInt(scan.nextLine());
		}
	}
	
}