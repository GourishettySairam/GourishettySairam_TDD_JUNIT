package com.epam.TDD_JUNIT;



public class RemoveFirstTwo 
{
	public String remove(String s)
	{
		s=s.toUpperCase();
		StringBuilder sb = new StringBuilder();
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(i==0 && ch[0]=='A')
			{
				continue;
			}
			else if(i==1 && ch[1]=='A')
			{
				continue;
			}
			else
			{
				sb.append(ch[i]);
			}
		}
		return sb.toString();
	}

}
