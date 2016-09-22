
public class Urlify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Mr. Smith      90 sum  30 ";
		String str2="";
		int spaces=0;
		System.out.println(str.length());
		for(char ch:str.toCharArray()){
			if(ch==' '){
				str2=str2+"%20";
			}
			else{
				str2=str2+ch;
			}
		}
		System.out.println(str2);

	}

}
