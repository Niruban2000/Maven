package com.Ipt;

import java.time.LocalDateTime;
import java.util.function.Supplier;

class Time implements Supplier<LocalDateTime>{

@Override
public LocalDateTime get() {
	return LocalDateTime.now();
}
}

public class Supplierclass {
	public static void main(String[] args) {
		Supplier<LocalDateTime> s = ()-> LocalDateTime.now();
		System.out.println(s.get());
		
	}

}




