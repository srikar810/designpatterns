package chainofResponsibility;

public class MulNumber implements chainofResponsibilityInterface{
	private chainofResponsibilityInterface nextChain;
	@Override
	public void setNextChain(chainofResponsibilityInterface nextChaintoFwrd) {
		// TODO Auto-generated method stub
		this.nextChain = nextChaintoFwrd;
	}

	@Override
	public void calculate(Numbers request) {
		// TODO Auto-generated method stub
		if(request.getCalculationWanted() == "mul"){
			System.out.println(request.getNum1()+"*"+request.getNum2()+"="+( request.getNum1()*request.getNum2()));
		}else{
			nextChain.calculate(request);
		}
	}

}
