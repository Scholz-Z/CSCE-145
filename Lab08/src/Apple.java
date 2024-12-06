//Zachary Scholz
public class Apple {
	String type;
	double weight;
	double price;
	
	public Apple() {
		//creates the default value of an apple object
	 this.type = "Gala";
	 this.weight = 0.5;
	 this.price = 0.88;
}
	public void Apples(String xType, double xWeight, double xPrice) {
		this.type = xType;
		this.weight = xWeight;
		this.price = xPrice;
	}
	public void setType(String xType) {
		//checks the apple type for the proper values
		if(xType.equalsIgnoreCase("Gala")
				||xType.equalsIgnoreCase("Red Delicious")
				||xType.equalsIgnoreCase("Golden Delicious")
				||xType.equalsIgnoreCase("Gala")
				||xType.equalsIgnoreCase("Granny Smith"))
		{
			this.type = xType;
		}
		else {
			System.out.println("Invalid apple type inputted");
			this.type = null;
		}
	}
	public void setWeight(double xWeight) {
		//checks for proper weight value of apple
		if(xWeight > 0 && xWeight <= 2) {
			this.weight = xWeight;
		}
		else {
			System.out.println("Invalid apple weight inputted");
			this.weight = 0.0;
		}
	}
		public void setPrice(double xPrice) {
			//checks for proper price value of apple
			if(xPrice > 0) {
				this.price = xPrice;
			}
			else {
				System.out.println("Invalid apple price inputted");
				this.price = 0.0;
			}
	}
		public String getType() {
			return type;
		}
		public double getWeight() {
			return weight;
		}
		public double getPrice() {
			return price;
		}
		public void writeOutput() {
			//Outputs the Values of the created apple object when called
			 System.out.println("Type: "+type+
					 			"\nWeight: "+weight+"kg"+
					 			"\nPrice: $"+price);
		}
}
