package com.battle;

import com.battle.service.ComputeService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ConsumerApplication.class)
public class ConsumerApplicationTests {

	@Autowired
	private ComputeService computeService;

	@Test
	public void testAdd() throws Exception {
		System.out.println("success");
		Assert.assertEquals("compute-service:add", new Integer(3), computeService.add(1, 2));

	}

}
