package MscCAI;

public class MscCAI
{
public int SemITotal,SemIITotal;

public MscCAI()
{
}

public MscCAI(int m1,int m2)
{
	this.SemITotal=m1;
	this.SemIITotal=m2;
}

public void setsumtotal(int m1,int m2)
{
this.SemITotal=m1;
this.SemIITotal=m2;
}

public int gettotal()
{
return this.SemITotal + this.SemIITotal;
}

}



