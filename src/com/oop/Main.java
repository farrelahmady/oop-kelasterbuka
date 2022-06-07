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

  // constructor with parameter
  Mahasiswa(String name, String NIM, String major, double IPK, int age) {
    this.name = name;
    this.NIM = NIM;
    this.major = major;
    this.IPK = IPK;
    this.age = age;
  }
}

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    Mahasiswa mhs1 = new Mahasiswa("Budi", "12345", "Informatika", 3.5, 20);

    System.out.println(mhs1.name);
    System.out.println(mhs1.NIM);
    System.out.println(mhs1.major);
    System.out.println(mhs1.IPK);
    System.out.println(mhs1.age);
  }
}