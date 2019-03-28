package com.intvw.practise;

import java.util.Date;

public class StaticTestExample {

private static final String createDate;
private static  String modifyDate;

static{
	createDate = new Date().toString();
	System.out.println("createDate --"+createDate);
}

public static synchronized void updateModifyDate()
{
	modifyDate = new Date().toString();
	System.out.println("modifyDate --"+modifyDate);
}

}
