package pl.ug.reflect.benchmark.data;

import java.util.List;

public class ReflectClass {

	public int publicSimple;
	public List<Integer> publicComplex;
	
	private int privateSimple;
	private List<Integer> privateComplex;
	
	
	public int call(Integer arg) {
		return arg * 2;
	}
	
	// GETTERS and SETTERS
	
	public int getPrivateSimple() {
		return privateSimple;
	}
	public void setPrivateSimple(int privateSimeple) {
		this.privateSimple = privateSimeple;
	}
	
	public List<Integer> getPrivateComplex() {
		return privateComplex;
	}
	public void setPrivateComplex(List<Integer> privateComplex) {
		this.privateComplex = privateComplex;
	}
}
