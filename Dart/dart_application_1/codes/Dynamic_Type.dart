void main() {
  //var name;
  dynamic name;
  /* 여러가지 타입을 가질 수 있는 변수에 쓰는 키워드이다. (해당 변수의 타입을 알 수 없을 때 주로 사용)
변수를 선언할 때 dynamic을 쓰거나 값을 지정하지 않으면 dynamic 타입을 가진다.dynamic은 정말 필요할때만 사용 */
  name = 'jun';
  print(name);
  if (name is String){
    print(name.isEmpty);
  }
  name = 12;
  print(name);
  name = true;
  print(name);
}