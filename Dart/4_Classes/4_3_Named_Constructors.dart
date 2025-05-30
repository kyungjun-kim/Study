class Player{
  final String name;
  int xp, age;
  String team;

  Player({
    required this.name, 
    required this.xp, 
    required this.team, 
    required this.age,});

  Player.createBluePlayer({
    required String name, 
    required int age,
    })
    : this.age = age,
      this.name = name,
      this.team = 'blue',
      this.xp = 0;

  Player.createRedPlayer(String name, int age) 
  : this.age = age,
    this.name = name,
    this.team = 'red',
    this.xp = 0;


  void sayHello(){
    print("Hi my name is $name");
  }
}

void main() {
  var player = Player.createBluePlayer(
    name : "jun",
    age : 27,
  );
  var player2 = Player.createRedPlayer("kim",28);

  player.sayHello();
  player2.sayHello();
}