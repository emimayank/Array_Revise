
public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aabcccccaaaa";
		String str2="";
		int freq=1;
		for(int i=0;i<str.length()-1;i++){
			if(str.charAt(i)==str.charAt(i+1)){
				freq++;
			}
			else{
				str2=str2+str.charAt(i)+freq;
				freq=1;
			}
		}
		System.out.println(str2+str.charAt(str.length()-1)+freq);
	}

}
