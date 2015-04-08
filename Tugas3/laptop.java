
class laptop{
	
	private String merk;
	private String warna;
	private String wifi;
	private int baterai;

	public laptop()
	{
		merk	= "lenovo";
		warna	= "hitam";
		wifi	= "terhubung";
		baterai	= 50;
	}
	public laptop(String merkInput, String warnaInput)
	{
		merk	= merkInput;
		warna	= warnaInput;
	}
	public laptop(String merkInput, String warnaInput, String wifiInput)
	{
		merk	= merkInput;
		warna	= warnaInput;
		wifi	= wifiInput;
	}
	public laptop(String merkInput, String warnaInput, String wifiInput, int bateraiInput)
	{
		merk	= merkInput;
		warna	= warnaInput;
		wifi	= warnaInput;
		baterai	= bateraiInput;
	}

	public void menyala()
	{
		System.out.println("welcome to laptop");
	}
	public void mati()
	{
		System.out.println("thankyou have a nice day");
	}
	public void indikatorbaterai()
	{
		System.out.println("persentase baterai : " + baterai + "%");
	}
	public void indikatorwifi()
	{
		System.out.println("wifi : " + wifi);
	}

	//setter and getter
	public String getmerk()
	{
		return merk;
	}
	public String getwarna()
	{
		return warna;
	}
	public String getwifi()
	{
		return wifi;
	}
	public int getbaterai()
	{
		return baterai;
	}
}