package MathMagic;

public class MathMagic {

	public static void main(String[] args) {
		//This program is design to calculate results from previous math operations starting with 15.
	    
	    int myNumber = 15;
	    int stepOne = myNumber * myNumber;
	    int stepTwo = myNumber + stepOne;
	    int stepThree = myNumber / stepTwo;
	    int stepFour = 17 + stepThree;
	    int stepFive = myNumber - stepFour;
	    int stepSix = 6 / stepFive;
	    int stepSeven = stepFive * stepSix;
	    int stepEight = 4 / stepSeven;
	    int stepNine = stepSeven - stepFour;
	    int stepTen = stepTwo + stepThree;
	    System.out.println(stepTen);

	}

}
