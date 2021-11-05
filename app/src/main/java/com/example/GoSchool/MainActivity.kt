package com.example.GoSchool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val androidList = listOf<Android>(
            Android(
                R.drawable.logo,
                nameAndroid = "SMK ISLAMIYAH ADIWERNA",
                descAndroid = "Website SMK Islamiyah Adiwerna sebagai media yang dikelola oleh sekolah dan berada " +
                              "di Wilayah Negara Kesatuan Republik Indonesia tentunya Taat dan Patuh sepenuhnya terhadap Hukum " +
                              "dan Perundang Undangan yang berlaku di wilayah Negara Kesatuan Republik Indonesia. " +
                              "Dan mentaati Undang Undang Nomor 19 Tahun 2016 tentang ITE seperti yang tercantum pada tautan berikut UU Nomor 19 Tahun 2016."
            ),
            Android(
                R.drawable.visimisi,
                nameAndroid = "VISI MISI",
                descAndroid = "Visi SMK Islamiyah Adiwerna\n" +
                        "\n" +
                        "Menjadi pusat pengembangan pendidikan Teknik dan Bisnis Manajemen yang " +
                        "mempunyai faktor keunggulan mutu, mampu bersaing didasari Iman dan Taqwa\n"+
                        "\n"+
                        "Misi SMK Islamiyah Adiwerna\n" +
                        "\n" +
                        "Menyelenggarakan pembelajaran bermutu, menghasilkan tamatan yang memiliki keunggulan yang" +
                        "kompetitif, siap kerja, mandiri, memiliki etos kerja tinggi produktif dan mampu mengembangkan\n" +
                        "dirinya secara berkelanjut serta berkhalak mulia.\n"+
                        "\n"+
                        "Tujuan SMK Islamiyah Adiwerna\n" +
                        "\n" +
                        "1. Menelenggarakan proses pembelajaran yang inovatif.\n" +
                        "2. Melaksanakan pembekalan mental dan kepribadian.\n" +
                        "3. Mewujudkan kelulusan yang kompetitif pada bidang keahliannya.\n" +
                        "4. Meningkatkan peran serta masyarakat dalam menyelenggarakan sekolah.\n" +
                        "5. Membina kerjasama dengan dunia usaha atau dunia industri.\n" +
                        "6. Mewujudkan kemandirian lulusan dimasyarakat.\n" +
                        "7. Menyelanggarakan kegiatan Kewirausahaan sebagai tekad siswa dalam pengembangan dirinya."


            ),

            Android(
                R.drawable.jurusan,
                nameAndroid = "JURUSAN",
                descAndroid = "1. Perbankan Syariah\n" +
                                 "jurusan keuangan dan perbankan syariah adalah jenis bidang keuangan" +
                                 "dan perbankan yang melaksanakan kegiatan keuangan maupun perbankan" +
                                 "berdasarkan syariah Islam. Sistem operasionalnya juga berbeda dengan" +
                                 "keuangan maupun perbankan konvensional yang selama ini sudah Anda kenal" +
                                 "Sistem keuangan serta perbankan syariah memakai prinsip bagi hasil secara" +
                                 "keseluruhan produk-produknya.\n"+
                                  "\n"+
                              "2. Teknik Permesinan\n" +
                                  "Teknik Mesin merupakan bidang keilmuan yang mempelajari prinsip dasar " +
                                  "fisika untuk analisis, desain, manufaktur, dan memelihara sebuah sistem" +
                                  "mekanik. Pada abad ke-18, setelah terjadinya revolusi industri di Eropa," +
                                  "Teknik Mesin mulai berkembang sebagai suatu ilmu dan semakin berkembang" +
                                  "seiring pesatnya perkembangan ilmu fisika pada abad ke-19.\n"+
                                  "\n"+
                              "3. Teknik Komputer Jaringan\n" +
                                  "TKJ adalah singkatan dari Teknik Komputer Jaringan. TKJ merupakan sebuah " +
                                  "kejurusan yang mempelajari tentang cara-cara merakit komputer dan menginstalasi" +
                                  "program komputer.Kejurusan ini hanya ada di STM/SMK.Program keahlian TKJ berbeda" +
                                  "dengan RPL(Rekayasa Perangkat Lunak).\n"+
                                  "\n"+
                              "4. Teknik Sepeda Motor\n" +
                                  "kompetensi keahlian pada Bidang Studi Keahlian Teknologi dan Rekayasa Program Studi " +
                                  "Keahlian Teknik Otomotif yang menekankan pada keterampilan pelayanan jasa mekanik" +
                                  "kendaraan sepeda motor roda dua. Kompetensi Keahlian Teknik Sepeda Motor menyiapkan" +
                                  "peserta didik untuk bekerja pada bidang pekerjaan yang dikelola oleh badan, instansi" +
                                  "atauperusahaan pribadi (wirausaha).\n"+
                                  "\n"+
                              "5. Teknik Kendaraan Ringan Otomotif\n"+
                                  "kompetensi keahlian bidang teknik otomotif yang menekankan keahlian pada bidang " +
                                  "penguasaan jasa perbaikan kendaraan ringan. Kompetensi keahlian teknik kendaraan" +
                                  "ringan menyiapkan peserta didik untuk bekerja pada bidang pekerjaan jasa perawatan" +
                                  "dan perbaikan di dunia usaha atau industri."

            ),
            Android(
                R.drawable.eskul,
                nameAndroid = "EKSTRAKULIKULER",
                descAndroid = "Ekstrakurikuler adalah kegiatan non-pelajaran formal yang dilakukan peserta didik" +
                              "sekolah atau universitas, umumnya di luar jam belajar kurikulum standar." +
                              "Kegiatan-kegiatan ini ada pada setiap jenjang pendidikan dari sekolah dasar" +
                              "sampai universitas.\n"+
                              "\n"+
                              "OSIS                 :   Bagus Dicky Sonjaya, A.Md\n" +
                              "\n"+

                              "PRAMUKA       :   Budiarto, S.Pd\n" +
                              "\n"+

                              "PMR                 :   Nuril Ulum, S.Kom\n" +
                              "\n"+

                              "PKS                  :   Moh. Fani S.Pd"
            ),
            Android(
                R.drawable.alamat,
                nameAndroid = "ALAMAT SEKOLAH",
                descAndroid = "Nama\t\t   : SMK ISLAMIYAH ADIWERNA \n" +
                              "\n"+
                              "Alamat\t\t : JL. SINGKIL NO. 234 Telp.(0283) 442098 - " +
                                           "Fak. (0283) 445295 Adiwerna Kab. Tegal, Jawa Tengah \n" +
                              "\n"+
                              "Kodepos\t\t: 123456 \n" +
                              "\n"+
                              "Email\t\t   : smk_islamiyah_adw@yahoo.co.id \n" +
                              "\n"+
                              "Jenjang\t\t: SMK \n" +
                              "\n"+
                              "Status\t\t  : Swasta "
            ),
            Android(
                R.drawable.detail,
                nameAndroid = "DETAIL SEKOLAH",
                descAndroid = "  \tNama \t\t\t\t    : SMKS ISLAMIYAH ADIWERNA\n" +
                              "\n"+
                              "  \tNPSN \t\t\t\t\t\t  : 20325248\n" +
                              "\n"+
                              "  \tAlamat \t\t\t\t\t  : JL. SINGKIL 234 ADIWERNA\n" +
                              "\n"+
                              "  \tKode Pos \t\t\t\t\t\t\t\t\t\t: 52194\n" +
                              "\n"+
                              "  \tDesa/Kelurahan \t\t\t\t\t    : Adiwerna\n" +
                              "\n"+
                              "  \tKecamatan/Kota (LN) \t\t\t   : Kec. Adiwerna\n" +
                              "\n"+
                              "  \tKab.-Kota/Negara (LN) \t\t  : Kab. Tegal\n" +
                              "\n"+
                              "  \tPropinsi/Luar Negeri (LN) \t : Prov. Jawa Tengah\n" +
                              "\n"+
                              "  \tStatus Sekolah \t\t\t\t\t\t     : SWASTA\n" +
                              "\n"+
                              "  \tWaktu Penyelenggaraan \t\t : Sehari Penuh/5 hari\n" +
                              "\n"+
                              "  \tJenjang Pendidikan \t\t      : SMK\n"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_android)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = AndroidAdapter(this,androidList){
            val intent = Intent (this, DetailAndroidActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }



}