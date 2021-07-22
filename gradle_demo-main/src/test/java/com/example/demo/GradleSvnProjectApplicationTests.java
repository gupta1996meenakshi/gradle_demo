package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GradleSvnProjectApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
    void test_a_ok() {
        assertTrue(true);
    }

    @Test
    void test_b_ok() {
        assertTrue(true);
    }
}
