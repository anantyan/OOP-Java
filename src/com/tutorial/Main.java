package com.tutorial;

// Latihan project
public class Main {

  public static void main(String[] args) {
    Player player1 = new Player("Parjo", 100);
    Player player2 = new Player("Tukijo", 100);
    
    Weapon senjata = new Weapon("Katana", 500);
    Armor pelindung = new Armor("Baja Ringan", 200);
    player1.equipWeapon(senjata);
    player1.equipArmor(pelindung);
    player1.display();

    System.out.println();

    senjata = new Weapon("Ketapel", 350);
    pelindung = new Armor("Alumunium", 50);    
    player2.equipWeapon(senjata);
    player2.equipArmor(pelindung);
    player2.display();
  }
}

class Player {
  String name;
  double health;
  int level;

  // deklar weapon & armor
  Weapon weapon;
  Armor armor;

  Player(String name, double health) {
    this.name = name;
    this.health = health;
  }

  void equipWeapon(Weapon weapon) {
    this.weapon = weapon;
  }

  void equipArmor(Armor armor) {
    this.armor = armor;
  }

  void display() {
    System.out.println("Name: "+this.name+", Health: "+this.health+" hp");
    this.weapon.display();
    this.armor.display();
  }
}

class Weapon {
  double attackPower;
  String name;

  Weapon(String name, double attackPower){
    this.name = name;
    this.attackPower = attackPower;
  }

  void display() {
    System.out.println("Weapon: "+this.name+", Attack: "+this.attackPower);
  }
}

class Armor {
  double defencePower;
  String name;

  Armor(String name, double defencePower){
    this.name = name;
    this.defencePower = defencePower;
  }

  void display() {
    System.out.println("Armor: "+this.name+", Defence: "+this.defencePower);
  }
}

