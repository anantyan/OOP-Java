package com.tutorial;

import java.util.Scanner;

public class KonversiSuhu {

  static float Angka;

  public static void main(String[] args) {
    RumusSuhu suhu = new RumusSuhu();
    double Fahrenheit, Kelvin, Celcius, Reamur;
    char Awal;
    boolean valid = false;
    Scanner input = new Scanner(System.in);

    while(valid != true) {
      System.out.print("Masukan suhu [C, R, K, F]: ");
      Awal = input.next().charAt(0);

      System.out.print("Masukan angka: ");
      Angka = input.nextFloat();
      System.out.println();

      switch(Awal){
          case 'C':
              Reamur = suhu.CtoR();
              Fahrenheit = suhu.CtoF();
              Kelvin = suhu.CtoK();
              System.out.println("Suhu awal = "+Angka+":");
              System.out.println("Fahrenheit : "+Fahrenheit);
              System.out.println("Kelvin : "+Kelvin);
              System.out.println("Reamur : "+Reamur);
              break;
          case 'F':
              Celcius = suhu.FtoC();
              Reamur = suhu.FtoR();
              Kelvin = suhu.FtoK();
              System.out.println("Suhu awal = "+Angka+":");
              System.out.println("Celcius : "+Celcius);
              System.out.println("Kelvin : "+Kelvin);
              System.out.println("Reamur : "+Reamur);
              break;
          case 'K':
              Celcius = suhu.KtoC();
              Reamur = suhu.KtoR();
              Fahrenheit = suhu.KtoF();
              System.out.println("Suhu awal = "+Angka+":");
              System.out.println("Celcius : "+Celcius);
              System.out.println("Fahrenheit : "+Fahrenheit);
              System.out.println("Reamur : "+Reamur);
              break;
          case 'R':
              Celcius = suhu.RtoC();
              Fahrenheit = suhu.RtoF();
              Kelvin = suhu.RtoK();
              System.out.println("Suhu awal = "+Angka+":");
              System.out.println("Celcius : "+Celcius);
              System.out.println("Fahrenheit : "+Fahrenheit);
              System.out.println("Kelvin : "+Kelvin);
              break;
          default :
              System.out.println("Masukkan suhu secara benar [C, F, K, R]");
              break;
      }
    }
  }
}