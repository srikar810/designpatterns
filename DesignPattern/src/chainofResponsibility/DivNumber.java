package chainofResponsibility;

public class DivNumber implements chainofResponsibilityInterface{
	private 	chainofResponsibilityInterface nextChain;
	@Override
	public void setNextChain(chainofResponsibilityInterface nextChaintoFwrd) {
		// TODO Auto-generated method stub
		nextChaintoFwrd = nextChain;
	}

	@Override
	public void calculate(Numbers request) {
		// TODO Auto-generated method stub
		if(request.getCalculationWanted() == "div"){
			System.out.println(request.getNum1()+"/"+request.getNum2()+"="+( request.getNum1()/request.getNum2()));
		}else{
			System.out.println("dude buy a calculator");
		}
	}

}
