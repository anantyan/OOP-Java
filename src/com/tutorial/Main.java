package com.tutorial;

// Latihan project
public class Main {

  public static void main(String[] args) {
    Player player1 = new Player("Parjo", 100);    
    Weapon senjata = new Weapon("Katana", 10);
    Armor pelindung = new Armor("Baja Ringan", 5);
    player1.equipWeapon(senjata);
    player1.equipArmor(pelindung);

    System.out.println();

    Player player2 = new Player("Tukijo", 100);
    senjata = new Weapon("Ketapel", 5);
    pelindung = new Armor("Alumunium", 1);    
    player2.equipWeapon(senjata);
    player2.equipArmor(pelindung);

    System.out.println();
    System.out.println("Pertaungan player 1 vs player 2");
    System.out.println();

    player1.attack(player2);

    System.out.println();
    player1.display();

    System.out.println();
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

  void attack(Player playerLain) {
    double attackPower = this.weapon.attackPower;
    System.out.println(this.name+" attacking "+playerLain.name+" with power "+attackPower);
    playerLain.defence(attackPower);
  }

  void defence(double attacker) {
    double damage;
    if(this.armor.defencePower < attacker) {
      damage = attacker - this.armor.defencePower;
    }else{
      damage = 0; 
    }
    this.health = this.health - damage;
    System.out.println(this.name+" gots damage "+attacker);
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

