package taxcalculation;

public interface Tax {
	public void esiCalculation(float ctc);
	public void pfCalculation(float ctc);
	public void ptCalculation(float ctc);
	public void incometaxCalculation(float ctc);
	public void rebate(long ctc);
	public void empNetSalary(int ctc);
}
