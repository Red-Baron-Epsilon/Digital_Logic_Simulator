import Components.*;

public class SimulateFourBitAdder{
	
	private static void printBitStream(Bit[] X){
		for( Bit x : X )
			System.out.print(x.getBit() + " ");
		System.out.println();
	}
	
	public static void main(String[] args){
		// LSB to MSB
		Bit[] A = {
			new Bit(0),
			new Bit(1),
			new Bit(1),
			new Bit(0)
		};
		
		Bit[] B = {
			new Bit(1),
			new Bit(0),
			new Bit(1),
			new Bit(0)
		};
		
		FourBitAdder adder = new FourBitAdder();
		adder.ip(A, B);
		Bit[] S = adder.op();
		
		System.out.print("A ");
		printBitStream(A);
		
		System.out.print("B ");
		printBitStream(B);
		
		System.out.print("S ");
		printBitStream(S);
	}
}