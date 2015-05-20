class TestMahasiswa
{
	public static void main(String[] args) 
	{
		Mahasiswa mhs = new Mahasiswa("Andreas", 19);
		mhs.tampilkanBiodata();

		System.out.println();

		mhs.setUmur(19);
		mhs.tampilkanBiodata();		
	}	
}