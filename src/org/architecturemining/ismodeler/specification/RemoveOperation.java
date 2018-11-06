package org.architecturemining.ismodeler.specification;

import java.util.Map;
import java.util.Map.Entry;

import org.architecturemining.ismodeler.proving.model.Element;
import org.architecturemining.ismodeler.proving.model.Relation;
import org.architecturemining.ismodeler.proving.model.Variable;
import org.architecturemining.ismodeler.proving.model.World;

public class RemoveOperation extends Operation {

	private Relation relation;
	
	public RemoveOperation(Relation relation) {
		this.relation = relation;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("remove (");
		sb.append(relation.getParameterString());		
		sb.append(") from ");
		sb.append(relation.getLabel());
		sb.append(";");
		return sb.toString();
	}

	@Override
	public void apply(Map<Variable, Element> binding, World world) {
		Relation newRelation = (Relation) relation.clone();
		
		for(Entry<Variable, Element> e: binding.entrySet()) {
			newRelation.instantiate(e.getKey(), e.getValue());
		}
		
		world.removeRelation(newRelation);
	}
}
