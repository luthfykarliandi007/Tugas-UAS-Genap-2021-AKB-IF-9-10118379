package com.luthfy.tugas_uas_genap_2021_akb_if_9_10118379.Model;

import android.content.Context;

/** NIM : 10118379
 * Nama : Luthfy Karliandi Nugraha
 * Kelas : IF-9
 * **/

public class ListInsert {

    private static DatabaseHelper databaseHelper;

    public ListInsert(Context context){

        databaseHelper = new DatabaseHelper(context);
  //      Log.d("insert", "inserting data");
        databaseHelper.save(new TourPlace(1, "Farm house lembang",
                "Jl. Raya Lembang No.108, Gudangkahuripan, Lembang, Kabupaten Bandung Barat, Jawa Barat 40391",
                "setiap hari 08.00-20.00",
                "Farmhouse Lembang bisa dikatakan salah satu tempat wisata di Bandung terbaru. " +
                        "Tempat ini langsung menyedot banyak pengunjung karena lokasinya yang strategis, " +
                        "dan banyaknya spot berfoto yang bagus banget.",
                "https://www.anekawisata.com/wp-content/uploads/2018/04/Farm-House-Lembang-Bandung.jpg",
                "-6.833266", "107.605738"));

        databaseHelper.save(new TourPlace(2, "Kebun Teh Sukawana",
                "Kertawangi, Kec. Cisarua, Kabupaten Bandung Barat, Jawa Barat 40551",
                "24 Jam",
                "Wisata alam Bandung beragam sekali, mulai dari yang ramai sampai dengan tempat yang masih sepi pengunjung. " +
                        "Nah, bagi anda yang ingin ngadem di kebun teh di Lembang, kebun teh Sukawana bisa jadi alternatif nih. " +
                        "Tempatnya memang sedikit tersembunyi sehingga rada jarang yang datang kesini.",
                "https://tourbandung.id/wp-content/uploads/2019/05/Indahnya-Kebun-Teh-Sukawana-845x450.jpg",
                "-6.776925", "107.583892"));

        databaseHelper.save(new TourPlace(3, "Glamping Lakeside Rancabali",
                "0813-5000-8712, Jl. Raya Ciwidey - Patengan No.Km. 39, Situ, Patengan, Kec. Rancabali, Bandung, Jawa Barat 40973",
                "24 Jam",
                "Glamping Lakeside di Rancabali – Ciwidey bisa dikatakan salah satu tujuan utama wisata di Bandung selatan saat ini. " +
                        "Dengan icon restoran berbentuk perahu yang besar yang ada di pinggir situ Patenggang, " +
                        "suasana disekitarnya indah sekali.",
                "https://www.hargatiket.net/wp-content/uploads/2019/01/harga-tiket-glamping-lakeside-rancabali.jpg",
                "-7.157567", "107.365143"));

        databaseHelper.save(new TourPlace(4, "Curug Tilu Leuwi Opat",
                "Jl. Kp. Ciwangun Indah Camp, Cihanjuang Rahayu, Kec. Parongpong, Kabupaten Bandung Barat, Jawa Barat 40559",
                "setiap hari 07.00-17.00",
                "Mau trekking ringan di Lembang? anda bisa berkunjung ke curug tilu leuwi opat. " +
                        "tempatnya berada di area Parongpong lembang, " +
                        "Untuk menuju ke lokasi, anda harus berjalan menyusuri trek kurang lebih 30 menit. " +
                        "Tapi, banyak banget spot bagusnya lho. Suasananya juga hijau dan adem banget.",
                "https://i2.wp.com/kelloggsnyc.com/wp-content/uploads/2020/04/curug-tilu-leuwi-opat.png",
                "-6.790573", "107.582628"));

        databaseHelper.save(new TourPlace(5, "Gunung Tangkuban Perahu",
                "Cikahuripan, Lembang, Kabupaten Bandung Barat, Jawa Barat",
                "setiap hari 07.00-17.00",
                "Gunung Tangkuban Perahu merupakan salah satu situs wisata terkenal di Indonesia. " +
                        "Terletak di daerah Lembang, sekitar 20 kilometer di utara Kota Bandung, " +
                        "gunung yang bentuknya menyerupai perahu terbalik ini selalu padat pengunjung pada akhir pekan dan waktu liburan.",
                "https://yourbandung.com/wp-content/uploads/2019/07/030315-GUNUNG-TANGKUBAN-PARAHU0065.jpg",
                "-6.760355", "107.609658"));

        databaseHelper.save(new TourPlace(6, "Kawah Putih Ciwidey",
                "Sugihmukti, Kec. Pasirjambu, Bandung, Jawa Barat",
                "setiap hari 08.00-17.00",
                "Nama Kawah Putih Ciwidey sudah tidak asing di kalangan pecinta alam. " +
                        "Kawah yang terletak di daerah Ciwidey sekitar 50 Km di selatan Bandung ini merupakan kawah vulkanik " +
                        "dengan tanah yang berwarna putih akibat kandungan belerang pada tanahnya tersebut.",
                "https://cdn-2.tstatic.net/travel/foto/bank/images/kawah-putih11.jpg",
                "-7.166306", "107.402107"));

        databaseHelper.save(new TourPlace(7, "Danau Situ Patenggang",
                "Patengan, Kec. Rancabali, Bandung, Jawa Barat",
                "24 Jam",
                "Danau Situ Patenggang terletak sekitar 7 Km dari Kawah Putih. " +
                        "Pemandangan yang disuguhkan danau ini sangat indah. Dikelilingi oleh lembah dan perkebunan teh yang hijau, " +
                        "banyak pengunjung menjadikan tempat ini sebagai tempat bersantai bersama keluarga dan teman.",
                "https://blogkulo.com/wp-content/uploads/2018/02/Situ-Patenggang-Bandung.jpg",
                "-7.167027", "107.357507"));

        databaseHelper.save(new TourPlace(8, "Curug Cimahi",
                "Jl. Kolonel Masturi No.325, Kertawangi, Kec. Cisarua, Kabupaten Bandung Barat, Jawa Barat 40551",
                "Setiap Hari 08.00-18.00",
                "Glamping Lakeside di Rancabali – Ciwidey bisa dikatakan salah satu tujuan utama wisata di Bandung selatan saat ini. " +
                        "Dengan icon restoran berbentuk perahu yang besar yang ada di pinggir situ Patenggang, " +
                        "suasana disekitarnya indah sekali.",
                "https://www.tourbandung.com/wp-content/uploads/2020/02/curug-cimahi.jpg",
                "-6.799271", "107.577530"));

        databaseHelper.save(new TourPlace(9, "Taman Hutan Raya Ir. H. Djuanda",
                "Kompleks Tahura, Jl. Ir. H. Juanda No.99, Ciburial, Kec. Cimenyan, Bandung, Jawa Barat 40198",
                "Setiap Hari 07.00-17.00",
                "Taman Hutan Raya terletak di kawasan Dago Pakar, membentang sampai ke daerah Maribaya. " +
                        "Di tempat yang merupakan taman hutan raya pertama di Indonesia ini terdapat kurang lebih 2500 jenis tanaman.",
                "https://modernsocialmagazine.com/wp-content/uploads/2019/08/Indahnya-Taman-Hutan-Raya-Juanda.jpg",
                "-6.856595", "107.632647"));

        databaseHelper.save(new TourPlace(10, "Situ Cisanti Bandung",
                "Tarumajaya, Kertasari, Bandung, Jawa Barat",
                "24 Jam",
                "Situ Cisanti merupakan hulu sungai Citarum. " +
                        "Siapa sangka, hulu sungai yang membelah Bandung ini ternyata indah sekali lho. " +
                        "Suasananya masih alami, Buat penggemar wisata alam pasti akan betah.",
                "https://www.hotelmurah.com/ceritawisata/wp-content/uploads/2019/10/wisata-situ-cisanti.jpg",
                "-7.208498", "107.657628"));

    }



}
