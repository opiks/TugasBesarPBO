import java.util.*;

/**
 *
 * @author kelompok 3 - Muhammad Taufik Zamaluin - Zhario Aditya - Nadhila
 *         Amalina N H - Daniel Adha
 */
public class TugasBesarPBO {
    public static void main(String[] args) {
        int pilih_menu, persen_absensi, persen_tugas, persen_uts, persen_uas, nilai_akhir;
        String nama_mahasiswa, nilai_absensi, nilai_tugas, nilai_uts, nilai_uas;
        Scanner input = new Scanner(System.in);
        List<String> mahasiswa = new ArrayList<String>(); // array nama mahasiswa
        List<String> mahasiswa_absensi = new ArrayList<String>(); // array nilai absensi
        List<String> mahasiswa_tugas = new ArrayList<String>(); // array nilai tugas
        List<String> mahasiswa_uts = new ArrayList<String>(); // array nilai uts
        List<String> mahasiswa_uas = new ArrayList<String>(); // array nilai uas
        List<String> mahasiswa_nilai_akhir = new ArrayList<String>(); // array poin nilai akhir
        do {
            System.out.println("======================================");
            System.out.println("=== Sistem Kemahasiwaan Kelompok 3 ===");
            System.out.println("======================================");
            System.out.println("1. Input Mahasiswa & Nilai");
            System.out.println("2. Tampilkan Data Mahasiswa & Nilai");
            System.out.println("3. Keluar");
            System.out.print("Pilih Menu : ");
            pilih_menu = input.nextInt(); // pilih menu
            switch (pilih_menu) {
                case 1:
                    input.nextLine(); // skiped input
                    System.out.print("Masukan Nama : ");
                    nama_mahasiswa = input.nextLine(); // input nama mahasiswa
                    mahasiswa.add(nama_mahasiswa); // push ke array mahasiswa

                    System.out.print("Masukan Nilai Absensi : ");
                    nilai_absensi = input.nextLine(); // input nilai absensi
                    if (Integer.parseInt(nilai_absensi) <= 100) { // check nilai absensi apabila lebih dari 100 maka
                                                                  // menutup aplikasi
                        mahasiswa_absensi.add(nilai_absensi); // push ke array mahasiswa_absensi
                    } else {
                        System.out.println("Nilai Tidak Boleh lebih Dari 100");
                        System.exit(0); // menutup aplikasi apabila nilai lebih dari 100
                    }
                    if (Integer.parseInt(nilai_absensi) != 0 || nilai_absensi != "") { // check nilai absensi apabila 0
                                                                                       // maka persen 0
                        persen_absensi = Integer.parseInt(nilai_absensi) * 10 / 100;
                    } else {
                        persen_absensi = 0;
                    }

                    System.out.print("Masukan Nilai Tugas : ");
                    nilai_tugas = input.nextLine(); // input nilai tugas
                    if (Integer.parseInt(nilai_tugas) <= 100) { // check nilai tugas apabila lebih dari 100 maka menutup
                                                                // aplikasi
                        mahasiswa_tugas.add(nilai_tugas); // push ke array mahasiswa_tugas
                    } else {
                        System.out.println("Nilai Tidak Boleh lebih Dari 100");
                        System.exit(0); // menutup aplikasi apabila nilai lebih dari 100
                    }
                    if (Integer.parseInt(nilai_tugas) != 0 || nilai_tugas != "") { // check nilai tugas apabila 0 maka
                                                                                   // persen 0
                        persen_tugas = Integer.parseInt(nilai_tugas) * 20 / 100;
                    } else {
                        persen_tugas = 0;
                    }

                    System.out.print("Masukan Nilai UTS : ");
                    nilai_uts = input.nextLine(); // input nilai uts
                    if (Integer.parseInt(nilai_uts) <= 100) { // check nilai uts apabila lebih dari 100 maka menutup
                                                              // aplikasi
                        mahasiswa_uts.add(nilai_uts); // push ke array mahasiswa_uts
                    } else {
                        System.out.println("Nilai Tidak Boleh lebih Dari 100");
                        System.exit(0); // menutup aplikasi apabila nilai lebih dari 100
                    }
                    if (Integer.parseInt(nilai_uts) != 0 || nilai_uts != "") { // check nilai uts apabila 0 maka persen
                                                                               // 0
                        persen_uts = Integer.parseInt(nilai_uts) * 30 / 100;
                    } else {
                        persen_uts = 0;
                    }

                    System.out.print("Masukan Nilai UAS : ");
                    nilai_uas = input.nextLine(); // input nilai uas
                    if (Integer.parseInt(nilai_uas) <= 100) { // check nilai uas apabila lebih dari 100 maka menutup
                                                              // aplikasi
                        mahasiswa_uas.add(nilai_uas); // push ke array mahasiswa_uas
                    } else {
                        System.out.println("Nilai Tidak Boleh lebih Dari 100");
                        System.exit(0); // menutup aplikasi apabila nilai lebih dari 100
                    }

                    if (Integer.parseInt(nilai_uas) != 0 || nilai_uas != "") { // check nilai uas apabila 0 maka persen
                                                                               // 0
                        persen_uas = Integer.parseInt(nilai_uas) * 40 / 100;
                    } else {
                        persen_uas = 0;
                    }

                    nilai_akhir = persen_absensi + persen_tugas + persen_uts + persen_uas; // menjumlah total persentase
                    mahasiswa_nilai_akhir.add(Integer.toString(nilai_akhir)); // push ke array mahasiswa_nilai_akhir
                    System.out.println("Input Data Mahasiswa :" + nama_mahasiswa + " Dengan Nilai Akhir " + nilai_akhir
                            + " Berhasil"); //feed back input data
                    break;
                case 2:
                    if (mahasiswa.size() != 0) {
                        System.out.println("======================================");
                        System.out.println("======= Data Mahasiswa & Nilai =======");
                        for (int i = 0; i < mahasiswa.size(); i++) {
                            System.out.println("Nama Mahasiswa    : " + mahasiswa.get(i));
                            System.out.println("  - Nilai Absensi : " + mahasiswa_absensi.get(i));
                            System.out.println("  - Nilai Tugas   : " + mahasiswa_tugas.get(i));
                            System.out.println("  - Nilai UTS     : " + mahasiswa_uts.get(i));
                            System.out.println("  - Nilai UAS     : " + mahasiswa_uas.get(i));
                            System.out.println("  - Nilai Akhir   : " + mahasiswa_nilai_akhir.get(i));
                        }
                    } else {
                        System.out.println("======================================");
                        System.out.println("======= Data Mahasiswa & Nilai =======");
                        System.out.println("Belum Memiliki Mahasiswa");
                    }
                    break;
                case 3:
                    System.out.println("Menutup Aplikasi");
                    break;
                default:
                    System.out.println("Anda salah memasukkan input");
                    break;
            }
        } while (pilih_menu != 3);
    }

}