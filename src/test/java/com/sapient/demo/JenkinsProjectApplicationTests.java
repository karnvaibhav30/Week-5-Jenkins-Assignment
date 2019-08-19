package com.sapient.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JenkinsProjectApplicationTests {

	@Test
	public void contextLoads() {
	}
    @Test
    public void testAdd() {
    	Sum s1= new Sum();
    	assertEquals(15,s1.add(7,8));
    }
}
