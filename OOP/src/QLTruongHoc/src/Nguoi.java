
public class Nguoi {

	//attributes
	protected String hoTen;
	protected int namSinh;
	protected String noiSinh;

	public Nguoi() {
		this.hoTen = null;
		this.namSinh = 0;
		this.noiSinh = null;
	}

	public Nguoi(String hoTen, int namSinh, String noiSinh) {
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.noiSinh = noiSinh;
	}

	//get, set
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public String getNoiSinh() {
		return noiSinh;
	}

	public void setNoiSinh(String noiSinh) {
		this.noiSinh = noiSinh;
	}

	//input, output
	public void nhap() {
		
	}
	
	public void xuat() {
		System.out.println("\nHo ten : " + this.hoTen);
		System.out.println("Nam sinh: " + this.namSinh);
		System.out.println("Noi sinh: " + this.noiSinh);
	}
}
