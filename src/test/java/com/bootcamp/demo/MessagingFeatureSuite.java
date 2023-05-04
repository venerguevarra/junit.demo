package com.bootcamp.demo;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ConsoleMessageRendererTest.class, StringMessageProviderTest.class })
public class MessagingFeatureSuite {

}
