class Extra_Spaces{
	public static void main(String[] args) {
		String str="abc    de fg hijk";
		System.out.println(str.replaceAll("\\s+"," "));
	}
}