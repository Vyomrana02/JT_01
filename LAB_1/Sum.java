class Sum{  
    public static void main(String args[])
    {
	if(args.length > 0)
           {
               try
                 {
      			int sum=0,t=0;
      			int num = Integer.parseInt(args[0]);
        		for(int i=num;i>=1;i=i/10){
		           t=i%10;
		           sum=sum+t;
		       }
        
		        System.out.println("sum of digit="+sum);
     		}    
                 catch(NumberFormatException nfe)
                 {
                     System.out.println("Argument/s must be the integer value");
                 }
}
    
}}