package State;

public class FabricFactoryBuilder {
	public static void main(String []args) {
		FabricFactory fabricFactory= new FabricFactory();
		System.out.println(fabricFactory);
		fabricFactory.NewFabric();
		fabricFactory.Rolled();
		fabricFactory.Refill();
		fabricFactory.ColdPressed();
		System.out.println(fabricFactory);
	}
}
