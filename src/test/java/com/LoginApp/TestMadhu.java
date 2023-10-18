package com.LoginApp;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMadhu {
      @Test
      public void test1()
      {
    	Madhu m=new Madhu();
        Assert.assertEquals(1,m.checkLogin("manvitha", "manvi@95"));
      }
      @Test
      public void test2()
      {
    	  Madhu m=new Madhu();
    	  Assert.assertEquals(0,m.checkLogin("manvi","manvi@123"));
      }
}
