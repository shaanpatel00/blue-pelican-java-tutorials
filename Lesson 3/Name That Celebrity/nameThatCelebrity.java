
public class nameThatCelebrity {
	public static void main(String args[]){
		String s1 = "Allan Alda";
		String s2 = "John Wayne";
		String s3 = "Gregory Peck";
		String s1a = s1 + ">>>" + s1.substring(2, 7);
		String s2a = s2 + ">>>" + s2.substring(2, 7);
		String s3a = s3 + ">>>" + s3.substring(2, 9);
		String finalString = s1a + "\n" + s2a + "\n" + s3a;
		System.out.println(finalString);
	}
}
