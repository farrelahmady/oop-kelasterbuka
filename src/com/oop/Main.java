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
    // 'this' refer to current object (Mahasiswa Class)
    this.name = name;
    this.NIM = NIM;
    this.major = major;
    this.IPK = IPK;
    this.age = age;
  }

  // Void method without parameter
  void show() {
    System.out.println("Name: " + name);
    System.out.println("NIM: " + NIM);
    System.out.println("Major: " + major);
    System.out.println("IPK: " + IPK);
    System.out.println("Age: " + age);
  }

  // Void method with parameter
  void setName(String name) {
    this.name = name;
  }

  // Non-Void method without parameter
  String getName() {
    return this.name;
  }

  // Non-Void method with parameter
  String saySomething(String text) {
    return this.name + ": \"" + text + "\"";
  }
}

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    Mahasiswa mhs1 = new Mahasiswa("Budi", "12345", "Informatika", 3.5, 20);
    System.out.println("========================================================");
    mhs1.show();

    System.out.println("========================================================");
    mhs1.setName("Farrel");
    System.out.println("Name: " + mhs1.getName());

    System.out.println("========================================================");
    System.out.println(mhs1.saySomething("Hello World"));

    // pass by reference
    Mahasiswa mhs2 = mhs1;
    // If changing anything in the mhs2, it will also change the of mhs1

    // Bukti
    System.out.println("========================================================");
    String addressMhs1 = Integer.toHexString(System.identityHashCode(mhs1));
    System.out.println("Mhs1 Address: " + addressMhs1);
    String addressMhs2 = Integer.toHexString(System.identityHashCode(mhs2));
    System.out.println("Mhs2 Address: " + addressMhs2);
  }
}