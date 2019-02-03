package edu.ncu.processor;
import edu.ncu.exception.*;
public class C extends B {
	public void f() throws LevelThreeException{
		throw new LevelThreeException("one");
	}
}