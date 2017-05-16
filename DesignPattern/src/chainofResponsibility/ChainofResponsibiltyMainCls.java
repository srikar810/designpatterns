package chainofResponsibility;

public class ChainofResponsibiltyMainCls {
/*This pattern sends data to an object and if that object can't
 * 
 * use it , it sends it to any number of objects that may br able to use it 
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chainofResponsibilityInterface chancAdd = new AddNumber();
		chainofResponsibilityInterface chancSub = new subNumber();
		chainofResponsibilityInterface chancMul = new MulNumber();
		chainofResponsibilityInterface chancDiv = new DivNumber();
		
		chancAdd.setNextChain(chancSub);
		chancSub.setNextChain(chancMul);
		chancMul.setNextChain(chancDiv);
		
		Numbers request = new Numbers(1, 2, "ceil");
		
		chancAdd.calculate(request);
	}

}
