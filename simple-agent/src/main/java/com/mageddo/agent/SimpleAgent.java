package com.mageddo.agent;

import java.lang.instrument.Instrumentation;

public class SimpleAgent {
  public static void agentmain(String agentArgs, Instrumentation instrumentation) {
    System.out.printf("simple agent loaded: %s%n", agentArgs);
  }
}
