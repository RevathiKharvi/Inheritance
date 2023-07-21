package com.gqt.entities;

public class Project 
{
	private int pId;
	private String pName;
	private String pMgr;
	
	public Project(int pId, String pName, String pMgr) 
	{
		this.pId = pId;
		this.pName = pName;
		this.pMgr = pMgr;
	}

	public int getpId() 
	{
		return pId;
	}

	public String getpName() 
	{
		return pName;
	}

	public String getpMgr() 
	{
		return pMgr;
	}
	
	
	
	

}
