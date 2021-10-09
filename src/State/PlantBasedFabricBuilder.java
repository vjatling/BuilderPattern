package State;

public class PlantBasedFabricBuilder  extends FabricBuilder{

	@Override
	public FabricBuilder addAbaca() {
		this.textiles.add("Abaca");
		return this;
	}

	@Override
	public FabricBuilder addCotton() {
		this.textiles.add("Cotton");
		return this;
	}

	@Override
	public FabricBuilder addCoir() {
		this.textiles.add("Coir");
		return this;
	}

	@Override
	public FabricBuilder addHemp() {
		this.textiles.add("Hemp");
		return this;
	}

	@Override
	public FabricBuilder addSheepWool() {
		return this;
	}

	@Override
	public FabricBuilder addAnimalSkin() {
		return this;
	}

}
