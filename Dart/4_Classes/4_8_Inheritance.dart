class Human {
  final String name;
  Human({ required this.name});
  void sayHello() {
    print("Hi my name is $name");
  }
}

enum Team {blue, red}

class Player extends Human{
  final Team team;
  
  Player({
    required this.team,
    required String name
  }) : super(name: name);

  @override
  void sayHello() {
    super.sayHello();
    print("and i play for ${team}");
  }

}


void main() {
  var player = Player(team : Team.red,
  name : "Jun");
  player.sayHello();
  
}
