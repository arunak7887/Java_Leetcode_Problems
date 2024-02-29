class Count_Words{
	public static void main(String[] args) {
		String str="abc def jgh ijk lmn";
		
		String Words[]=str.split("\\s");
		System.out.println(Words.length);
	}
}