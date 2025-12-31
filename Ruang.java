/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruang;


public abstract class Ruang {

    protected String namaRuang;
    protected int durasiSewa;
    protected int tarifPerJam;

    public Ruang(String namaRuang, int durasiSewa, int tarifPerJam) {
        this.namaRuang = namaRuang;
        this.durasiSewa = durasiSewa;
        this.tarifPerJam = tarifPerJam;
    }

    public abstract int hitungBiaya();
}

    
    
