class testmobil{
	public static void main(String[] args) {

	mobil mblsatu = new mobil();
	mobil mbldua = new mobil(80,"malang");
	mobil mbltiga = new mobil(90, "surabaya", "w123as");
	mobil mblempat = new mobil(100, "sidorjo");

	System.out.println("mobil");

	System.out.println(" ");

	System.out.println("kecepatan : "+mblsatu.getkecepatan());
	System.out.println("posisi    : "+mblsatu.getposisi());
	System.out.println(" ");
	mblsatu.maju();
	mblsatu.mundur();
	mblsatu.berhenti();;
	mblsatu.belok();
	mblsatu.ngebut();
	mblsatu.ngerem();
	System.out.println("anda memiliki mobil : "+ mblsatu.getmesin()+" %");

	System.out.println(" ");

	mbldua.setposisi("malang");
	mbldua.setmesin(2);

	System.out.println("kecepatan : "+mbldua.getkecepatan());
	System.out.println("posisi    : "+mbldua.getposisi());
	System.out.println(" ");
	mbldua.maju();
	mbldua.mundur();
	mbldua.berhenti();;
	mbldua.belok();
	mbldua.ngebut();
	mbldua.ngerem();
	System.out.println("anda memiliki mobil : "+ mbldua.getmesin()+" %");

	System.out.println(" ");

	mbltiga.setmesin(3);

	System.out.println("kecepatan : "+mbltiga.getkecepatan());
	System.out.println("posisi    : "+mbltiga.getposisi());
	System.out.println(" ");
	mbltiga.maju();
	mbltiga.mundur();
	mbltiga.berhenti();;
	mbltiga.belok();
	mbltiga.ngebut();
	mbltiga.ngerem();
	System.out.println("anda memiliki mobil : "+ mbltiga.getmesin()+" %");

	System.out.println(" ");

	System.out.println("kecepatan : "+mblempat.getkecepatan());
	System.out.println("posisi    : "+mblempat.getposisi());
	System.out.println(" ");
	mblempat.maju();
	mblempat.mundur();
	mblempat.berhenti();;
	mblempat.belok();
	mblempat.ngebut();
	mblempat.ngerem();
	System.out.println("anda memiliki mobil : "+ mblempat.getmesin());

	System.out.println(" ");
	}
}

