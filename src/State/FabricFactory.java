package State;

public class FabricFactory {
	State newFabricState;
	State coldPressedState;
	State rolledState;
	State refillState;
	State printState;	
	State state;
	
	public FabricFactory() {
		newFabricState=new NewFabricState(this);
		coldPressedState =new ColdPressedState(this);
		rolledState=new RolledState(this);
		refillState=new RefillState(this);
		printState=new PrintState(this);
		state= newFabricState;
		
	}
	
	public void setState(State state) {
		this.state = state;
	}
	public State getState() {
		return this.state;
	}
	
	public State getNewFabricState() {
		return newFabricState;
		
	}
	public State getColdPressed() {
		return coldPressedState;
	}
	public State getRolled() {
		return rolledState;
	}
	public State getRefill() {
		return refillState;
	}
	
	public State getPrintState() {
		return printState;
	}
	
	public void NewFabric() {
		state.NewFabric();
	}
	public void ColdPressed() {
		state.ColdPressed();
	}
	public void Rolled() {
		state.Rolled();
	}
	public void Refill() {
		state.Refill();
	}
	public void Print() {
		state.Print();
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("The Fabric Factory");
		result.append("\nFabricFactory is " + state + "\n");
		return result.toString();

	}

}
