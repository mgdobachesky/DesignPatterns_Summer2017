package FinalPart1;

public class RemoteControl {
	Command[] onCommands;
	Command[] offCommands;
	Command[][] macroOnCommands;
	Command[][] macroOffCommands;
	Command undoCommand;
	
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		macroOnCommands = new Command[7][7];
		macroOffCommands = new Command[7][7];
		
		Command noCommand = new NoCommand();
		undoCommand = noCommand;
		for(int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
			
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void setMacroCommand(int slot, Command onCommand, Command offCommand) {
		int nextMacroOn = 0;
		int nextMacroOff = 0;
		
		for(;macroOnCommands[slot][nextMacroOn] != null;nextMacroOn++);
		for(;macroOffCommands[slot][nextMacroOff] != null;nextMacroOff++);
		
		if(nextMacroOn < macroOnCommands[slot].length && nextMacroOff < macroOffCommands.length) {
			macroOnCommands[slot][nextMacroOn] = onCommand;
			macroOffCommands[slot][nextMacroOff] = offCommand;
		}
	}
	
	public void macroOnButtonWasPushed(int slot) {
		int macroOnSize = 0;
		for(;macroOnCommands[slot][macroOnSize] != null;macroOnSize++);
		
		for(int i = 0; i < macroOnSize; i++) {
			macroOnCommands[slot][i].execute();
		}
	}
	
	public void macroOffButtonWasPushed(int slot) {
		int macroOffSize = 0;
		for(;macroOnCommands[slot][macroOffSize] != null;macroOffSize++);
		
		for(int i = 0; i < macroOffSize; i++) {
			macroOffCommands[slot][i].execute();
		}
	}
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPushed(int slot) {
		undoCommand.undo();
	}
	
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------------ Remote Control ------------\n");
		for(int i=0; i<onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] "
					+ onCommands[i].getClass().getName()
					+ "			"
					+ offCommands[i].getClass().getName()
					+"\n");
		}
		return stringBuff.toString();
	}
}
