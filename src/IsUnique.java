import java.util.Arrays;

public class IsUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="yank";
		char ch[]=str1.toCharArray();
		Arrays.sort(ch);
		int flag=0;
		for(int i=0;i<ch.length-1;i++){
			if(ch[i]==ch[i+1]){
				flag=1;
			}
		}
		if(flag==1){
			System.out.println("Not Unique");
		}
		else{
			System.out.println("Unique");
		}
	}

}
