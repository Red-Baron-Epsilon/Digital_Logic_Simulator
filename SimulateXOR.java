import Components.*;

public class SimulateXOR{
	public static void main(String[] args){
		CLK clk1 = new CLK(2, 8);
		CLK clk2 = new CLK(4, 8);
		
		Bit[] A = clk1.generate();
		Bit[] B = clk2.generate();
		
		Bit[] C = new Bit[8];
		
		XOR_GATE xor = new XOR_GATE();
		
		for( int i = 0; i < 8; i++ ){
			xor.ip(A[i], B[i]);
			C[i] = xor.op();
		}
		
		System.out.print("A: ");
		for( Bit a : A )
			System.out.print(a.getBit() + " ");
		System.out.println();
		
		System.out.print("B: ");
		for( Bit b : B )
			System.out.print(b.getBit() + " ");
		System.out.println();
		
		System.out.print("C: ");
		for( Bit c : C )
			System.out.print(c.getBit() + " ");
		System.out.println();
	}
}