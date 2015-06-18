/**
 * Created by LENOVO on 18-Jun-15.
 */
public class TestUnit {
    public static void main(String[] args) {
        Rekening aa = new Rekening(35000000.0);
        Nasabah bb = new Nasabah("Andre","Surya",aa);
        System.out.println(bb);
        bb.setAccount(aa);

        System.out.println(bb.toString());

        aa.tarik(2000000.00);

        System.out.println("tarik Rp. 2000000.00");
        System.out.println("tampilkan saldo sekarang = " + aa.getSaldo());

        aa.setor(2000000.00);

        System.out.println("setor Rp. 2000000.00");
        System.out.println("tampilkan saldo sekarang = " + aa.getSaldo());
    }
}
