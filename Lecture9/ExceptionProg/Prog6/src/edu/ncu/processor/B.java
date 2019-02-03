package edu.ncu.processor;
import edu.ncu.exception.*;
public class B extends A {
	public void f() throws LevelTwoException{
		throw new LevelTwoException("world");
	}
}