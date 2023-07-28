mixin class Strong {
  final double strengthLevel = 1500.99;
}

mixin class QuickRunner {
  void runQuick() {
    print("ruuuuuuuuun");
  }
}

mixin class Tall {
  final double height = 1.99;
}

enum Team {blue, red}

class Player with Strong, QuickRunner, Tall {
  final Team team;
  
  Player({
    required this.team,
    required String name
  });

  void sayHello() {
    print("and i play for ${team}");
  }

}

class Horse with Strong, QuickRunner {}

class kid with QuickRunner {}

void main() {
  var player = Player(team : Team.red,
  name : "Jun");
}
