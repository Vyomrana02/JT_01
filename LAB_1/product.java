import java.util.Scanner;
class product{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		 System.out.println("ENTER CUSTOMER ID");
        int c_id = sc.nextInt();
        System.out.println("ENTER CUSTOMER CATEGORY");
        System.out.println("1. NEW");
        System.out.println("2. REGULAR");
        System.out.println("3. PREMIUM");
        int c_category= sc.nextInt();
        System.out.println("ENTER CUSTOMER NAME");
        sc.nextLine();
        String c_name = sc.nextLine();
        System.out.println("ENTER CUSTOMER CITY");
        String c_city = sc.nextLine();
        System.out.println("ENTER NO OF PRODUCTS");
        int n = sc.nextInt();
        float total=0;
        String[] p_name = new String[n+1];
        int[] p_id = new int[n+1];
        float[] p_price = new float[n+1];
        float[] p_discount = new float[n+1];
        for(int i=0;i<1;i++){
            sc.nextLine();
            System.out.println("ENTER PRODUCT NAME");
            p_name[i] = sc.nextLine();
            System.out.println("ENTER PRODUCT ID");
            p_id[i] = sc.nextInt();
            System.out.println("ENTER PRODUCT PRICE");
            p_price[i] = sc.nextFloat();
            System.out.println("ENTER PRODUCT DISCOUNT");
            p_discount[i] = sc.nextFloat();
            // System.out.println((i+1)+" "+p_id+" "+p_discount+" "+p_price);
            // System.out.println(p_discount+" "+p_price);
            total += p_price[i]*(1 - (p_discount[i]/100));
        }
        System.out.println("Hello "+c_name);
        System.out.print("Thank you for your purchase. You are our ");
        if(c_category==1)
            System.out.print("NEW ");
        else if(c_category==2)
            System.out.print("REGULAR ");
        else if(c_category==3)
            System.out.print("PREMIUM ");
        System.out.print("from "+c_city+".Please find your invoice:");
        System.out.println("\nSR\tPRODUCT\tDISCOUNT\tAMOUNT");
        for(int i=0;i<n;i++){
            System.out.println((i+1)+"\t"+p_name[i]+"\t"+p_discount[i]+"\t"+p_price[i]);
        }
        System.out.println("TOTAL: "+total);
	}
}