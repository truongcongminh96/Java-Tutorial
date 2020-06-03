/**
 * 
 * @author minhtruong
 *
 */
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		CongTy cty = new CongTy();
		cty.khoiTaoDanhSachNhanSu();
		// xuất thông tin toàn bộ nhân viên
		cty.xuat();

		cty.xoaTruongPhong();
		cty.xuat();

		// tính tổng lương công ty
		float tong = 0;
		tong = cty.tinhTongLuongCongTy();
		System.out.println("Tổng doanh thu: " + tong);

		// danh sách trưởng phòng có doanh thu cao nhất
		LinkedList<TruongPhong> dsTruongPhong = new LinkedList<TruongPhong>();
		dsTruongPhong = cty.timTruongPhongCoLuongMax();
		System.out.println("\t==== danh sách trưởng phòng có doanh thu cao nhất =====");
		cty.xuatTruongPhong(dsTruongPhong);

		LinkedList<GiamDoc> dsGiamDoc = new LinkedList<GiamDoc>();
		dsGiamDoc = cty.timGiamDocCoPhanMax();
		System.out.println("\t==== danh sách giám đốc có cổ phần cao nhất ====");
		cty.xuatGiamDoc(dsGiamDoc);
		
		  // Create a hash map
//	      Hashtable balance = new Hashtable();
//	      Enumeration names;
//	      String str;
//	      double bal;
//
//	      balance.put("Zara", new Double(3434.34));
//	      balance.put("Mahnaz", new Double(123.22));
//	      balance.put("Ayan", new Double(1378.00));
//	      balance.put("Daisy", new Double(99.22));
//	      balance.put("Qadir", new Double(-19.08));
//
//	      // Show all balances in hash table.
//	      names = balance.keys();
//	      
//	      while(names.hasMoreElements()) {
//	         str = (String) names.nextElement();
//	         System.out.println(str + ": " + balance.get(str));
//	      }        
//	      System.out.println();
//	      
//	      // Deposit 1,000 into Zara's account
//	      bal = ((Double)balance.get("Zara")).doubleValue();
//	      balance.put("Zara", new Double(bal + 1000));
//	      System.out.println("Zara's new balance: " + balance.get("Zara"));
	   }

}

