import java.util.Scanner;
public class soal11 
{
public static void main(String[] args)
	{
	System.out.println("menggambar sebuah persegi menggunakan karakter #*");
	System.out.print("sisi persegi =");
	Scanner nilai = new Scanner(System.in);
	int sisi = nilai.nextInt();
	for (int i=1; i<=sisi; i++) 
	{
					if (i%2==0) 
				{
				System.out.print(" ");	
				}
			for (int j=1; j<=sisi; j++) 
				{
				System.out.print("#");	
				}
				System.out.println(" ");
		}
	}
}