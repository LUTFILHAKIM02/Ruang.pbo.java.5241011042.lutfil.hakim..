/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruang;

/**
 *
 * @author Asus
 */
public class RuangAula extends Ruang {

    public RuangAula(String namaRuang, int durasiSewa) {
        super(namaRuang, durasiSewa, 500000);
    }

    @Override
    public int hitungBiaya() {
        return durasiSewa * tarifPerJam;
    }
}

