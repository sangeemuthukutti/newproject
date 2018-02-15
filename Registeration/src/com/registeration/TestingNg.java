package com.registeration;

import org.testng.annotations.Test;

public class TestingNg extends UtilityClass{
	Register r = new Register();
@Test
public void registerUserTest()
{
	
	r.setName("sangeetha");
	r.setEmailId("hsdfhs");
	r.setMobno("435365");
	r.setUid("test");
	r.setPwd("test1234");
	registering(r);
}
@Test(priority=2)
public void loggingIn()
{
	Boolean f = login("test","test1234");

	
}
@Test(priority=3)
public void forgetUP()
{
	String userid = fup("hsdfhs");
	System.out.println("username "+ userid);
}
@Test(priority=4)
public void resettingPw()
{
	restePwd("test","test6789");
}
}
