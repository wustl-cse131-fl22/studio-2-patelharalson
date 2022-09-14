package studio2;

public class Pi {

	public static void main(String[] args) {
		int totalSimulations = 0;
		int notHit = 0;
		int hit = 0;
		while (totalSimulations <= 1000)
		{
			double x = Math.random();
			double y = Math.random();
			
			double distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
			
			//not hit
			if (distance > 1/2)
			{
				notHit++;
			}
			
			//hit
			else
			{
				hit++;
			}
			
			totalSimulations++;
		}

		double probOfHit = hit/(hit + notHit);
		double pi = 4*probOfHit;
		System.out.println(pi);
	}

}
