package recursivecoding;
/**
 * A class that has a method to recursively replaces characters in a String.
 * 
 * @author Charles Hoot
 * @version 4.0
 */
public class RecursiveStringReplace
{

    /**
     * replace - Replace all instances of one character by another.
     * 
     * @param  s   The string to do the replacement on.
     * @param  from   The character to be replaced.
     * @param  to   the character to change to.
     * @return     A new string with the appropriate characters replaced.
     */
    public String replace(String s, char from, char to)
    {
      

        // IMPLEMENT THIS RECURSIVE METHOD
        if(s.length()==0)
        	return "";
        if(s.charAt(0) == from)
        	return to+""+replace(s.substring(1,s.length()),from, to);
        return s.charAt(0)+""+replace(s.substring(1, s.length()),from, to);
    }

        public static void main(String[] args) {

        	RecursiveStringReplace sr = new RecursiveStringReplace();

        	System.out.println(sr.replace("apple", 'a','b'));

        	}

        	
    }



