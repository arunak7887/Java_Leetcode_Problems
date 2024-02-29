class Email{
	public static void main(String[] args) {
		String str="arunkinwad02@gmail.com";
		int i=str.indexOf("@");
		String uname=str.substring(0,i);
		String domain=str.substring(i+1,str.length());

		System.out.println("UserName:"+uname);
		System.out.println("Domain:"+domain);
		System.out.println(domain.startsWith("gmail"));

	}
}