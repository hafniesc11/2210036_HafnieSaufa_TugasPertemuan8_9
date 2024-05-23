/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Komputer 4B
 */

public class ObjekGeometris {
    private String warna;
    private boolean terisi;
    
    public ObjekGeometris() {
        warna = "putih";
        terisi = false;
    }
    public ObjekGeometris(String warna, boolean terisi) {
        this.warna = warna;
        this.terisi = terisi;
    }
    public String getWarna() {
        return warna;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public boolean isTerisi() {
        return terisi;
    }
    public void setTerisi(boolean terisi) {
        this.terisi = terisi;
    }
    
    @Override
    public String toString() {
        return "Warna: " + warna + " dan Terisi: " + terisi;
    }
}

