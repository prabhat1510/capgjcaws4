package corejavaexample.main.methodoverriding;

public class SwipeMachineTest {

	public static void main(String[] args) {
		SwipeMachine normal = new SwipeMachine();
		normal.readCard();
		
		System.out.println("**********Using normal reference variable************************");
		
			normal = new ChipCardMachine();
			normal.readCard();
		
		System.out.println("************Using chipCard reference variable**********************");
		SwipeMachine chipCard = new ChipCardMachine();
		chipCard.readCard();
		
		System.out.println(chipCard instanceof ChipCardMachine);
		System.out.println(chipCard instanceof SwipeMachine);
	}

}
