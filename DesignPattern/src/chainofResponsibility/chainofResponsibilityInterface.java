package chainofResponsibility;

public interface chainofResponsibilityInterface {
	
	public void setNextChain(chainofResponsibilityInterface nextChain);

	public void calculate(Numbers request);
}
