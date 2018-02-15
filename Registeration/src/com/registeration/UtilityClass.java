package com.registeration;

import java.util.ArrayList;
import java.util.List;

public class UtilityClass {
List<Register> reglist =new ArrayList<>();
Register r = new Register();
public Boolean registering(Register r)
{
	Boolean regStatus=false;
	if(reglist.add(r));
	{
		regStatus=true;
	}
	return regStatus;
}
public boolean login(String uid,String pwd)
{
	Boolean uidPresent = false;
	for(int i=0;i<reglist.size();i++)
	{
		{
		 uidPresent= true;
		 break;
		}
	}
	return uidPresent;
	
}

public String fup(String emaild)
{
	String userId=null;
	for(int i=0;i<reglist.size();i++)
	{
		if(reglist.get(i).getEmailId().equals(emaild))
				{
			 userId = reglist.get(i).getUid();
			 System.out.println(userId);
			break;
				}
		
}
	return userId;
	
}
public void restePwd(String uid,String newPwd)
{
	for(int i=0;i<reglist.size();i++)
	{
		if(reglist.get(i).getUid().equals(uid))
		{
			reglist.get(i).setPwd(newPwd);
			System.out.println(reglist.get(i).getPwd());
			
		}
		else
		{
			System.out.println("user not found");
		}
		}
}
}
