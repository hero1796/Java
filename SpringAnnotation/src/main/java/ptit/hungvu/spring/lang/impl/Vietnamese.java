package ptit.hungvu.spring.lang.impl;

import ptit.hungvu.spring.lang.Language;

public class Vietnamese implements Language {

	@Override
	public String getGreeting() {
		return "Xin chào";
	}

	@Override
	public String getBye() {
		return "Tạm biệt";
	}

}
