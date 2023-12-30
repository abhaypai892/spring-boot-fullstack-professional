package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*; //newly added
import org.springframework.boot.test.context.SpringBootTest;


class DemoApplicationTests {

	Testclass underTest = new Testclass();
	@Test
	void addstwonumbers() {
		//given
		int firstnumber = 10;
		int secondnumber = 20;
		
		//when
		int result = underTest.add(firstnumber,secondnumber);

		//then
		assertThat(result).isEqualTo(30);
	}

	@Test
	void sub2numbers() {

		int f = 10;
		int s = 20;
		
		int r = underTest.sub(f,s);
		
		assertThat(r).isEqualTo(-10);
	}

	class Testclass{
		int add(int a, int b){
			return a + b;
		}
		int sub(int a, int b){
			return a - b;
		}
	}

}
