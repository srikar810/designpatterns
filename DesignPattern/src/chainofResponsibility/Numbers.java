package chainofResponsibility;

public class Numbers {
private int num1;
private int num2;

private String calculationWanted;

public Numbers(int newNum1,int newNum2, String calcWanted){
	num1 = newNum1;
	num2= newNum2;
	calculationWanted = calcWanted;
}
public int getNum1() {
	return num1;
}

public String getCalculationWanted() {
	return calculationWanted;
}

public int getNum2() {
	return num2;
}
}
