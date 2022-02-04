package corejavaexample.main.methodoverriding;

public class ChipCardMachine extends SwipeMachine{
	
	@Override
	public void readCard() {
		//Functionality to read chip cards
		System.out.println("Read Card method to read chip cards from ChipCardMachine Class");
	}

}
