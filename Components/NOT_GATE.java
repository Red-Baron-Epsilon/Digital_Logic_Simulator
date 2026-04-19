package Components;

public class NOT_GATE{
	private byte u;

	public void ip(Bit x){
		u = x.getBit();
	}

	public Bit op(){
		if (u == 0)
			return new Bit(1);
		else
			return new Bit(0);
	}
}