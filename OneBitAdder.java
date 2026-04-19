import Components.*;

public class OneBitAdder{
	private XOR_GATE XOR1;
	private XOR_GATE XOR2;
	
	private AND_GATE AND1;
	private AND_GATE AND2;
	private AND_GATE AND3;
	
	private OR_GATE OR1;
	private OR_GATE OR2;
	
	private Bit SUM;
	private Bit CARRY;
	
	public OneBitAdder(){
		XOR1 = new XOR_GATE();
		XOR2 = new XOR_GATE();
		
		AND1 = new AND_GATE();
		AND2 = new AND_GATE();
		AND3 = new AND_GATE();
		
		OR1 = new OR_GATE();
		OR2 = new OR_GATE();
	}
	
	public void ip( Bit A, Bit B, Bit C ){
		
		XOR1.ip(A, B);
		Bit c1 = XOR1.op();
		
		XOR2.ip(c1, C);
		SUM = XOR2.op();
		
		AND1.ip(A, B);
		Bit c2 = AND1.op();
		
		AND2.ip(B, C);
		Bit c3 = AND2.op();
		
		AND3.ip(C, A);
		Bit c4 = AND3.op();
		
		OR1.ip(c2, c3);
		Bit c5 = OR1.op();
		
		OR2.ip(c5, c4);
		CARRY = OR2.op();
	}
	
	public Bit opSUM(){
		return SUM;
	}
	public Bit opCARRY(){
		return CARRY;
	}
}