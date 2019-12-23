package com.tutorial;

public class Main {

  public static void main(String[] args) throws Exception {
    //tutorial langsung ke #3 karena #2 instalasi konfigurasi project visual studio code
    //object
    Mahasiswa mhs = new Mahasiswa();
    mhs.namaLengkap = "Arya Rezza Anantya";
    mhs.nim = "19SA1011";
    mhs.kelas = "TI19A";
    mhs.email = "anantya4995@gmail.com";

    System.out.println(mhs.namaLengkap);
    System.out.println(mhs.nim);
    System.out.println(mhs.kelas);
    System.out.println(mhs.email);
  }
}

//class
class Mahasiswa {
  String namaLengkap;
  String nim;
  String kelas;
  String email;
}