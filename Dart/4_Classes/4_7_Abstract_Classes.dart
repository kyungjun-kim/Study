abstract class Human {
  void walk();
}

enum Team {red, blue}
enum XPLevel {beginner, medium, pro}

class Player extends Human{
  String name;
  XPLevel xp;
  Team team;

  Player({
    required this.name,
    required this.xp,
    required this.team,
  });
  void walk() {
    print("I'm walking");
  }

  void sayHello(){
    print("Hi my name is $name");
  }

}

class Coach extends Human {
  void walk(){
    print("Coach is walking");
  }
}
void main() {
  var jun = Player(name:'jun', xp: XPLevel.medium, team: Team.red);
  var patata = jun
    ..name = "potato"
    ..xp = XPLevel.pro
    ..team = Team.blue
    ..sayHello();
}
