package State;

public class NewFabricState implements State {
	FabricFactory fabricFactory;

	public NewFabricState(FabricFactory fabricFactory) {
		this.fabricFactory=fabricFactory;
	}

	@Override
	public void NewFabric() {
		System.out.println("Fabric Factory is preparing new Fabrics");
		FabricBuilder fabricBuilder=new AnimalBasedFabricBuilder();
		Fabric fabric=fabricBuilder.addAbaca().addCoir().addCotton().addHemp().addSheepWool().addAnimalSkin().build();
		fabric.prepare();
		fabric.Sizing();
		fabric.Winding();
		fabric.Warping();
		System.out.println(fabric);
		fabricBuilder=new PlantBasedFabricBuilder();
		fabric=fabricBuilder.addAbaca().addCoir().addCotton().addHemp().addSheepWool().addAnimalSkin().build();
		fabric.prepare();
		fabric.Sizing();
		fabric.Winding();
		fabric.Warping();
		System.out.println(fabric);
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
		
	}
	
	public String toString() {
		return " started production";
	}
}
