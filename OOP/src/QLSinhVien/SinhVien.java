/**
 * Lớp LOPHOC chứa danh sách sinh viên
 * @author Minh Truong
 * Create at: 24/5/2020
 * Version 1.0
 */

public class SinhVien {
//Thuộc tính
	private String maSV;
	private String hoTenSV;
	private float diemToan;
	private float diemLy;
	private float diemHoa;
//Khởi tạo
	public SinhVien() {
		this.maSV=null;
		this.hoTenSV="";
		this.diemToan=0f;
		this.diemLy=0f;
		this.diemHoa=0f;
	}
	public SinhVien(String maSV, String hoTenSV, float diemToan, float diemLy, float diemHoa) {
		this.maSV = maSV;
		this.hoTenSV = hoTenSV;
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
	}
//get , set
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getHoTenSV() {
		return hoTenSV;
	}
	public void setHoTenSV(String hoTenSV) {
		this.hoTenSV = hoTenSV;
	}
	public float getDiemToan() {
		return diemToan;
	}
	public float getDiemLy() {
		return diemLy;
	}
	public float getDiemHoa() {
		return diemHoa;
	}
// nhập xuất : input, output
	public void nhap() {
		
	}
	public void xuat() {
		System.out.println("Mã SV:" + this.maSV);
		System.out.println("Họ tên: " + this.hoTenSV);
		System.out.println("Toán: " + this.diemToan);
		System.out.println("Lý: "+ this.diemLy);
		System.out.println("Hóa: " + this.diemHoa);
	}
//nghiệp vụ
	
	public float tinhDTB() {
		return(this.diemToan+this.diemLy+this.diemHoa)/3;
	}
	public String xepLoai() {
		float diemTrungBinh = tinhDTB();
		String loai = null;
		if (diemTrungBinh >=9) {
			loai = "Xuất sắc";
		} else if (diemTrungBinh >=8 && diemTrungBinh <9) {
			loai = "Giỏi";
		} else if (diemTrungBinh >=7 && diemTrungBinh <8) {
			loai = "Khá";
		} else if (diemTrungBinh >=6 && diemTrungBinh <7) {
			loai = "Trung bình khá";
		} else if (diemTrungBinh >=5 && diemTrungBinh <6) {
			loai = "Trung bình";
		} else {
			loai = "Yếu";
		}
		return loai;
	}
	public String getTen () {
		String ten = "null";
		String [] tam = this.hoTenSV.split(" ");
		if(tam.length>0) {
			ten = tam[tam.length - 1];
		} else {
			ten = this.hoTenSV;
		}
		
		return ten;
	}
}