class Player{
  final String name;
  int xp;
  String team;
  int age;

  Player({required this.name, 
  required this.xp, 
  required this.team, 
  required this.age,});

  void sayHello(){
    print("Hi my name is $name");
  }
}

void main() {
  var player = Player(
    name : "jun",
    xp : 1200,
    team : 'blue',
    age : 27,
  );
  var player2 = Player(
    name : "kim",
    xp : 1500,
    team : 'blue',
    age : 28,
  );
  player.sayHello();
  player2.sayHello();
}