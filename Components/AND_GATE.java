package Components;

public class AND_GATE{
	private byte u;
	private byte v;
	
	public void ip(Bit x, Bit y){
		u = x.getBit();
		v = y.getBit();
	}

	public Bit op(){
		if (u == 0 && v == 0 || u == 0 && v == 1 || u == 1 && v == 0)
			return new Bit(0);
		else
			return new Bit(1);
	}
}