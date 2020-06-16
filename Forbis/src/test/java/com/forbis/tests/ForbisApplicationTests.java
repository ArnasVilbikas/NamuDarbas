package com.forbis.tests;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.forbis.ListInnitiation.*;
import com.forbis.domain.Outcome;

@SpringBootTest
class ForbisApplicationTests {
	
	@Test
	void OutcomeTest() {
		Outcome outcome = new Outcome();
		assertThat(outcome.getId()).isNull();
		assertThat(outcome.getCountedText()).isNull();

		outcome.setCountedText("test");
		
		assertThat(outcome.getId()).isNull();
		assertThat(outcome.getCountedText()).isNotNull();
		
	}
	
	@Test
	void TextDecompositionSetup() {
		TextDecomposition TD = new TextDecomposition();
		String TestArray[];
		
		TestArray=TD.Setup("Test of a test in a test like a test");
		
		assertThat(TestArray).hasOnlyElementsOfType(String.class);
		assertThat(TestArray).hasSize(5);
	}
	
	@Test
	void CharListUpdate() {
		CharLists cl = new CharLists();
		cl.setList();
		cl.Update("a", "test");
		assertThat(cl.getList("a").get(1)).asString().contains("1");
		assertThat(cl.getList("a").get(2)).asString().contains("test");
		assertThat(cl.getList("a")).hasSize(3);
		assertThat(cl.getList("a")).hasOnlyElementsOfType(String.class);
		assertThat(cl.getList("a")).contains("a","1","test");
	}
	
	@Test
	void CharListSetup() {
		CharLists cl = new CharLists();
		cl.setList();
		
		assertThat(cl.getList("a").get(0)).isNotNull();
		assertThat(cl.getList("a").get(1)).isNotNull();
		
		assertThat(cl.getList("b").get(0)).isNotNull();
		assertThat(cl.getList("b").get(1)).isNotNull();
		
		assertThat(cl.getList("c").get(0)).isNotNull();
		assertThat(cl.getList("c").get(1)).isNotNull();
		
		assertThat(cl.getList("d").get(0)).isNotNull();
		assertThat(cl.getList("d").get(1)).isNotNull();
		
		assertThat(cl.getList("e").get(0)).isNotNull();
		assertThat(cl.getList("e").get(1)).isNotNull();
		
		assertThat(cl.getList("f").get(0)).isNotNull();
		assertThat(cl.getList("f").get(1)).isNotNull();
		
		assertThat(cl.getList("g").get(0)).isNotNull();
		assertThat(cl.getList("g").get(1)).isNotNull();
		
		assertThat(cl.getList("h").get(0)).isNotNull();
		assertThat(cl.getList("h").get(1)).isNotNull();
		
		assertThat(cl.getList("i").get(0)).isNotNull();
		assertThat(cl.getList("i").get(1)).isNotNull();
		
		assertThat(cl.getList("j").get(0)).isNotNull();
		assertThat(cl.getList("j").get(1)).isNotNull();
		
		assertThat(cl.getList("k").get(0)).isNotNull();
		assertThat(cl.getList("k").get(1)).isNotNull();
		
		assertThat(cl.getList("l").get(0)).isNotNull();
		assertThat(cl.getList("l").get(1)).isNotNull();
		
		assertThat(cl.getList("m").get(0)).isNotNull();
		assertThat(cl.getList("m").get(1)).isNotNull();
		
		assertThat(cl.getList("n").get(0)).isNotNull();
		assertThat(cl.getList("n").get(1)).isNotNull();
		
		assertThat(cl.getList("o").get(0)).isNotNull();
		assertThat(cl.getList("o").get(1)).isNotNull();
		
		assertThat(cl.getList("p").get(0)).isNotNull();
		assertThat(cl.getList("p").get(1)).isNotNull();
		
		assertThat(cl.getList("q").get(0)).isNotNull();
		assertThat(cl.getList("q").get(1)).isNotNull();
		
		assertThat(cl.getList("r").get(0)).isNotNull();
		assertThat(cl.getList("r").get(1)).isNotNull();
		
		assertThat(cl.getList("s").get(0)).isNotNull();
		assertThat(cl.getList("s").get(1)).isNotNull();
		
		assertThat(cl.getList("t").get(0)).isNotNull();
		assertThat(cl.getList("t").get(1)).isNotNull();
		
		assertThat(cl.getList("u").get(0)).isNotNull();
		assertThat(cl.getList("u").get(1)).isNotNull();
		
		assertThat(cl.getList("v").get(0)).isNotNull();
		assertThat(cl.getList("v").get(1)).isNotNull();
		
		assertThat(cl.getList("w").get(0)).isNotNull();
		assertThat(cl.getList("w").get(1)).isNotNull();
		
		assertThat(cl.getList("x").get(0)).isNotNull();
		assertThat(cl.getList("x").get(1)).isNotNull();
		
		assertThat(cl.getList("y").get(0)).isNotNull();
		assertThat(cl.getList("y").get(1)).isNotNull();
		
		assertThat(cl.getList("z").get(0)).isNotNull();
		assertThat(cl.getList("z").get(1)).isNotNull();
	}
	

}