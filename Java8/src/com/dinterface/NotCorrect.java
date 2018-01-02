package com.dinterface;

public interface NotCorrect {
	/*default boolean equals(Object a) {  //throws compile time eerror , cannot override methods of object class
		return true;
	}*/
	
	default boolean equalss(Object a) {
		return true;
	}
}
