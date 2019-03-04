package com.intvw.practise;

class Difference {
    
    public static void main(String[] args) {
      display();  //calling without object
      Difference t = new Difference();
      t.show();  //calling using object
    }
   
    static void display() {
      System.out.println("Programming is amazing.");
    }
   
    void show(){
      System.out.println("Java is awesome.--> "+SimpleStaticExample.mystr);
    }
  }
