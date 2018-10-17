package com.example.kriz.sistempakarv8;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class Database extends SQLiteOpenHelper{


    private static final String DATABASE_NAME = "sistempakar" ;

    public Database(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }


    public void createTable(SQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS gejala");
        db.execSQL("CREATE TABLE if not exists gejala (id TEXT PRIMARY KEY, nama TEXT, " +
                "ya VARCHAR(5), tidak VARCHAR(5), mulai VARCHAR(5), selesai VARCHAR(5));");
    }

    public void createTable2(SQLiteDatabase db2) {
        db2.execSQL("DROP TABLE IF EXISTS penyakit");
        db2.execSQL("CREATE TABLE if not exists penyakit (kode_penyakit TEXT PRIMARY KEY , " +
                "nama_penyakit TEXT, deskripsi TEXT, penanganan TEXT);");
    }


    public void generatadata(SQLiteDatabase db)
    {
        ContentValues cv = new ContentValues();
        db.execSQL("INSERT INTO gejala VALUES ('G01','Tubuh Panas', 'G002', 'G14', 'Y', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G02','Tubuh berkeringat', 'G03', 'G06', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G03','nafsu makan berkurang', 'G17', 'G04', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G04','bersin bersin', 'G05', 'G05', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G05','hidung tersumbat', 'G07', 'G07', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G06','tenggorokan kering', 'G14', 'G14', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G07','hidung berlendir', 'G16', 'G16', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G08','sering BAB', 'G09', 'G15', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G09','BAB nya encer / mencret', 'P03', 'P03', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G11','terlalu banyak makan', 'G12', 'G01', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G12','makan makanan yang baru ', 'G13', 'G13', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G13','mual mual ', 'P04', 'P04', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G14','Pusing', 'G08', 'G08', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G15','Sakit perut ', 'G16', 'G16', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G16','mengigil', 'P02', 'P02', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G17','Tubuh Panas', 'P01', 'P01', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G17','Muncul Bintik Merah', 'G19', 'G19', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G17','Gatal gatal', 'P05', 'P05', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('P01','Demam', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P02','Pilek', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P03','Diare', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P04','Muntah Muntah', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P05','Cacar Air', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P06','Batuk', '0', '0', 'T', 'Y');");
    }

    public void generateData2(SQLiteDatabase db2) {
        db2.execSQL("INSERT INTO penyakit VALUES ('P06','Batuk', '0', '0');");

        db2.execSQL("INSERT INTO penyakit VALUES ('P01','Demam', 'Demam adalah kondisi ketika suhu tubuh berada di atas angka 38 derajat celsius. Demam merupakan bagian dari proses kekebalan tubuh yang sedang melawan infeksi akibat virus, bakteri, atau parasit. Selain itu, demam juga bisa terjadi pada kondisi hipertiroidisme, artritis, atau karena penggunaan beberapa jenis obat-obatan, termasuk antibiotik. Kenaikan suhu tubuh akibat konsumsi obat ini disebut dengan demam obat atau “drug fever”.', 'Istirahat. Anda butuh cukup istirahat untuk memulihkan diri dan membantu kekebalan tubuh. Terlalu banyak beraktivitas dapat meningkatkan suhu tubuh.\n" +
                "Gunakan pakaian tipis dan tetap berada di ruangan dengan udara yang sejuk.\n" +
                "Minum air secara cukup untuk menghindari dehidrasi. Demam bisa menyebabkan tubuh kehilangan banyak cairan.');");

        db2.execSQL("INSERT INTO penyakit VALUES ('P02','Pilek', 'Pilek adalah infeksi ringan pada hidung, saluran sinus, tenggorokan, dan saluran pernapasan bagian atas akibat serangan virus. Pilek bisa dialami oleh siapa saja, mulai dari anak-anak hingga dewasa', 'Meneteskan larutan garam ke dalam hidung. Cara ini dapat meredakan gejala hidung tersumbat serta melancarkan pernapasan, terutama pada bayi dan anak-anak.\n" +
                "Mengonsumsi suplemen zinc dan vitamin C. Kedua cara ini dipercaya dapat menurunkan tingkat keparahan gejala dan mempercepat penyembuhan pilek apabila langsung diterapkan ketika gejala pilek baru muncul.');");

        db2.execSQL("INSERT INTO penyakit VALUES ('P03','Diare', 'Diare adalah penyakit yang membuat penderitanya menjadi sering buang air besar, dengan kondisi tinja yang encer. Pada umumnya, diare terjadi akibat akibat makanan dan minuman yang terpapar virus, bakteri, atau parasit.', 'Meningkatkan konsumsi cairan.\n" +
                "Mengganti kehilangan cairan dan elektrolit adalah salah satu kunci penting dalam penanganan diare. Hal ini juga diperlukan untuk mencegah terjadinya dehidrasi. Caranya adalah dengan mengonsumsi cairan sebanyak-banyaknya, bisa berupa air putih, jus, atau kaldu. Pada anak-anak, pemberian oralit sangat disarankan. Pada bayi yang masih menyusui, asupan ASI harus selalu terjaga.\n" +
                "\n" +
                "Mengonsumsi makanan yang tepat\n" +
                "Saat mengalami diare, penderita dianjurkan untuk mengonsumsi makanan lunak selama beberapa hari. Selain itu, hindari juga makanan yang sarat lemak, serat, atau bumbu. Jika kondisi usus sudah membaik, ganti ke makanan semi padat dengan kadar serat yang ditingkatkan secara bertahap.');");

        db2.execSQL("INSERT INTO penyakit VALUES ('P04','Muntah muntah', 'adalah suatu refleks yang tidak dapat dikontrol untuk mengeluarkan isi lambung dengan paksa melalui mulut. Gejala yang sering terjadi bersama dengan muntah yaitu mual. Pada beberapa kasus, muntah akan berhenti jika isi racun sudah keluar.', 'jika Anda muntah berkali-kali, konsumsi cairan saja. Awali dengan makan lunak jika Anda mampu. Lalu perlahan kembali ke makanan biasa\n" +
                "konsumsi obat-obatan sesuai anjuran dokter dan apoteker\n" +
                "jika Anda mengalami motion sickness atau mabuk kendaraan, menyandarlah di tempat duduk dan tarik napas dalam perlahan saat Anda di dalam mobil, kapal atau pesawat. Duduklah pada tempat yang bergeraknya minimal');");

        db2.execSQL("INSERT INTO penyakit VALUES ('P05','Cacar Air', 'Cacar air adalah  adalah infeksi virus pada kulit dan membran mukosa, yang menyebabkan lenting pada seluruh tubuh dan wajah. Penyakit cacar air, atau biasa disebut chickenpox (varisela)ini , dapat menular ke orang yang belum pernah menderita cacar air atau belum pernah menerima vaksin cacar air.', 'Hubungi dokter Anda jika Anda sedang hamil dan Anda terpapar dengan penderita cacar air\n" +
                "Bersihkan tangan Anda secara teratur dan cucilah sprei serta pakaian yang baru dipakai dengan air sabun yang panas\n" +
                "Jaga agar kuku Anda tetap pendek agar Anda tidak menggaruk untuk mencegah infeksi\n" +
                "Beristirahat, namun tetap bisa beraktivitas ringan');");

        db2.execSQL("INSERT INTO penyakit VALUES ('P06','Batuk', 'Batuk adalah respons alami dari tubuh sebagai sistem pertahanan saluran napas jika terdapat gangguan dari luar. Respons ini berfungsi membersihkan lendir atau faktor penyebab iritasi atau bahan iritan (seperti debu atau asap) agar keluar dari paru-paru dan dan saluran pernapasan bagian atas.', 'Batuk ringan jarang membutuhkan langkah pengobatan yang serius, cukup diatasi dengan obat batuk untuk meredakan rasa gatal, atau untuk mengencerkan dahak agar lebih mudah dikeluarkan.\n" +
                "\n" +
                "Namun jika batuk masih berkepanjangan, itu bisa menjadi pertanda adanya infeksi saluran pernapasan yang lebih serius. Konsultasikanlah ke dokter jika Anda mengalami batuk yang parah dan tidak kunjung reda, sehingga pengobatan dapat segera dilakukan.');");
    }
    @Override
    public void onCreate(SQLiteDatabase db) {


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void generatedata(SQLiteDatabase db) {
    }
}
