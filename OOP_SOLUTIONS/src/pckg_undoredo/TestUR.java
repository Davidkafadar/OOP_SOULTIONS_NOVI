package pckg_undoredo;

import pckg_algoritam.ArrayStackImplementation;
import pckg_algoritam.STACK;

public class TestUR {
	public static void main(String[] args) {
		CommandCLS cmd1 = new CommandCLS("Write text ... ");
		CommandCLS cmd2 = new CommandCLS("Delete part of text...");
		CommandCLS cmd3 = new CommandCLS("Calculate something!");
		STACK<CommandCLS> undoStack = new ArrayStackImplementation<>(10);
		STACK<CommandCLS> redoStack = new ArrayStackImplementation<>(10);
		undoStack.push(cmd1);
		undoStack.push(cmd2);
		undoStack.push(cmd3);
		System.out.println("Undo Stack:  ");
		System.out.println(undoStack);
		System.out.println("Redo stack:  ");
		System.out.println(redoStack);
		redoStack.push(undoStack.pop());
		redoStack.push(undoStack.pop());
		redoStack.push(undoStack.pop());
		
		
		
	}
	

}
