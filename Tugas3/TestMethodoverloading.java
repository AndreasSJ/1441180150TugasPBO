//Example to illustrate Method overloading
public class TestMethodoverloading {
	public static int average(int nSatu, int nDua) {				// A
		return (nSatu+nDua)/2;
	}

	public static double average(double nSatu, double nDua) {		// B
		return (nSatu+nDua)/2;
	}

	public static int average(int nSatu, int nDua, int nTiga) {		// C
		return (nSatu+nDua+nTiga)/3;
	}
	public static int average(int nSatu, int nDua, int nTiga, int nEmpat) {		// C
		return (nSatu+nDua+nTiga+nEmpat)/4;
	}

	public static void main(String[] args) {
		System.out.println(average(1, 2));		// Use A
		System.out.println(average(1.0, 2.0));	// Use B
		System.out.println(average(1, 2, 3));	// Use C
		System.out.println(average(1.0, 2));	// Use B
		System.out.println(average(1, 2, 3, 4));
	}
}