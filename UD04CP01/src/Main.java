
public class Main {

	public static void main(String[] args) {
		SerVivo x = new SerVivo((byte) 3);
		SerVivo y = new SerVivo((byte) 5);
		System.out.println(x.mayor(y));
		x = new Humano((byte)34,"Homero");
		y = new Humano((byte)9,"Bart");
		System.out.println(x.mayor(y));
		System.out.print("El menor es ");
		if (x.mayor(y).equals(x)) {
			System.out.println(y);
		} else {
			System.out.println(x);
		}
		}

}
