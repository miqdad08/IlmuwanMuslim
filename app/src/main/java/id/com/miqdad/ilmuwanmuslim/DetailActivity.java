package id.com.miqdad.ilmuwanmuslim;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    public static final String KEY_ILMU = "KEY";

    ImageView gambar;
    TextView tvJudulDetail, tvJudulPenjelasan;
    String idIlmu;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tvJudulDetail = findViewById(R.id.tvJudulDetail);
        tvJudulPenjelasan = findViewById(R.id.tvPenjelasDetail);
        gambar = findViewById(R.id.ivDetail);

        idIlmu = getIntent().getStringExtra(KEY_ILMU);


        if (idIlmu.equals("1")){
            tvJudulDetail.setText("Al Kharizmi");
            tvJudulPenjelasan.setText("Muḥammad bin Mūsā al-Khawārizmī (bahasa Arab: محمد بن موسى الخوارزمي\u200E) adalah seorang ahli dalam bidang matematika, astronomi, astrologi, dan geografi yang berasal dari Persia. Lahir sekitar tahun 780 di Khwārizm (sekarang Khiva, Uzbekistan) dan wafat sekitar tahun 850 di Baghdad. Hampir sepanjang hidupnya, ia bekerja sebagai dosen di Sekolah Kehormatan di Baghdad yang didirikan oleh Khalifah Bani Abbasiyah Al-Ma'mun, tempat ia belajar ilmu alam dan matematik, termasuk mempelajari terjemahan manuskrip Sanskerta dan Yunani\n" +
                    "Buku pertamanya, al-Jabar, adalah buku pertama yang membahas solusi sistematik dari linear dan notasi kuadrat. Sehingga ia disebut sebagai Bapak Aljabar. Al-Khwārizmī juga berperan penting dalam memperkenalkan angka Arab melalui karya Kitāb al-Jam’a wa-l-tafrīq bi-ḥisāb al-Hind yang kelak diadopsi sebagai angka standar yang dipakai di berbagai bahasa serta kemudian diperkenalkan sebagai Sistem Penomoran Posisi Desimal di dunia Barat pada abad ke 12. Ia merevisi dan menyesuaikan Geografi Ptolemeus sebaik mengerjakan tulisan-tulisan tentang astronomi dan astrologi.\n" +
                    "Kontribusinya tak hanya berdampak besar pada matematika, tapi juga dalam kebahasaan. Kata \"aljabar\" berasal dari kata al-Jabr, satu dari dua operasi dalam matematika untuk menyelesaikan notasi kuadrat, yang tercantum dalam bukunya. Kata algorisme dan algoritma diambil dari kata algorismi, Latinisasi dari namanya. Namanya juga di serap dalam bahasa Spanyol, guarismo, dan dalam bahasa Portugis, algarismo bermakna digit.\n");
            gambar.setImageResource(R.drawable.alkhawarizmi);
        }else if (idIlmu.equals("2")){
            tvJudulDetail.setText("Al Zahrawi");
            tvJudulPenjelasan.setText("Abul Qasim Khalaf ibn al-Abbas az-Zahrawi atau Al-Zahrawi (Madinatuz Zahra', 936 - 1013), (Bahasa Arab: أبو القاسم) dikenal di Barat sebagai Abulcasis, adalah salah satu pakar di bidang kedokteran pada masa Islam abad Pertengahan. Karya terkenalnya adalah Al-Tasrif, kumpulan praktik kedokteran yang terdiri atas 30 jilid.\n" +
                    "\n" +
                    "Abul Qasim lahir di Zahra, yang terletak di sekitar Kordoba, Spanyol. Di kalangan bangsa Moor Andalusia, dia dikenal dengan nama \"El Zahrawi\". Al-Qasim adalah dokter kerajaan pada masa Khalifah Al-Hakam II dari kekhalifahan Umayyah.");
            gambar.setImageResource(R.drawable.alzahrawi);
        }else if (idIlmu.equals("3")){
            tvJudulDetail.setText("Ibnu Al Baithar");
            tvJudulPenjelasan.setText("Ibnu Al-Baithar lahir di Málaga dengan nama Abdullah bin Ahmad Ad-Din bin Al-Baithar Al-Malaki pada tahun 589 H atau 1193 M. Dia berasal dari keluarga Al-Baithar di kota itu. Dikatakan dia berasal dari keluarga Hispano-Roman sebagaimana penuturan Fransisco Javier Simonet, tapi itu tak terbukti. Pertama kali, dia menuntut ilmu di Sevilla, Spanyol. Dia pada saat itu, mengumpulkan tumbuh-tumbuhan di sekitar kota tersebut bersama beberapa orang gurunya, Abu Al-'Abbas An-Nabati, Abdullah bin Shalih, dan Abu Al-Hajjaj. Sekitar tahun 617 H/1221 M, dia melintasi Afrika Utara, menuju Asia Kecil, dan Suriah. Di sanalah dia belajar banyak ilmu tetumbuhan dan pengenalannya kepada tabib-tabib setempat yang terkenal.\n" +
                    "Di masa-masa selanjutnya, dia menjadi kepala herbalis ditunjuk oleh Al-Kamil Muhammad bin Abubakr bin Ayyub Al-Ayyubi di Mesir di Dinasti Ayyubiyah.Sesudahnya dia mengelana, melakukan eksperimen hingga ke Damaskus, dan dia bertemu dengan Ibnu Abu Ushaibi'ah, muridnya; dan Ibnu Abu Ushaibi'ah bercerita bahwa dia \"membacakan kepadanya [Ibnu Al-Baithar] tafsir nama-nama tumbuhan dari buku Dioskorides dan mendapati bahwa dia sangat memahami ilmunya [herbal], dan kepahamannya sangat besar.\" Di dunia Barat, Ibnu Al-Baithar disebut sebagai Alpetragius. Ia banyak melakukan terapan pada masalah tumbuh-tumbuhan. Dari 1400 ramuan obat dalam bukunya, 300 ramuannya dari temuan sendiri, dan 200 merupakan ramuan dari tumbuhan.\n" +
                    "Ibnu Al-Baithar meninggal pada tahun 1248 M/646 H dalam usia 55 tahun di Damaskus\n");
            gambar.setImageResource(R.drawable.ibnualbhaitar);
        }else if (idIlmu.equals("4")){
            tvJudulDetail.setText("Ibnu Al Nafis");
            tvJudulPenjelasan.setText("Ibnu an-Nafis (lahir di Damaskus (kini wilayah Suriah) tahun 1210 – meninggal di Kairo (kini wilayah Mesir), 17 Desember 1288 pada umur 77/78 tahun) merupakan orang pertama yang secara akurat mendeskripsikan peredaran darah dalam tubuh manusia (pada 1242). Penggambaran kontemporer proses ini telah bertahan. Khususnya, ia merupakan orang pertama yang diketahui telah mendokumentasikan sirkuit paru-paru. Ia adalah orang yang pertama mengemukakan teori pembuluh darah kapiler. Secara besar-besaran karyanya tak tercatat sampai ditemukan di Berlin pada 1924.");
            gambar.setImageResource(R.drawable.ibnualnafis);
        }else if (idIlmu.equals("5")){
            tvJudulDetail.setText("Ibnu Haitham");
            tvJudulPenjelasan.setText("Abu Ali Muhammad al-Hasan bin al-Haitsam (Bahasa Arab:ابو علی، حسن بن حسن بن الهيثم) atau Ibnu Haitsam (lahir di Bashrah,tahun 965 - dan meninggal di Qahirah tahun 1039 pada umur 74 tahun), dibarat lebih dikenal dengan nama Alhazen. Adalah seorang ilmuwan Islam yang ahli dalam bidang sains, falak, matematika, geometri, pengobatan, dan filsafat. Ia banyak pula melakukan penelitian mengenai cahaya, dan telah memberikan banyak inspirasi pada ahli sains barat, seperti Roger Bacon, dan Kepler dalam menciptakan mikroskop serta teleskop..");
            gambar.setImageResource(R.drawable.ibnuhaitman);
        }else if (idIlmu.equals("6")){
            tvJudulDetail.setText("Ibnu Khaldun");
            tvJudulPenjelasan.setText("\n" +
                    "Ibnu Khaldun, nama lengkap: Abu Zayd 'Abd al-Rahman ibn Muhammad ibn Khaldun al-Hadrami (عبد الرحمن بن محمد بن خلدون الحضرمي) (lahir 27 Mei 1332 – meninggal 19 Maret 1406 pada umur 73 tahun) adalah seorang sejarawan muslim dari Tunisia dan sering disebut sebagai bapak pendiri ilmu historiografi, sosiologi dan ekonomi. Karyanya yang terkenal adalah Muqaddimah (Pendahuluan/Pengantar).\n" +
                    "\n" +
                    "Lelaki yang lahir di Tunisia pada 1 Ramadan 732 H./27 Mei 1332 M. adalah dikenal sebagai sejarawan dan bapak sosiologi Islam yang hafal Alquran sejak usia dini. Sebagai ahli politik Islam, ia pun dikenal sebagai bapak Ekonomi Islam, karena pemikiran-pemikirannya tentang teori ekonomi yang logis dan realistis jauh telah dikemukakannya sebelum Adam Smith (1723-1790) dan David Ricardo (1772-1823) mengemukakan teori-teori ekonominya. Bahkan ketika memasuki usia remaja, tulisan-tulisannya sudah menyebar ke mana-mana. Tulisan-tulisan dan pemikiran Ibnu Khaldun terlahir karena studinya yang sangat dalam, pengamatan terhadap berbagai masyarakat yang dikenalnya dengan ilmu dan pengetahuan yang luas, serta ia hidup di tengah-tengah mereka dalam pengembaraannya yang luas pula.");
            gambar.setImageResource(R.drawable.ibnukhaldun);
        }else if (idIlmu.equals("7")){
            tvJudulDetail.setText("Ibnu Sina");
            tvJudulPenjelasan.setText("Ibnu Sina (980-1037) dikenal juga sebagai \"Avicenna\" di dunia Barat adalah seorang filsuf, ilmuwan, dan dokter kelahiran Persia (sekarang Iran). Ia juga seorang penulis yang produktif yang sebagian besar karyanya adalah tentang filosofi dan kedokteran. Bagi banyak orang, dia adalah \"Bapak Kedokteran Modern\". Karyanya yang sangat terkenal adalah al-Qānūn fī aṭ-Ṭibb yang merupakan rujukan di bidang kedokteran selama berabad-abad.\n" +
                    "\n" +
                    "Ibnu Sina bernama lengkap Abū ‘Alī al-Husayn bin ‘Abdullāh bin Sīnā (Persia ابوعلى سينا Abu Ali Sina, Arab : أبو علي الحسين بن عبد الله بن سينا). Ibnu Sina lahir pada 980 di Afsyahnah daerah dekat Bukhara, sekarang wilayah Uzbekistan dan meninggal bulan Juni 1037 di Hamadan, Persia (Iran).\n" +
                    "\n" +
                    "Dia adalah pengarang dari 450 buku pada beberapa pokok bahasan besar. Banyak di antaranya memusatkan pada filosofi dan kedokteran. \" George Sarton menyebut Ibnu Sina \"ilmuwan paling terkenal dari Islam dan salah satu yang paling terkenal pada semua bidang, tempat dan waktu\". Karyanya yang paling terkenal adalah Kitab Penyembuhan dan Qanun Kedokteran (Al-Qanun fi At Tibb).");
            gambar.setImageResource(R.drawable.ibnusina);
        }else if (idIlmu.equals("8")){
            tvJudulDetail.setText("Jabir Ibn-Hayyan");
            tvJudulPenjelasan.setText("Abu Musa Jabir bin Hayyan (Bahasa Arab: جابر بن حیان, Bahasa Persia: جابر بن حیان, atau juga nisbahs al-Bariqi, al-Azdi, al-Kufi, al-Tusi dan al-Sufi; fl. c. 721 - c. 815), atau dikenal dengan nama Geber di dunia Barat, seorang polymath terkemuka; kimiawan, alkimiawan, ahli astronomi dan astrologi, insinyur, ahli bumi, ahli filsafat, ahli fisika, apoteker dan dokter, diperkirakan lahir di Kuffah, Irak pada tahun 750 dan wafat pada tahun 803. Kontribusi terbesar Jabir adalah dalam bidang kimia. Keahliannya ini didapatnya dengan ia berguru pada Imam Ja'far bin Muhammad AsShadiq keturunan ke 5 dari Nabi Muhammad saw, pada masa pemerintahan Manshur Addawaniqy di Baghdad.[butuh rujukan] Ia mengembangkan teknik eksperimentasi sistematis di dalam maupun di luar penelitian kimia, sehingga setiap eksperimen dapat direproduksi kembali. Jabir menekankan bahwa kuantitas zat berhubungan dengan reaksi kimia yang terjadi, sehingga dapat dianggap Jabir telah merintis ditemukannya hukum perbandingan tetap.");
            gambar.setImageResource(R.drawable.jabilibnhayyan);
        }else if (idIlmu.equals("9")){
            tvJudulDetail.setText("Thibit Ibn Qurra");
            tvJudulPenjelasan.setText("Abu'l Hasan Tsabit bin Qurra' bin Marwan al-Sabi al-Harrani, (826 – 18 Februari 901) adalah seorang astronom dan matematikawan dari Arab, dan dikenal pula sebagai Thebit dalam bahasa Latin.\n" +
                    "\n" +
                    "Tsabit lahir di kota Harran, Turki. Tsabit menempuh pendidikan di Baitul Hikmah di Baghdad atas ajakan Muhammad ibn Musa ibn Shakir. Tsabit menerjemahkan buku Euclid yang berjudul Elements dan buku Ptolemy yang berjudul Geograpia.\n" +
                    "\n");
            gambar.setImageResource(R.drawable.thbitibnqurra);
        }else if (idIlmu.equals("10")){
            tvJudulDetail.setText("Umar Khayyyam");
            tvJudulPenjelasan.setText("Pada masa hidupnya, ia terkenal sebagai seorang matematikawan dan astronom yang berhasil mengoreksi kalender Persia. Pada 15 Maret 1079, Sultan Jalaluddin Maliksyah Saljuqi (1072-1092) memberlakukan kalender yang telah diperbaiki Umar, seperti yang dilakukan oleh Julius Caesar di Eropa pada tahun 46 SM dengan koreksi terhadap Sosigenes, dan yang dilakukan oleh Paus Gregorius XIII pada Februari 1552 dengan kalender yang telah diperbaiki Aloysius Lilius (meskipun Britania Raya baru beralih dari Kalender Julian kepada kalender Gregorian pada 1751, dan Rusia baru melakukannya pada 1918).\n" +
                    "\n" +
                    "Dia pun terkenal karena menemukan metode memecahkan persamaan kubik dengan memotong sebuah parabola dengan sebuah lingkaran.");
            gambar.setImageResource(R.drawable.umarkhayyam);
        }

    }
}

