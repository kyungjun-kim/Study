/* 개발자들이 실수하지 않게 도와주는 기능 */

enum Team {red, blue}
enum XPLevel {beginner, medium, pro}

class Player{
  String name;
  XPLevel xp;
  Team team;

  Player({
    required this.name,
    required this.xp,
    required this.team,
  });

  void sayHello(){
    print("Hi my name is $name");
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
