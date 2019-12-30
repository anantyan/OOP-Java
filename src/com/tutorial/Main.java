package com.tutorial;

public class Main {

  public static void main(String[] args) throws Exception {
    //object
    Mahasiswa mhs0 = new Mahasiswa("Yayan", "19SA9999", "TI19A");
    
    System.out.println(mhs0.nama);
    System.out.println(mhs0.nim);
    System.out.println(mhs0.kelas);

    mhs0.setNama("Terserah");
    System.out.println(mhs0.getNama());
    //end object
  }
}

//class
class Mahasiswa {
  String nama;
  String nim;
  String kelas;

  //constructor
  Mahasiswa(String inputNama, String inputNim, String inputKelas) {
    this.nama = inputNama;
    this.nim = inputNim;
    this.kelas = inputKelas;
  }
  //end constructor

  //methods
  public void setNama(String inputNama) {
    this.nama = inputNama;
  }

  String getNama() {
    return this.nama;
  }
  //end methods
}
//end class