package prep.playground1;

public class Programming2 implements ABC, XYZ {
	public static void main(String[] args) {
		

	
	}

	public void print(){
		System.out.println("Programming2");
	}


}

interface ABC {
	default void print(){
		System.out.println("ABC");
	}
}

interface XYZ {
//	default void print(){
//		System.out.println("XYZ");
//	}
}