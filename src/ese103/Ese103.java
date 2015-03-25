package ese103;

import geometricshapes.*;

public class Ese103 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		GeometricShape shapeArray[] = new GeometricShape[5];
		shapeArray[0] = new Circle (0,0,1);
		shapeArray[1] = new Circle (0.5,0.5,0.5);
		shapeArray[2] = new Circle (1,1,1);
		shapeArray[3] = new Triangle (0,0,1);
		shapeArray[4] = new Triangle (-2,-2,4);
		
		GeometricShape a,b;
		
		for (int i=0;i<shapeArray.length;i++){
			a = shapeArray[i];
		
			for (int j=0;j<shapeArray.length;j++){
				b = shapeArray[j];
				
				if (a!=b){
					if(a.Contains(b)){
						System.out.println(a+"contiene"+b);
					}
					else{
					System.out.println(a+"NON contiene"+b);
					}
				}
			}
		}
		
		GeometricShape vettore[] = new GeometricShape[4];
		
		vettore[0] = new Circle(0,0,1);
		vettore[1] = new Triangle(-3,-3,6);
		vettore[2] = new Rectangle(-5, -5, 20, 10);
		vettore[3] = new Square(-7,-7,25);
		GeometricShape x,y,z,k;
		x = vettore[0];
		y = vettore[1];
		z = vettore[2];
		k = vettore[3];
		if(x!=y && y!=z && z!=k){
			if(z.Contains(y) && y.Contains(x) && k.Contains(z) ){
				System.out.println("tutto giusto");
			}
			else
				System.out.println("dio dio dio...");
		}
		
	}
}
