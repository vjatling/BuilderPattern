package State;

public class PrintState implements State {
	FabricFactory fabricFactory;

	public PrintState(FabricFactory fabricFactory) {
		this.fabricFactory=fabricFactory;
		
	}

	@Override
	public void NewFabric() {
		System.out.println("Fabric Factory is preparing new Fabrics");
		
	}

	@Override
	public void ColdPressed() {
		System.out.println("Fabric is Cold Pressed");		
	}

	@Override
	public void Rolled() {
		System.out.println("Fabric is rolled.");
		
	}

	@Override
	public void Refill() {
		System.out.println("Fabric is Refilled");
		
	}

	@Override
	public void Print() {
		System.out.println("Printing is finished.");
		fabricFactory.setState(fabricFactory.getNewFabricState());
		
	}
	public String toString() {
		return "Printing State";
	}


}
