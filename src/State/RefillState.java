package State;

public class RefillState implements State {
	FabricFactory fabricFactory;

	public RefillState(FabricFactory fabricFactory) {
		this.fabricFactory=fabricFactory;

	}

	@Override
	public void NewFabric() {
		System.out.println("Fabric Factory is preparing new Fabrics");
		fabricFactory.setState(fabricFactory.getNewFabricState());
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
		fabricFactory.setState(fabricFactory.getNewFabricState());
	}

	@Override
	public void Print() {
		System.out.println("Printing is finished.");
		
	}
	public String toString() {
		return "Refill State";
	}

}
