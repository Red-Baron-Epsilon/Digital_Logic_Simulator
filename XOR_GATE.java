import Components.*;

public class XOR_GATE{
	private AND_GATE AND1;
	private AND_GATE AND2;
	private NOT_GATE NOT1;
	private NOT_GATE NOT2;
	private OR_GATE OR;
		
	private Bit C;	
		
	public XOR_GATE(){
		AND1 = new AND_GATE();
		AND2 = new AND_GATE();
		NOT1 = new NOT_GATE();
		NOT2 = new NOT_GATE();
		OR = new OR_GATE();
		
	}
	public void ip( Bit A, Bit B ){
			
		NOT1.ip(A);
		Bit A_inv = NOT1.op();
		NOT2.ip(B);
		Bit B_inv = NOT2.op();
			
		AND1.ip(A, B_inv);
		Bit M1 = AND1.op();
			
		AND2.ip(A_inv, B);
		Bit M2 = AND2.op();
			
		OR.ip(M1, M2);
		C = OR.op();		
	}
	
	public Bit op(){
		return C;
	}
}