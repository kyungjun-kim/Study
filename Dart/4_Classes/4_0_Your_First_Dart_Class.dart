class Player{
    final String name = 'Jun';
    int xp = 1500;

    void sayHello(){
      print("Hi my name is $name");
    }
}

void main() {
    var player = Player();
    print(player.name);
    player.sayHello();
}