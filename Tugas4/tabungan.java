class tabungan {

	private double simpanan;
	private String pemilik;
	private double rekening;
	private int bunga;

	public tabungan()
	{
		simpanan	= 10000000;
		pemilik	= "Andreas Surya Jaya";
		rekening	= 1441180150;
		bunga	= 2;
	}
	public tabungan(double simpananInput, String pemilikInput)
	{
		simpanan	= simpananInput;
		pemilik	= pemilikInput;
	}
	public tabungan(double simpananInput, String pemilikInput, double rekeningInput)
	{
		simpanan	= simpananInput;
		pemilik	= pemilikInput;
		rekening = rekeningInput;
	}
	public tabungan(double simpananInput, String pemilikInput, double rekeningInput, int bungaInput)
	{
		simpanan	= simpananInput;
		pemilik	= pemilikInput;
		rekening = rekeningInput;
		bunga = bungaInput;
	}

	public void menabung()
	{
		System.out.println("anda telah menabung 10000000");
	}
	public void mengambil()
	{
		System.out.println("penarikan tunai");
	}
	public void transfer()
	{
		System.out.println("mentransfer 500000");
	}
	public void menerima()
	{
		System.out.println("menerima 2000000");
	}
	public void ceksaldo()
	{
		System.out.println("saldo anda 10000000");
	}


	public double getsimpanan()
	{
		return simpanan;
	}
	public String getpemilik()
	{
		return pemilik;
	}
	public double getrekening()
	{
		return rekening;
	}
	public int getbunga()
	{
		return bunga;
	}


	public void setsimpanan(double s)
	{
		simpanan = s;
	}
	public void setpemilik(String p)
	{
		pemilik = p;
	}
	public void setrekening(double r)
	{
		rekening = r;
	}
	public void setbunga(int b)
	{
		bunga = b;
	}

}