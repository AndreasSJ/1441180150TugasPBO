//nama class circle.java 
class  circle {
	//variable radius dan color
	//radius->double
	//color->string

		double radius;
		String color;

	//konstruktor untuk class circle
		//karena nama kelas sama dengan nama function

		public circle(){

			radius=1.0;
			color="red";
		}

		public circle(double r,String c){
			radius =r;
			color = c;

		}

		public double getRAdius(){
			return radius;
		}

		public String getColor(){
			return color;
		}

		public double getArea(){
			return (radius*radius*Math.PI);
		}
	
}