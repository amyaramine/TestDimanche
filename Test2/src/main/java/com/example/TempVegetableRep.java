package com.example;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class TempVegetableRep  implements VegetableRep{

	ArrayList<Vegetable> liste =  new ArrayList<Vegetable>();
	
	@Override
	public Vegetable findall() {
		
		for(Vegetable elem: liste)
	       {
	       	 System.out.println (elem);
	       }
		return null;
	}

	@Override
	public void add(Vegetable v) {
		liste.add(v);
		
	}

}
