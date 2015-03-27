import java.util.Scanner;
public class soal10 {
	public static void main(String[] args)
	{
	System.out.println("menggambar persegi dengan menggunakan karakter #*");
	System.out.print("sisi persegi: ");
	Scanner nilai=new Scanner(System.in);
	int sisi = nilai.nextInt();
	System.out.println(" ");
	for (int i=1; i<=sisi; i++ ) 
		{
			for (int j=1; j<=sisi; j++ ) 
			{
			System.out.print("#");	
			}
			System.out.println("");
		}
	}
}