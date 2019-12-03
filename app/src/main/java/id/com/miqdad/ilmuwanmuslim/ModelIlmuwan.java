package id.com.miqdad.ilmuwanmuslim;

public class ModelIlmuwan {
    private String idJudul;
    private String judul;
    private int gambar;




    public ModelIlmuwan(String idJudul, String judul, int gambar) {
        this.idJudul = idJudul;
        this.judul = judul;
        this.gambar = gambar;


    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    public String getIdJudul() {
        return idJudul;
    }

    public void setIdJudul(String idJudul) {
        this.idJudul = idJudul;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

}
