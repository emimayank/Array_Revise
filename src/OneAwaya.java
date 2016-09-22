import java.util.Arrays;
import java.util.HashMap;

public class OneAwaya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="pale";
		String str2="pals";
		
		//HashMap<String, Integer>map=new HashMap<>();
		int diff=0,k=0;
		if(str1.length()==str2.length()){
			for( char ch:str1.toCharArray()){
				if(ch!=str2.charAt(k++)){
					diff++;
				}
			}
			if(diff>1){
				System.out.println("Not One Away");
			}
			else{
				System.out.println("One Away");
			}
		}
		else{
			boolean b=true;
			if(str1.length()>str2.length()){
				b=checkAway(str1,str2);
			}
			else{
				b=checkAway(str2,str1);
			}
			if(b==true){
				System.out.println("One Away");
			}
			else{
				System.out.println("Not One Away");
			}
		}
			
		
	}

	private static boolean checkAway(String str_long, String str_short) {
		
		// TODO Auto-generated method stub
		int index1=0,index2=0,flag=0;
		for(int i=0;i<str_short.length();i++){
			if(str_long.charAt(index1)!=str_short.charAt(index2)){
				index1++;
				flag++;
			}
			else{
				index1++;
				index2++;
			}
		}
		if(flag>1){
			return false;
		}
		else{
			return true;
		}
		
	}

}
