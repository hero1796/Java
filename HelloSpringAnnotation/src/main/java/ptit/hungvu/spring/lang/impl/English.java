package ptit.hungvu.spring.lang.impl;

import ptit.hungvu.spring.lang.Language;

public class English implements Language {

	@Override
	public String getGreeting() {
		return "Hello";
	}

	@Override
	public String getBye() {
		return "Bye";
	}

}
