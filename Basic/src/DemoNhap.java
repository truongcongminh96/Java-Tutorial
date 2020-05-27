import java.util.Scanner;

/* Viết chương trình nhập vào tên người bạn yêu
 * In ra câu người đó cũng yêu bạn
 */
public class DemoNhap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bạn nhập vào tên người bạn thầm yêu: ");
		Scanner scan = new Scanner(System.in);
		String ten = scan.nextLine();
		System.out.println(ten + " đéo yêu anh!");
		
		//Phần cuối
		System.out.println("Bạn nhập năm sinh ");
		int namSinh  = scan.nextInt();
		int tuoi = 2020 - namSinh;
		System.out.println("tuoi " + tuoi);
	}

}
