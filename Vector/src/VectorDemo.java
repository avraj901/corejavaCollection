import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector vector=new Vector();
		System.out.println("vector initial capacity ::"+vector.capacity());
		for(int i=0; i<10; i++) {
			vector.add(i);
		}
		System.out.println(vector);
		vector.add("A");
		System.out.println("vector capacity :: "+vector.capacity()); //new capacity=currentcapacity*2;
	}
}
