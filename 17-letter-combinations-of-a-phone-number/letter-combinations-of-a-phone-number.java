class Solution {
    	private static final String[] KEYS = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
    
    	public static List<String> letterCombinations(String digits) {
    		List<String> result = new LinkedList<String>();
    		combination(digits,"",result);
    		return result;
    	}
        static void combination(String s , String ans , List<String> result){
                if(s.length()== 0){
                    result.add(ans);
                    return;
                }
                String key = KEYS[s.charAt(0)-48];
                for(int i=0;i<key.length();i++){
                    combination(s.substring(1),ans+key.charAt(i),result);
                }
        }
    
    	
    }