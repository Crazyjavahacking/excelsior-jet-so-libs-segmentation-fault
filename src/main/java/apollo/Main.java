package apollo;


import apollo.api.PublicApi;
import apollo.impl.PrivateImpl;

import java.io.IOException;

import org.apache.commons.lang3.SystemUtils;


public class Main {

  public static void main(String... args) throws IOException, ReflectiveOperationException {
    System.out.println( "Hello world");

    staticUsageOfCommonsLang();
    dynamicUsageOfCommonsIO();

    anonymousClassFromInterface();
    instanceUsingConstructor();
  }

  private static void staticUsageOfCommonsLang() {
    System.out.println("Java Home: " + SystemUtils.getJavaHome());
  }

  private static void dynamicUsageOfCommonsIO() throws ReflectiveOperationException {
    Class fileSystemUtilsClass = Class.forName("org.apache.commons.io.FileSystemUtils");

    System.out.println("Free space: " + fileSystemUtilsClass.getMethod("freeSpaceKb").invoke(null));
  }

  private static void anonymousClassFromInterface() {
    PublicApi instance = new PublicApi() {
      @Override
      public String apiVersion() {
        return "1.0";
      }
    };

    System.out.println("anonymous instance: " + instance);
  }

  private static void instanceUsingConstructor() {
    PublicApi instance = new PrivateImpl();

    System.out.println("instance using constructor: " + instance);
  }
}
