package plokstuma;

public class Taskas3D extends Taskas {

	protected double z;
	
	public Taskas3D() {	
	}
	
	public Taskas3D( double x_koord, double y_koord, double z_koord ) {
		
		super ( x_koord, y_koord );
		z = z_koord;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
}
