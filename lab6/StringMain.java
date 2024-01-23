import java.util.*;

class StringMain {
	public static void main(String args[]) {
		/* 1 */ char arr[] = { 'B', 'M', 'S', 'C', 'E' };
		String s1 = new String(arr);
		String s2 = new String("bmsce");
		String s3 = new String(s2);
		/* 2 */ String s4 = "some";
		System.out.println("String length: " + s4.length() + "\n" + "Concatenated string: " + s4.concat(s2));
		/* 3 */ int d = 55;
		String sd = Integer.toString(d);
		System.out.println("Converting Integer to string: " + d + " -> " + sd);
		/* 4 */ char res[] = new char[20];
		String str = new String("Welcome to BMSCE College");
		str.getChars(10, 16, res, 0);
		/* 5 */ byte byte_arr[] = s4.getBytes();
		for (int i = 0; i < 4; i++) {
			System.out.print(byte_arr[i] + " ");
		}
		/* 6 */ System.out.println("BMSCE equals BMSCE: " + s1.equals("BMSCE"));
		System.out.println("BMSCE equals some: " + s1.equals(s4));
		System.out.println("BMSCE equalsIC Bmsce: " + s1.equalsIgnoreCase(s2));
		/* 7 */ System.out.println(str.regionMatches(11, "BMSCE College", 0, 11));
		/* 8 */ System.out.println(str.startsWith("Welcome"));
		/* 9 */ System.out.println(str.endsWith("College"));
		/* 10 */ String s5 = new String("BMSCE");
		System.out.println("Reference equal b/w s1 and s5 (==): " + (s1 == s5));
		System.out.println("Value equal b/w s1 and s5 (equals()): " + s1.equals(s5));
		/* 11 */ String str_arr[] = { "van", "watch", "ball", "cat", "xmas", "yatch", " zee", "apple", "ice", "jug",
				"kite", "lift", "man", "net", "orange", "dog", "ent", "free", "gun", "hen", "parrot", "queen", "ring",
				"star", "tree", "umbrella" };
		for (int i = 0; i < str_arr.length; i++) {
			for (int j = i + 1; j < str_arr.length; j++) {
				if (str_arr[i].compareTo(str_arr[j]) > 0) {
					String temp;
					temp = str_arr[i];
					str_arr[i] = str_arr[j];
					str_arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < str_arr.length; i++) {
			System.out.print(str_arr[i] + " ");
		}
		/*12*/ String num_arr[] = {"1", "4", "3", "2", "5"};
		for (int i = 0; i < num_arr.length-1; i++) {
			for (int j = i + 1; j < num_arr.length; j++) {
				if (num_arr[i].compareTo(num_arr[j]) > 0) {
					String temp;
					temp = num_arr[i];
					num_arr[i] = num_arr[j];
					num_arr[j] = temp;
				}
			}
		}
		System.out.println("\n");
		for (int i = 0; i < num_arr.length; i++) {
			System.out.print(num_arr[i] + " ");
		}
        System.err.println("\n");
		/*13*/ String originalString = "This is a test. This is, too.";
        String replacedString = new String("");
        int beginIndex = 0;
        int indexOfis = originalString.indexOf("is");
        while (indexOfis != -1) {
            replacedString += originalString.substring(beginIndex, indexOfis);
            System.out.println(replacedString);
            replacedString += "was";
            System.out.println(replacedString);
            beginIndex = indexOfis+2;
            indexOfis = originalString.indexOf("is", indexOfis + 2);
            if (indexOfis == -1) replacedString += originalString.substring(beginIndex); 
        }
        // System.out.println(originalString.substring(indexOfis+2));

        System.out.println("Original string: " + originalString);
        System.out.println("Replaced string: " + replacedString);

        /*14*/ System.out.println("Concatenation example: hello + world = " + "hello".concat("world")); 

        /*15*/ System.out.println("Replacing ll with mm gives us: " + "College".replace("ll", "mm"));

        /*16*/ System.out.println("Trimming example: " + "   Hello World    ".trim());

        /*18*/
        StringBuffer exp = new StringBuffer("Something");
        exp.setLength(10);
        char[] buffer = new char[4]; exp.getChars(0, 4, buffer, 0); String buf = new String(buffer);
        System.out.println("Length: " + exp.length());
        System.out.println(exp.charAt(0) + " " + buf + " " + exp.reverse() + " " + exp.substring(0, 3)); exp.reverse();
        exp.append('c'); exp.insert(0, 'K'); exp.replace(0, 1, "L");
        System.out.println(exp);
        exp.deleteCharAt(0); exp.delete(0, 4);
        System.out.println(exp);
    }
        
}
