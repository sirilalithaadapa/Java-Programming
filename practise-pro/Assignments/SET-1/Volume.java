public class Volume {
	
	public double volume (double r) {
		return (4.0 / 3.0) * (22.0 / 7.0) * Math.pow(r, 3);
	}
	
	public double volume (double h, double r) {
		return (22.0 / 7.0) *  Math.pow(r, 2) * h;
	}
	
	public double volume (double l, double b, double h) {
		return l * b * h;
	}

	public static void main(String[] args) {
		Volume vol = new Volume();
		System.out.println(vol.volume(3));
		System.out.println(vol.volume(3, 4));
		System.out.println(vol.volume(3, 4, 5));

	}

}
