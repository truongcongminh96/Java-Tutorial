package Buoi2;

public class decode_xyzh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1; 

		int y = 0; 

		int z = 0; 

		int h = 0; 
		
		x+= 2; 

		y++;

		y+= x++;

		x+= y++; 

		z = y - 4;

		y = z-1; 

		h = ++z;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(h);
	}

}
