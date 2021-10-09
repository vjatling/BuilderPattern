package State;

public class RolledState implements State {
	
	FabricFactory fabricFactory;

	public RolledState(FabricFactory fabricFactory) {
		this.fabricFactory=fabricFactory;

	}
	@Override
	public void NewFabric() {
		System.out.println("Fabric Factory is preparing new Fabrics");
		
	}

	@Override
	public void ColdPressed() {
		System.out.println("Fabric is Cold Pressed");	
		fabricFactory.setState(fabricFactory.getRolled());
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
		
	}
	public String toString() {
		return "Rolled State";
	}


}
