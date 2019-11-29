package com.tyss.abstractclass;

public class Gmail extends Google {

	@Override
	void shareDocument() {
		System.out.println("25MB Gmail transfer");
	}
}
