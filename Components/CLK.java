package Components;

public class CLK{

	private int time_period;
	private int duration;

	public CLK(int time_period, int duration) {

        if (time_period < 2)
        	throw new IllegalArgumentException("CLK time period must be greater than or equal to 2");

        if (duration <= 0)
        	throw new IllegalArgumentException("CLK duration must be positive");

        this.time_period = time_period;
        this.duration = duration;
    }

	public Bit[] generate() {

        Bit[] stream = new Bit[duration];

       	for (int i = 0; i < duration; i++) {

            int t = i % time_period;

            if (t < time_period/2.0)
                stream[i] = new Bit(0);
           	else
                stream[i] = new Bit(1);
       	}

		return stream;
    }
}