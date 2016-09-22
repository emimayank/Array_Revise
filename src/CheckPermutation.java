import java.util.Arrays;

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="mayank";
		String str2="ayankms";
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1,ch2)){
			System.out.println("Yes, they're permutations");
		}
		else{
			System.out.println("Nope, they're not permutations");
		}
	}

}
