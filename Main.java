import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Sepatu spt = new Sepatu();

        //input

        System.out.println("=======================");
        System.out.println(" SILAHKAN PESAN SEPATU ");
        System.out.println("=======================");
        System.out.println("Masukkan merk sepatu : ");
        String merk = br.readLine();
        System.out.println("Masukkan tipe sepatu : ");
        String tipe = br.readLine();
        System.out.println("Masukkan ukuran sepatu : ");
        String ukuran = br.readLine();
        System.out.println("Masukkan warna sepatu : ");
        String warna = br.readLine();
        System.out.println("Masukkan harga sepatu : ");
        double harga = Double.parseDouble(br.readLine());

        spt.setMerk(merk);
        spt.setTipe(tipe);
        spt.setUkuran(ukuran);
        spt.setWarna(warna);
        spt.setHarga(harga);

        //output
        System.out.println("=====================================================");
        System.out.println("|               STRUCK PEMBELIAN SEPATU             |");
        System.out.println("=====================================================");
        System.out.println("Merk Sepatu                      : "+    spt.getMerk());
        System.out.println("Tipe Sepatu                      : "+ spt.getTipe());
        System.out.println("Ukuran Sepatu                    : "+ spt.getUkuran());
        System.out.println("Warna Sepatu                     : "+ spt.getWarna());
        System.out.println("Harga Sepatu Sebelum Diskon  =  Rp."+ spt.getHarga() );
        spt.keterangan();
    }
}



