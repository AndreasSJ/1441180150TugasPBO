class mobil {

	private double kecepatan;
	private String posisi;
	private String platNomor;
	private String merk;
	private String warna;
	private int mesin;

	public mobil()
	{
		kecepatan	= 80;
		posisi	= "malang";
		platNomor	= "n 123 ab";
		merk	= "honda";
		warna = "hitam";
		mesin = 1200;
	}
	public mobil(double kecepatanInput, String posisiInput)
	{
		kecepatan	= kecepatanInput;
		posisi	= posisiInput;
	}
	public mobil(double kecepatanInput, String posisiInput, String platnomorInput)
	{
		kecepatan	= kecepatanInput;
		posisi	= posisiInput;
		platNomor = platnomorInput;
	}
	public mobil(double kecepatanInput, String posisiInput, String platnomorInput, String merkInput)
	{
		kecepatan	= kecepatanInput;
		posisi	= posisiInput;
		platNomor = platnomorInput;
		merk = merkInput;
	}
	public mobil(double kecepatanInput, String posisiInput, String platnomorInput, String merkInput, String warnaInput)
	{
		kecepatan	= kecepatanInput;
		posisi	= posisiInput;
		platNomor = platnomorInput;
		merk = merkInput;
		warna = warnaInput;
	}
	public mobil(double kecepatanInput, String posisiInput, String platnomorInput, String merkInput, String warnaInput, int mesinInput)
	{
		kecepatan	= kecepatanInput;
		posisi	= posisiInput;
		platNomor = platnomorInput;
		merk = merkInput;
		warna = warnaInput;
		mesin = mesinInput;
	}

	public void maju()
	{
		System.out.println("berjalan maju");
	}
	public void mundur()
	{
		System.out.println("berjalan mundur");
	}
	public void berhenti()
	{
		System.out.println("saat lampu merah berhenti");
	}
	public void belok()
	{
		System.out.println("berbelok");
	}
	public void ngebut()
	{
		System.out.println("anda ngebut");
	}
	public void ngerem()
	{
		System.out.println("anda ngerem");
	}


	public double getkecepatan()
	{
		return kecepatan;
	}
	public String getposisi()
	{
		return posisi;
	}
	public String getplatnomor()
	{
		return platNomor;
	}
	public String getmerk()
	{
		return merk;
	}
	public String getwarna()
	{
		return warna;
	}
	public int getmesin()
	{
		return mesin;
	}

	public void setkecepatan(double k)
	{
		kecepatan = k;
	}
	public void setposisi(String p)
	{
		posisi = p;
	}
	public void setplatnomor(String pl)
	{
		platNomor = pl;
	}
	public void setmerk(String m)
	{
		merk = m;
	}
	public void setwarna(String w)
	{
		warna = w;
	}
	public void setmesin(int mS)
	{
		mesin = mS;
	}
}