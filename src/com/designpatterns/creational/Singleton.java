package com.designpatterns.creational;

//LazyInitialization
public final class Singleton {

	private static volatile Singleton instance = null;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				instance = new Singleton();
			}
		}
		return instance;
	}

}

//Eager Initialization

class EagerInitialization {
	private static volatile EagerInitialization instance = new EagerInitialization();

	private EagerInitialization() {

	}

	public static EagerInitialization getInstance() {
		return instance;
	}
}

//static block initialization
class StaticInitialization {

	private static volatile StaticInitialization instance;

	private StaticInitialization() {

	}

	static {
		instance = new StaticInitialization();
	}

	public static StaticInitialization getInstance() {
		return instance;
	}
}
