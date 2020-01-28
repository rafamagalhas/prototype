package prototype;

public class FiestaPrototype extends CarPrototype {
	
	protected FiestaPrototype(FiestaPrototype fiestaPrototype) {
		this.buyValue = fiestaPrototype.getBuyValue();
	} 
	
	public FiestaPrototype() {
		buyValue = 0.0;
	}
	
	@Override
	public String showInfo() {
		return "Modelo: Fiesta\nMontadora: Ford\n" + "Valor: R$" + getBuyValue();
	}

	@Override
	public CarPrototype clone() {
		return new FiestaPrototype(this);
	}
	
}
