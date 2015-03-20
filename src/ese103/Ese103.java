package ese103;

import geometricshape.*; 

public class Ese103 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Circle c = new Circle(2.0,3.0,4.0);
		System.out.println("c: "+c);
		
		if(c.getXC()!=2){
			throw new Exception("xc wrong");
		}
		if(c.getYC()!=3){
			throw new Exception("yc wrong");
		}
		if(c.getR()!=4){
			throw new Exception("r wrong");
		}
		
		c.setXC(10);
		c.setYC(10);
		c.setR(12);
		
		if(c.getXC()!=10){
			throw new Exception("xc wrong");
		}
		if(c.getYC()!=10){
			throw new Exception("yc wrong");
		}
		if(c.getR()!=12){
			throw new Exception("r wrong");
		}
		
		
		Circle c1 = new Circle(2.0,3.0,4.0);
		System.out.println("c1: "+c1);
		
		
		System.out.println("C è uguale a C1?: "+ c.equals(c1));
		System.out.println("C contiene C1?:   "+ c.Contains(c1));
		System.out.println("C1 contiene C?:   "+ c1.Contains(c));
			
		
		Triangle t = new Triangle(2.0,3.0,2.0);
		
		if(t.getXV()!=2){
			throw new Exception("xv wrong");
		}
		
		if(t.getYV()!=3){
			throw new Exception("yv wrong");
		}
		if(t.getL()!=2){
			throw new Exception("L wrong");
		}
		
		t.setL(10);
		t.setXV(5);
		t.setYV(5);
		
		if(t.getXV()!=5){
			throw new Exception("xv wrong, method 'set'error");
		}
		if(t.getYV()!=5){
			throw new Exception("yv wrong method 'set'error");
		}
		if(t.getL()!=10){
			throw new Exception("L wrong method 'set'error");
		}
		
		Triangle t1 = new Triangle (2.0,1.0,1.0);	
		
		
		
		System.out.println("t contiene t1?: "+t.Contains(t1));
		System.out.println("t1 contiene t?: "+t1.Contains(t));
		
	
		System.out.println("c contiene t?:"+c.Contains(t));
		System.out.println("t contiene c?:"+t.Contains(c));
		
	
	}
}
