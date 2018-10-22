package org.architecturemining.ismodeler.tests.prover.model;

import static org.junit.jupiter.api.Assertions.*;

import org.architecturemining.ismodeler.proving.model.All;
import org.architecturemining.ismodeler.proving.model.And;
import org.architecturemining.ismodeler.proving.model.Element;
import org.architecturemining.ismodeler.proving.model.Exists;
import org.architecturemining.ismodeler.proving.model.Implies;
import org.architecturemining.ismodeler.proving.model.Not;
import org.architecturemining.ismodeler.proving.model.Relation;
import org.architecturemining.ismodeler.proving.model.Variable;
import org.architecturemining.ismodeler.proving.model.World;
import org.junit.jupiter.api.Test;

class TestExistsOperator extends WorldTester {

	@Test
	void test() {
		World w = createWorld();
		
		Exists exists = new Exists(
				new Variable("X","human"),
				new Exists(
						new Variable("Y", "human"),
						new Exists(
								new Variable("Z", "human"),
								new Not(
									new Implies(
											new And(
													new Relation("likes", new Variable("X", "human"), new Variable("Y","human")),
													new Relation("likes", new Variable("Y", "human"), new Variable("Z", "human"))
											),
											new Relation("likes", new Variable("X", "human"), new Variable("Z", "human"))
									)
								)
						)
				)
		);
		// This should be false, as A > P, P > S, but not A > S.
		assertTrue(exists.isValidIn(w));
		
		// Add relation A > S
		w.addRelation(
				new Relation("likes", 
						new Element("Augustine", "human"), 
						new Element("Socrates", "human")
				)
		);

		// Now it should be true...
		assertFalse(exists.isValidIn(w));
	}

	@Test
	public void testEmptyDomain() {
		World w = createWorld();
		Exists exists = new Exists(
				new Variable("X", "dog"),
				new Relation("likes", new Variable("X", "dog"), new Variable("X", "dog"))
		);
		
		assertFalse(exists.isValidIn(w));
	}
	
}
