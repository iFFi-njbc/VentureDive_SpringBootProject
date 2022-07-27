package com.SpringFramework.spring1.ref;

public class A {
	private int id;
	private B ob;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public B getOb() {
		return ob;
	}
	public void setOb(B ob) {
		this.ob = ob;
	}
	public A(int id, B ob) {
		super();
		this.id = id;
		this.ob = ob;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [id=" + id + "]";
	}
	

}
