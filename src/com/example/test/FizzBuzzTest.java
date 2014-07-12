package com.example.test;

import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.hamcrest.collection.IsIterableContainingInOrder;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.matchers.JUnitMatchers.*;

import com.example.FizzBuzz;


public class FizzBuzzTest {

	public List<String> expectedOutput;
	
	@Before
	public void setup() throws IOException {
		expectedOutput = Files
				.lines(Paths.get("resources", "expected-output.txt"))
				.map(s -> s.trim()).filter(s -> !s.isEmpty())
				.collect(Collectors.toList());
	}

	@Test
	public void test() {
		assertThat(FizzBuzz.getOutput(), IsIterableContainingInOrder.contains(expectedOutput.toArray()));
	}
}
