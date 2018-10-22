package org.architecturemining.ismodeler.tests.prover.model;

import static org.junit.jupiter.api.Assertions.*;

import org.architecturemining.ismodeler.proving.model.Element;
import org.architecturemining.ismodeler.proving.model.Equality;
import org.architecturemining.ismodeler.proving.model.Relation;
import org.architecturemining.ismodeler.proving.model.Variable;
import org.architecturemining.ismodeler.proving.model.World;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestEquality {

	private Element s;
	private Element p;
	private Element a;
	
	private Variable x;
	private Variable y;
	
	private Relation r1;
	private Relation r2;
	private Relation r3;
	
	private Relation r4;
	private Relation r5;
	private Relation r6;
	
	private World world;
	
	@BeforeEach
	void setUp() throws Exception {
		world = new World();
		
		s = new Element("Socrates", "human");
		p = new Element("Plato", "human");
		a = new Element("Augustine", "human");
		
		x = new Variable("X", "human");
		y = new Variable("y", "human");
		
		r1 = new Relation("likes", s, p);
		r2 = new Relation("likes", p, s);
		r3 = new Relation("likes", new Element("Socrates", "human"), new Element("Plato", "human"));
		
		r4 = new Relation("likes", a, x);
		r5 = new Relation("likes", a, a);
		r6 = new Relation("likes", x, a);
	}

	@Test
	void testIsValidIn() {
		Equality eq1 = new Equality(s, p);
		assertFalse(eq1.isValidIn(world));
		
		Equality eq2 = new Equality(s, s);
		assertTrue(eq2.isValidIn(world));
		
		Equality eq3 = new Equality(s, new Element("Socrates", "human"));
		assertTrue(eq3.isValidIn(world));
		
		Equality eq4 = new Equality(s, new Element("Plato", "human"));
		assertFalse(eq4.isValidIn(world));
		
		Equality eq5 = new Equality(r1, r2);
		assertFalse(eq5.isValidIn(world));
		
		Equality eq6 = new Equality(r1, r3);
		assertTrue(eq6.isValidIn(world));
	}
	
	@Test
	public void testInstantiateVariables() {
		Equality eq1 = new Equality(x, x);
		assertTrue(eq1.isValidIn(world));
		eq1.instantiate(x, a);
		assertTrue(eq1.isValidIn(world));
	}
	
	@Test
	public void testInstantiateVariables2() {
		Equality eq2 = new Equality(a, x);
		assertFalse(eq2.isValidIn(world));
		eq2.instantiate(x, a);
		assertTrue(eq2.isValidIn(world));
	}
	
	@Test
	public void testInstantiateVariables3() {
		Equality eq3 = new Equality(x, a);
		assertFalse(eq3.isValidIn(world));
		eq3.instantiate(x, a);
		assertTrue(eq3.isValidIn(world));
	}
	
	@Test
	public void testInstantiateVariables4() {
		Equality eq4 = new Equality(r4, r5);
		assertFalse(eq4.isValidIn(world));
		eq4.instantiate(x, a);
		assertTrue(eq4.isValidIn(world));
	}
	
	@Test
	public void testInstantiateVariables5() {
		Equality eq5 = new Equality(r5, r6);
		assertFalse(eq5.isValidIn(world));
		eq5.instantiate(x, a);
		assertTrue(eq5.isValidIn(world));
	}
	
	@Test
	public void testInstantiateVariables6() {
		Equality eq6 = new Equality(r4, r5);
		assertFalse(eq6.isValidIn(world));
		eq6.instantiate(x, a);
		assertTrue(eq6.isValidIn(world));
	}
}