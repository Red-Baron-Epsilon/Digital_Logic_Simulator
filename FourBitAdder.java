import Components.*;

public class FourBitAdder{
	
	private OneBitAdder[] ADDER = new OneBitAdder[4];
	
	private Bit[] A;
	private Bit[] B;
	private Bit[] S = new Bit[5];
	
	public FourBitAdder(){	
	
		for( int i = 0; i < 4; i++ )
			ADDER[i] = new OneBitAdder(); 
		
	}
	
	public void ip( Bit[] X, Bit[] Y ){
		A = X;
		B = Y;
		
		Bit c0, c1, c2;
		
		ADDER[0].ip( A[0], B[0], new Bit(0) );
		S[0] = ADDER[0].opSUM();
		c0 = ADDER[0].opCARRY();
		
		ADDER[1].ip( A[1], B[1], c0 );
		S[1] = ADDER[1].opSUM();
		c1 = ADDER[1].opCARRY();
		
		ADDER[2].ip( A[2], B[2], c1 );
		S[2] = ADDER[2].opSUM();
		c2 = ADDER[2].opCARRY();
		
		ADDER[3].ip( A[3], B[3], c2 );
		S[3] = ADDER[3].opSUM();
		S[4] = ADDER[3].opCARRY();
	}
	
	public Bit[] op(){
		return S;
	}
}