package com.yeff.mq.mqTest;

import com.yeff.mq.mqTest.mq.HelloSender;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

@Ignore
public class MqTestApplicationTests {
		@Autowired
		private HelloSender helloSender;
		@Test
		public void hello() throws Exception {
			helloSender.send();
		}
	}



