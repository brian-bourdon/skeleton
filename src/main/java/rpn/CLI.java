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
    	String[] parts = expression.split(" ");
    	long res = 0;
    	for(int i = 0; i < parts.length; i++)
    	{
    		try 
    		{
    	        long l = Long.parseLong(parts[i]);
    	        res += l;
    	    } catch (NumberFormatException | NullPointerException nfe)
    		{
    	    	
    		}
    	}
    		return res;	
    }
}
