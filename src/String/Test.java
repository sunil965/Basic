package String;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "AABBA";
        int count =0;
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i-1) == (str.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
		/*
		 * if(count==str.length()) System.out.println("true"); else
		 * System.out.println("false");
		 */
	}

	
	/*
	 * Map<String,Integer> map = new HashMap<>(); for(String st:s){ int count =0;
	 * for(Strring str: st){ if(str.equals(st)) count++; } map.put(st,count); }
	 * Set<String> set = map.keyset(); for(String key: set){ int size =
	 * map.get(key);
	 * 
	 * }
	 */
}
