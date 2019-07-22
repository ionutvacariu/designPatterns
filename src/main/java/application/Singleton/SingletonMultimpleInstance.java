package application.Singleton;

import sun.management.jmxremote.SingleEntryRegistry;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonMultimpleInstance {

	public static void main(String[] args)
			throws IllegalAccessException, InvocationTargetException, InstantiationException {
		Singleton s = Singleton.getSingleton();
		System.out.println(s);

		final Constructor<?> constructor = Singleton.class.getDeclaredConstructors()[0];
		constructor.setAccessible(true);

		final Singleton o = (Singleton) constructor.newInstance();
		final Singleton o1 = (Singleton) constructor.newInstance();
		final Singleton o2 = (Singleton) constructor.newInstance();

		System.out.println(o);
		System.out.println(o1);
		System.out.println(o2);

		System.out.println("~~~Enum singleton");

		EnumSingleton firstInstance = EnumSingleton.ENUM_SINGLETON;
		firstInstance.setS("s");

		EnumSingleton secondInstance = EnumSingleton.ENUM_SINGLETON;
		System.out.println(secondInstance.getS());
		secondInstance.setS("my value changed even in first instance");
		System.out.println(firstInstance.getS());
	}
}
