package com.crescendo.app.core.util;

public class CrescendoUtil {
	public static Object convert(Object from, Class c) {
		Object t = null;
		try {
			t = c.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return t;
	}
}
