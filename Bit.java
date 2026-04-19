package Components;

public class Bit{
	private byte v;

	public Bit(int x){
		if (x != 0 && x != 1)
			throw new IllegalArgumentException("Bit should be 0 or 1");
		v = (byte)x;
	}

	public byte getBit(){
		return v;
	}
}
