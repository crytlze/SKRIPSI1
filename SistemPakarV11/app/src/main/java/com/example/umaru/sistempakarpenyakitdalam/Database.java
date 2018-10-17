package com.example.umaru.sistempakarpenyakitdalam;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class Database extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "sistempakar";

    public Database(Context context) {
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

    public void generateData(SQLiteDatabase db) {
        ContentValues cv = new ContentValues();

        db.execSQL("INSERT INTO gejala VALUES ('G001','Berkeringat Pada Malam Hari', 'G002', 'G014', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G002','Tubuh terasa lemas', 'G003', 'G006', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G003','nafsu makan berkurang', 'G017', 'G004', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G004','bersin bersin', 'G005', 'G005', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G005','hidung tersumbat', 'G007', 'G007', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G006','tenggorokan kering', 'G021', 'G021', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G007','hidung berlendir', 'G016', 'G016', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G008','sering BAB', 'G009', 'G015', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G009','BAB nya encer / mencret', 'P003', 'P003', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G011','terlalu banyak makan', 'G012', 'G001', 'Y', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G012','Memakan makanan yang asing ', 'G013', 'G013', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G013','mual mual ', 'P004', 'P004', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G014','Pusing', 'G008', 'G020', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G015','Sakit perut ', 'G016', 'G016', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G016','mengigil', 'G018', 'G018', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G017','Tubuh Panas', 'P001', 'P001', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G018','Muncul Bintik Merah', 'G019', 'G019', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G019','Gatal gatal', 'P005', 'P005', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G020','sehat', 'G001', 'B', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G021','Sering mengeluarkan suara Uhuk Uhuk dari mulut', 'P006', 'P006', 'T', 'T');");


        db.execSQL("INSERT INTO gejala VALUES ('P001','Demam', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P002','Pilek', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P003','Diare', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P004','Muntah Muntah', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P005','Cacar Air', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P006','Batuk', '0', '0', 'T', 'Y');");

    }

    public void generateData2(SQLiteDatabase db2) {
        db2.execSQL("INSERT INTO penyakit VALUES ('P001','Demam', 'Demam adalah kondisi ketika suhu tubuh berada di atas angka 38 derajat celsius. Demam merupakan bagian dari proses kekebalan tubuh yang sedang melawan infeksi akibat virus, bakteri, atau parasit. Selain itu, demam juga bisa terjadi pada kondisi hipertiroidisme, artritis, atau karena penggunaan beberapa jenis obat-obatan, termasuk antibiotik. Kenaikan suhu tubuh akibat konsumsi obat ini disebut dengan demam obat atau “drug fever”.', 'Istirahat. Anda butuh cukup istirahat untuk memulihkan diri dan membantu kekebalan tubuh. Terlalu banyak beraktivitas dapat meningkatkan suhu tubuh.\n" +
                "Gunakan pakaian tipis dan tetap berada di ruangan dengan udara yang sejuk.\n" +
                "Minum air secara cukup untuk menghindari dehidrasi. Demam bisa menyebabkan tubuh kehilangan banyak cairan.');");

        db2.execSQL("INSERT INTO penyakit VALUES ('P002','Pilek', 'Pilek adalah infeksi ringan pada hidung, saluran sinus, tenggorokan, dan saluran pernapasan bagian atas akibat serangan virus. Pilek bisa dialami oleh siapa saja, mulai dari anak-anak hingga dewasa', 'Meneteskan larutan garam ke dalam hidung. Cara ini dapat meredakan gejala hidung tersumbat serta melancarkan pernapasan, terutama pada bayi dan anak-anak.\n" +
                "Mengonsumsi suplemen zinc dan vitamin C. Kedua cara ini dipercaya dapat menurunkan tingkat keparahan gejala dan mempercepat penyembuhan pilek apabila langsung diterapkan ketika gejala pilek baru muncul.');");

        db2.execSQL("INSERT INTO penyakit VALUES ('P003','Diare', 'Diare adalah penyakit yang membuat penderitanya menjadi sering buang air besar, dengan kondisi tinja yang encer. Pada umumnya, diare terjadi akibat akibat makanan dan minuman yang terpapar virus, bakteri, atau parasit.', 'Meningkatkan konsumsi cairan.\n" +
                "Mengganti kehilangan cairan dan elektrolit adalah salah satu kunci penting dalam penanganan diare. Hal ini juga diperlukan untuk mencegah terjadinya dehidrasi. Caranya adalah dengan mengonsumsi cairan sebanyak-banyaknya, bisa berupa air putih, jus, atau kaldu. Pada anak-anak, pemberian oralit sangat disarankan. Pada bayi yang masih menyusui, asupan ASI harus selalu terjaga.\n" +
                "\n" +
                "Mengonsumsi makanan yang tepat\n" +
                "Saat mengalami diare, penderita dianjurkan untuk mengonsumsi makanan lunak selama beberapa hari. Selain itu, hindari juga makanan yang sarat lemak, serat, atau bumbu. Jika kondisi usus sudah membaik, ganti ke makanan semi padat dengan kadar serat yang ditingkatkan secara bertahap.');");

        db2.execSQL("INSERT INTO penyakit VALUES ('P004','Muntah muntah', 'adalah suatu refleks yang tidak dapat dikontrol untuk mengeluarkan isi lambung dengan paksa melalui mulut. Gejala yang sering terjadi bersama dengan muntah yaitu mual. Pada beberapa kasus, muntah akan berhenti jika isi racun sudah keluar.', 'jika Anda muntah berkali-kali, konsumsi cairan saja. Awali dengan makan lunak jika Anda mampu. Lalu perlahan kembali ke makanan biasa\n" +
                "konsumsi obat-obatan sesuai anjuran dokter dan apoteker\n" +
                "jika Anda mengalami motion sickness atau mabuk kendaraan, menyandarlah di tempat duduk dan tarik napas dalam perlahan saat Anda di dalam mobil, kapal atau pesawat. Duduklah pada tempat yang bergeraknya minimal');");

        db2.execSQL("INSERT INTO penyakit VALUES ('P005','Cacar Air', 'Cacar air adalah  adalah infeksi virus pada kulit dan membran mukosa, yang menyebabkan lenting pada seluruh tubuh dan wajah. Penyakit cacar air, atau biasa disebut chickenpox (varisela)ini , dapat menular ke orang yang belum pernah menderita cacar air atau belum pernah menerima vaksin cacar air.', 'Hubungi dokter Anda jika Anda sedang hamil dan Anda terpapar dengan penderita cacar air\n" +
                "Bersihkan tangan Anda secara teratur dan cucilah sprei serta pakaian yang baru dipakai dengan air sabun yang panas\n" +
                "Jaga agar kuku Anda tetap pendek agar Anda tidak menggaruk untuk mencegah infeksi\n" +
                "Beristirahat, namun tetap bisa beraktivitas ringan');");

        db2.execSQL("INSERT INTO penyakit VALUES ('P006','Batuk', 'Batuk adalah respons alami dari tubuh sebagai sistem pertahanan saluran napas jika terdapat gangguan dari luar. Respons ini berfungsi membersihkan lendir atau faktor penyebab iritasi atau bahan iritan (seperti debu atau asap) agar keluar dari paru-paru dan dan saluran pernapasan bagian atas.', 'Batuk ringan jarang membutuhkan langkah pengobatan yang serius, cukup diatasi dengan obat batuk untuk meredakan rasa gatal, atau untuk mengencerkan dahak agar lebih mudah dikeluarkan.\n" +
                "\n" +
                "Namun jika batuk masih berkepanjangan, itu bisa menjadi pertanda adanya infeksi saluran pernapasan yang lebih serius. Konsultasikanlah ke dokter jika Anda mengalami batuk yang parah dan tidak kunjung reda, sehingga pengobatan dapat segera dilakukan.');");
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public void onCreate(SQLiteDatabase db) {
    }
}
