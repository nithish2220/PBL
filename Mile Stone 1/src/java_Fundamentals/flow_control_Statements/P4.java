package java_Fundamentals.flow_control_Statements;

public class P4 {
	public static void main(String args[])
	   {
	       if(args.length==0){
	           System.out.println("Please Enter characters");
	           System.exit(0);
	       }
	       if(args[0].charAt(0) > args[1].charAt(0))   
	    	   System.out.print(args[1]+","+args[0]);
	       else
	    	   System.out.print(args[0]+","+args[1]);
	   }

}
