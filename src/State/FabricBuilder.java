package State;

import java.util.ArrayList;
import java.util.List;

public abstract class FabricBuilder {
	String name;
	List<String> textiles = new ArrayList<String>();
	public abstract FabricBuilder addAbaca();
	public abstract FabricBuilder addCotton();
	public abstract FabricBuilder addCoir();
	public abstract FabricBuilder addHemp();
	public abstract FabricBuilder addSheepWool();
	public abstract FabricBuilder addAnimalSkin();



	public Fabric build() {
		Fabric fabric = new Fabric();

		fabric.setName(this.name);
		fabric.addTextiles(textiles);
		return fabric;
	}

}
