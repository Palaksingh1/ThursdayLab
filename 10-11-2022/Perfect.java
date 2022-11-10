package oopsconcept;

public class Perfect {
	 static boolean perfect(int num)
     {
     	int sum=0;
     	for(int i=1;i<num;i++)
     	{
     		if(num%i==0)
     			sum=sum+i;
     	}
     	if(sum==num)
     		return true;
     	else 
     		return false;
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     for(int i=1;i<=50;i++)
     {
    	 if(perfect(i))
    		 System.out.println(i);

     }
	}

}


