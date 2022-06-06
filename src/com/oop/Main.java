package com.oop;

// make class as template
/**
 * Mahasiswa
 */
class Mahasiswa {
  String name;
  String NIM;
  String major;
  double IPK;
  int age;
}

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    Mahasiswa mhs1 = new Mahasiswa();
    mhs1.name = "Budi";
    mhs1.NIM = "12345";
    mhs1.major = "Informatics";
    mhs1.IPK = 3.5;
    mhs1.age = 20;

    System.out.println(mhs1.name);
    System.out.println(mhs1.NIM);
    System.out.println(mhs1.major);
    System.out.println(mhs1.IPK);
    System.out.println(mhs1.age);
  }
}