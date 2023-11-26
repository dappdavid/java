package com.programs;

//LazyInitialization
public final class SingletonTest {

	private static volatile SingletonTest instance = null;

	private SingletonTest() {

	}

	public static SingletonTest getInstance() {
		if (instance == null) {
			synchronized (SingletonTest.class) {
				instance = new SingletonTest();
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
