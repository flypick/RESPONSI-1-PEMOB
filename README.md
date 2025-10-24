# RESPONSI-1-PEMOB
NAMA : AUDI MAKRUFIANTO AFETAMA
NIM : H1D023037
SHIFT : C



https://github.com/user-attachments/assets/bd01bc7e-db1c-42f3-8787-0dfb679d6229



Alur data dimulai di MainActivity, yang memberi tahu MainViewModel untuk mengambil data saat pertama kali dibuat. MainViewModel kemudian menggunakan coroutine untuk memanggil fungsi di ApiClient. ApiClient, yang menggunakan Retrofit, membangun dan mengirimkan permintaan HTTP GET ke server football-data.org, lengkap dengan ID klub dan X-Auth-Token (API Key) di header. Server merespons dengan mengirimkan data dalam format JSON. Retrofit, dengan bantuan converter GSON, secara otomatis mem-parsing (mengubah) teks JSON mentah tersebut menjadi objek data Kotlin yang telah kita definisikan (TeamResponse). Objek TeamResponse ini kemudian dikembalikan ke MainViewModel, yang segera memperbarui nilai MutableLiveData miliknya. MainActivity, yang secara aktif "mengamati" LiveData tersebut, otomatis mendeteksi perubahan ini dan menerima objek TeamResponse. MainActivity kemudian menggunakan data dari objek ini untuk memperbarui antarmuka pengguna (UI), seperti menampilkan nama klub di TextView dan memuat logo klub menggunakan Glide. Ketika pengguna mengeklik tombol, seperti "Team Squad", MainActivity mengambil daftar pemain (squad) dari objek TeamResponse yang sudah tersimpan, memasukkannya ke dalam Intent sebagai data Parcelable, dan meluncurkan SquadActivity. Terakhir, SquadActivity menerima daftar pemain tersebut dari Intent dan meneruskannya ke PlayerAdapter, yang bertugas menampilkan setiap pemain ke dalam RecyclerView di layar.
