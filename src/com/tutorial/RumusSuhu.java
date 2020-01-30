package com.tutorial;

public class RumusSuhu { 

  // Celcius ke beberapa suhu
  public  float CtoF() {
    return KonversiSuhu.Angka*1.8f+32; // F = (9/5)C+32
  }

  public  float CtoR() {
    return KonversiSuhu.Angka*0.8f; // R = (4/5)C
  }

  public  float CtoK() {
    return KonversiSuhu.Angka+273.15f; // K = C+273.15
  }

  // Fahrenheit ke beberapa suhu
  public  float FtoC() {
    return (KonversiSuhu.Angka-32)/1.8f; // C = 5/9(F-32)
  }

  public  float FtoR() {
    return (KonversiSuhu.Angka-32)/2.25f; // R = 4/9(F-32)
  }

  public  float FtoK() {
    return (KonversiSuhu.Angka+459.67f)/ 1.8f; // K = 5/9(F-32)+273
  }

  // Kelvin ke beberapa suhu
  public  float KtoC() {
    return KonversiSuhu.Angka-273.15f; // C = K-273.15
  }

  public  float KtoR() {
    return (KonversiSuhu.Angka-273.15f)*0.8f; // R = 4/5(K-273.15)
  }

  public  float KtoF() {
    return KonversiSuhu.Angka*1.8f-459.67f; // F = 9/5(K-273.15)
  }

  // Reamur ke beberapa suhu
  public  float RtoC() {
    return KonversiSuhu.Angka/0.8f; // C = (5/4)R
  }

  public  float RtoK() {
    return KonversiSuhu.Angka/0.8f+273.15f; // K = (9/4)R+32
  }

  public  float RtoF() {
    return KonversiSuhu.Angka*2.25f+32f; // F = C+273.15 | (5/4)R+273.15
  }
}