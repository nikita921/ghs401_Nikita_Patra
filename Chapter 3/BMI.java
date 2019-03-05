public class BMI
{
  private double weight;
  private double feet;
  private double inches;
  private String gender;
  private double age;
    
  public BMI(double weight, double feet, double inches, String gender, double age)
  {
  	this.weight = weight;
  	this.feet = feet;
  	this.inches = inches;
  	this.gender = gender;
  	this.age = age;
  }
    
  public double calcBMI()
  {
  	double height = ((feet+(inches/12))/3.281);
  	double weightInKg = (weight/2.205);
  	double BMI = weightInKg/(height*height);
 	 
  	if(BMI < 18.5)
  	{
      	System.out.println("Your Health: Underweight");
  	}
  	else if(BMI > 18.5 && BMI < 24.9)
  	{
      	System.out.println("Your Health: Normal");
  	}
  	else if(BMI > 25.0 && BMI < 29.9)
  	{
      	System.out.println("Your Health: Overweight");
  	}
  	else if(BMI > 30.0)
  	{
     	System.out.println("Your Health: Obese");
  	}
 	 
  	return BMI;
  }
    
 
  public double calcBMR()
  {
  	double height1 = ((feet*12)+inches);
  	if(this.gender.equals("male"))
  	{
      	double BMR1 = 66.47 + (6.24*weight) + (12.7*height1) - (6.755*(double)age);
      	return BMR1;
  	}
 	 
  	else if(this.gender.equals("female"))
  	{
      	double BMR2 = 655 + (4.35*weight) + (4.7*height1) - (4.7*age);
      	return BMR2;
  	}
 	 
  	return 0.0;
  }
 
  public String toString()
  {
  	String output = ("Your Body Mass Index is: " + calcBMI() + " kg/m^2" +
  	"\n\nYour Basal Metabolic Rate is: " + calcBMR()) + " calories";
  	return output;
  }
}
