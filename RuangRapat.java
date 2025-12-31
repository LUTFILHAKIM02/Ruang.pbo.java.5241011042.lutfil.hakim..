/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruang;

/**
 *
 * @author Asus
 */

public abstract class RuangRapat extends Ruang {
    protected int jumlahKursi;
    protected int kapasitasMaks;

    public RuangRapat(String namaRuang, int durasiSewa, int tarifPerJam,
       int jumlahKursi, int kapasitasMaks) {
        super(namaRuang, durasiSewa, tarifPerJam);
        this.jumlahKursi = jumlahKursi;
        this.kapasitasMaks = kapasitasMaks;

        if (jumlahKursi > kapasitasMaks) {
            System.out.println("WARNING: Jumlah kursi melebihi kapasitas maksimal!");
        }
    }
}