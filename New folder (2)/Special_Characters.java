class Special_Characters{
	public static void main(String[] args) {
		String str="a!B@#123Arun";
		System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));

	}
}