/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan47.nilaimahasiswa;

/**
 *
 * @author PC
 */
public class NilaiMahasiswa {
    private double nilaiAkhir, quiz, uts, uas;
    
    
    public NilaiMahasiswa(double quiz, double uts, double uas){
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
    }
    public double hitunganNilaiAkhir(){
        return nilaiAkhir = (quiz*0.2)+(uts*0.3)+(uas*0.5);
    }
    
    public String aturanIndex(double nilaiAkhir){
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) return "A";
        else if (nilaiAkhir >= 68 && nilaiAkhir < 80) return "B";
        else if (nilaiAkhir >= 56 && nilaiAkhir < 68) return "C";
        else if (nilaiAkhir >= 45 && nilaiAkhir < 56) return "D";
        else return "E";
    }
    public String Keterangan(String index){
        String ket;
        if(index.equals("A")) ket = "Sangat Baik";
        else if(index.equals("B")) ket = "Baik";
        else if(index.equals("C")) ket = "Cukup";
        else if(index.equals("D")) ket = "Kurang";
        else ket = "Sangat Kurang";
        return ket;
    }
    
    public void tampilNilai(){
        nilaiAkhir = hitunganNilaiAkhir();
        System.out.println("Quiz \t\t= " + quiz);
        System.out.println("UTS \t\t= "+ uts);
        System.out.println("UAS \t\t= "+ uas);
        System.out.println("");
        System.out.println("Nilai Akhir \t= "+ nilaiAkhir);
        System.out.println("");
        System.out.println("Index \t\t= "+ aturanIndex(nilaiAkhir));
        System.out.println("Keterangan \t= "+ Keterangan(aturanIndex(nilaiAkhir)));
        System.out.println("");
    }
}
