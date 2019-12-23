package com.tutorial;

public class Main {

  public static void main(String[] args) throws Exception {
    //object
    /* new Mahasiswa(); */
    new Mahasiswa("Arya Rezza Anantya", "19SA1011", "TI19A", "anantya4995@gmail.com");
  }
}

//class
class Mahasiswa {
  String namaLengkap;
  String nim;
  String kelas;
  String email;

  /* Mahasiswa(){
    System.out.println("Ini adalah constructor");
  } */
  
  Mahasiswa(String inputNamaLengkap, String inputNim, String inputKelas, String inputEmail){
    namaLengkap = inputNamaLengkap;
    nim = inputNim;
    kelas = inputKelas;
    email = inputEmail;

    System.out.println(namaLengkap+"\n"
      +nim+"\n"
      +kelas+"\n"
      +email);
  }
}