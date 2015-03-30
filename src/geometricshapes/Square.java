package geometricshapes;

public class Square extends Rectangle{
	
	public Square(double xV, double yV, double l) {
		super(xV, yV, l, l);
	
		// TODO Auto-generated constructor stub
		
		
	}


	public double getL() {
		return this.xSideLength;
	}


	
	


	public void setL(double l) {
		if(l<=0){
			throw new IllegalArgumentException();
		}
		else
			this.setxSideLength(l);
		
	}
	
	
	
	
	
	@Override public void setxSideLength(double l) {
		if (l<=0)
			throw new IllegalArgumentException();
		else
			this.xSideLength = l;
			this.ySideLength = l;
	}
	
	

	@Override
	public String toString() {
		return "Square [xV=" + xV + ", yV=" + yV + ", l="
				+ xSideLength + "]";
	}
	


	@Override public void setySideLength(double l) {
		if (l<=0)
			throw new IllegalArgumentException();
		else
			this.xSideLength = l;
			this.ySideLength = l;
		
	}

}
