class testcircle {
	public static void main(String[] args) {
		//instasiasi objek
		//namaClass nama objek=nama konstruktor
		circle cahya = new circle();
		circle ardi = new circle(30);
		circle akbar = new circle(30,"abanggalau");

		System.out.println("Radius = " +cahya.radius +"color=" +cahya.color+"luas="+cahya.getArea());
		System.out.println("Radius = " +ardi.radius +"color" +ardi.color+"luas="+ardi.getArea());
		System.out.println("Radius = " +akbar.radius +"color" +akbar.color+"luas="+akbar.getArea());
	}
}