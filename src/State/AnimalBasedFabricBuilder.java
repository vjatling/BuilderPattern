package State;

public class AnimalBasedFabricBuilder extends FabricBuilder {
	
	public AnimalBasedFabricBuilder() {
		this.name="AnimalBasedFabricBuilder";
	}

	@Override
	public FabricBuilder addAbaca() {
		
		return this;
	}

	@Override
	public FabricBuilder addCotton() {
		return this;
	}

	@Override
	public FabricBuilder addCoir() {
		return this;
	}

	@Override
	public FabricBuilder addHemp() {
		return this;
	}

	@Override
	public FabricBuilder addSheepWool() {
		this.textiles.add("Sheep Wool");
		return this;
	}

	@Override
	public FabricBuilder addAnimalSkin() {
		this.textiles.add("Animal Skin");
		return this;
	}
}
