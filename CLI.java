package rpn;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CLI {
    public static final void main(String[] args) {
        String expression = Stream.of(args).collect(Collectors.joining(" "));

        System.out.println("About to evaluate '" + expression + "'");
        long result = evaluate(expression);
        System.out.println("> " + result);
    }

    static long evaluate(String expression) {
    	char[] cs = expression.toCharArray();
    	long res = 0;
    	boolean only_digit = true;
    	for(int j = 0; j<cs.length; j++)
    	{
    		 if (! Character.isDigit(cs[j])) only_digit = false;
    	}
    	
    	if(! only_digit)
    	{
	    	for ( int i = 0; i< cs.length;i++)
	    	{
	    		   if (Character.isDigit(cs[i]))
	    		   {
	    			   String char_tmp = String.valueOf(cs[i]);
	    			   res += Long.parseLong(char_tmp);
	    		   }
	    	}
    	}
    	else res = Long.parseLong(expression);
    	return res;
    }
}
