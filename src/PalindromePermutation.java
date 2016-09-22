import java.util.HashMap;

public class PalindromePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="tact coa";
		HashMap<Character, Integer>map=new HashMap<>();
		for(char ch:str.toCharArray()){
			if(ch!=' '){
				if(map.containsKey(ch)){
					int i=map.get(ch);
					map.put(ch,i+1);
				}
				else{
					map.put(ch,1);
				}	
			}	
		}
		int odd_count=0;
		for(Integer value:map.values()){
			if(value%2==1){
				odd_count++;
			}
		}
		if(odd_count>1){
			System.out.println("False");
		}
		else{
			System.out.println("True");
		}
	}

}
