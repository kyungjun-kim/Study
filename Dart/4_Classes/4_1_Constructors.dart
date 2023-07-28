class Player{
  final String name;
  int xp;

  Player(this.name, this.xp);

  void sayHello(){
    print("Hi my name is $name");
  }
}

void main() {
  var player = Player("Jun", 1500);
  player.sayHello();
  var player2 = Player("Kim", 3000);
  player2.sayHello();
}