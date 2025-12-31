/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruang;

/**
 *
 * @author Asus
 */
public class RuangRapatBesar extends RuangRapat {
    private boolean soundSystem;
    private boolean projector;

    public RuangRapatBesar(String namaRuang, int durasiSewa, int jumlahKursi,
       boolean soundSystem, boolean projector) {
        super(namaRuang, durasiSewa, 200000, jumlahKursi, 25);
        this.soundSystem = soundSystem;
        this.projector = projector;
    }

  
    public int hitungBiaya() {
        int total = durasiSewa * tarifPerJam;

        if (soundSystem) {
            total += 50000;
        }
        if (projector) {
            total += 100000;
        }

        return total;
    }
}
