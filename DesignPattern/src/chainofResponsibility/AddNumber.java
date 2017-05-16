package chainofResponsibility;

public class AddNumber implements chainofResponsibilityInterface{
	private chainofResponsibilityInterface nextChain;
	@Override
	public void setNextChain(chainofResponsibilityInterface nextChaintoFwrd) {
		this.nextChain = nextChaintoFwrd;
	}

	@Override
	public void calculate(Numbers request) {
		// TODO Auto-generated method stub
		if(request.getCalculationWanted() == "add"){
			System.out.println(request.getNum1()+"+"+request.getNum2()+"="+( request.getNum1()+request.getNum2()));
		}else{
			nextChain.calculate(request);
			System.out.println("wtf");
		}
	}

}
