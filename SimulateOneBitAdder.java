import Components.*;

public class SimulateOneBitAdder{
	
	private static void printBitStream(Bit[] X){
		for( Bit x : X )
			System.out.print(x.getBit() + " ");
		System.out.println();
	}
	
	public static void main(String[] args){
		CLK s1 = new CLK(2, 16);
		CLK s2 = new CLK(4, 16);
		CLK s3 = new CLK(8, 16);
		
		Bit[] A = s1.generate();
		Bit[] B = s2.generate();
		Bit[] C = s3.generate();
		
		Bit[] SUM = new Bit[16];
		Bit[] CARRY = new Bit[16];
		
		OneBitAdder adder = new OneBitAdder();
		
		for( int i = 0; i < 16; i++ ){
			adder.ip(A[i], B[i], C[i]);
			SUM[i] = adder.opSUM();
			CARRY[i] = adder.opCARRY();
		}
		
		System.out.print("A    ");
		printBitStream(A);
		System.out.print("B    ");
		printBitStream(B);
		System.out.print("C    ");
		printBitStream(C);
		System.out.print("SUM  ");
		printBitStream(SUM);
		System.out.print("CARRY");
		printBitStream(CARRY);
	}
}