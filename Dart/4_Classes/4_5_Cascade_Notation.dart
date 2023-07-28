class Player{
  String name;
  int xp;
  String team;

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
  var jun = Player(name:'jun', xp: 1200, team: 'red');
  var patata = jun
    ..name = "potato"
    ..xp = 10000
    ..team = 'blue'
    ..sayHello();
}