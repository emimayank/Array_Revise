
public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="waterbottle";
		String str2="erbottlewat";
		boolean b=isSubstring(str1,str2);
		System.out.println(b);
	}

	private static boolean isSubstring(String str1, String str2) {
		// TODO Auto-generated method stub
		String str3=str2+str2;
		if(str3.contains(str1)){
			return true;
		}
		return false;
	}

}
