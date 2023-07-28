enum Transmition { auto, manual }
class Car {
    Transmition transmition;
    Car(this.transmition);
}

void main(){
  var car = Car(Transmition.auto);
}