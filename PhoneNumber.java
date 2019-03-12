package com.intvw.practise;

public class PhoneNumber
{
private int areaCode;
private int prefix;
private int lastfour;

public PhoneNumber(int areaCode,int preFix,int lastFour ) {
	// TODO Auto-generated constructor stub
	this.areaCode=areaCode;
	this.prefix=preFix;
	this.lastfour=lastFour;
}

public String showCount()
{
return ""+this.areaCode+this.prefix+this.lastfour;
}

public int getAreaCode() {
	return areaCode;
}



public int getPrefix() {
	return prefix;
}



public int getLastfour() {
	return lastfour;
}




}
