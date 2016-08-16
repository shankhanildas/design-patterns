package org.nil.behavioral.visitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FurnitureAssemblyOrder implements AssemblyPart{
	private List<AssemblyPart> parts = new ArrayList<>();

	public FurnitureAssemblyOrder() {
		// TODO Auto-generated constructor stub
	}
	
	public void addPart(AssemblyPart part){
		parts.add(part);
	}
	
	public List<AssemblyPart> getParts(){
		return Collections.unmodifiableList(parts);
	}

	@Override
	public void accept(AssemblyPartVisitor visitor) {
		for (AssemblyPart assemblyPart : parts) {
			assemblyPart.accept(visitor);
		}
		visitor.visit(this);
	}	
}
