package javaPgms;



public class FindingElementsFromString {
 public static String passWord="A0D7T1YA";
 
 public static void main(String[] args) {
        StringBuffer num = new StringBuffer (passWord.length () / 2);
        StringBuffer str = new StringBuffer (passWord.length () / 2);

        boolean isDigit = false;
        char ch;
  int passLength= passWord.length();

    for (int i = 0; i < passWord.length (); i++) {
             ch = passWord.charAt (i);
             isDigit = Character.isDigit (ch);

             if (isDigit==true) {
                num.append (' ');

                num.append (ch);

             }
             else {
                str.append (' ');

                str.append (ch);

             }
         }

         System.out.println ("OUTPUT-1 :::: " + num);
         System.out.println ("OUTPUT-2 :::: " + str);

 }
}