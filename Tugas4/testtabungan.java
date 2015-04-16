class testtabungan{
public static void main(String[] args) {

	tabungan tbgsatu = new tabungan();
	tabungan tbgdua = new tabungan(700000,"joko");
	tabungan tbgtiga = new tabungan(100000, "paijo", 1441180020);
	tabungan tbgempat = new tabungan(200000, "saipul", 14488398, 1);

	System.out.println("layanan tabungan bank maling indonesia");

	System.out.println(" ");

	System.out.println("nama       : "+tbgsatu.getpemilik());
	System.out.println("norekening : "+tbgsatu.getrekening());
	System.out.println(" ");
	tbgsatu.menabung();
	tbgsatu.mengambil();
	tbgsatu.transfer();;
	tbgsatu.ceksaldo();
	System.out.println("anda memiliki bunga sebesar : "+tbgsatu.getbunga()+" %");

	System.out.println(" ");

	tbgdua.setrekening(1441189012);
	tbgdua.setbunga(2);

	System.out.println("nama       : "+tbgdua.getpemilik());
	System.out.println("norekening : "+tbgdua.getrekening());
	System.out.println(" ");
	tbgdua.menabung();
	tbgdua.mengambil();
	tbgdua.transfer();
	tbgdua.ceksaldo();
	System.out.println("anda memiliki bunga sebesar : "+tbgdua.getbunga()+" %");

	System.out.println(" ");

	tbgtiga.setbunga(3);

	System.out.println("nama       : "+tbgtiga.getpemilik());
	System.out.println("norekening : "+tbgtiga.getrekening());
	System.out.println(" ");
	tbgtiga.menabung();
	tbgtiga.mengambil();
	tbgtiga.transfer();;
	tbgtiga.ceksaldo();
	System.out.println("anda memiliki bunga sebesar : "+tbgtiga.getbunga()+" %");

	System.out.println(" ");


	System.out.println("nama       : "+tbgempat.getpemilik());
	System.out.println("norekening : "+tbgempat.getrekening());
	System.out.println(" ");
	tbgempat.menabung();
	tbgempat.mengambil();
	tbgempat.transfer();
;
	tbgempat.ceksaldo();
	System.out.println("anda memiliki bunga sebesar : "+tbgempat.getbunga()+" %");

	System.out.println(" ");
}
}
