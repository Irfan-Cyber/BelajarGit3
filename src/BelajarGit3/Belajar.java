package BelajarGit3;
import static BelajarGit3.Kucing.*;
public class Belajar {
    public static void main(String[] args){
        int umur;
        String nama;
        String jabatan;
        System.out.println("Hello world, saya udah ubah tulisannya");

        umur = 17;
        nama = "Si ganteng";
        jabatan = "Penyihir";

        Manusia bejo = new Manusia(umur,nama,jabatan);

        System.out.println("Nama: "+bejo.getNama()+"\n"+"Umur: "+bejo.getUmur()+"\n"+"cita-cita: "+bejo.getJabatan());

        System.out.println("Bambang punya kucing bunyinya");
        bicara();
    }
}
