/*Null Safety

개발자가 null 값을 참조할 수 없도록 하는 것이다.
String뒤에 ?를 붙여줌으로서 name이 String 또는 null이 될 수 있다고 명시해준 것입니다.
기본적으로 모든 변수는 non-nullable(null이 될 수 없음)이다.
dart에서는 어떤 변수가 null이 될 수 있음을 정확히 표시해야 함
String 혹은 null값을 가진 변수를 생성하려면 Stirng? 같이 형식뒤에 ?를 추가
*/


/* Without null safety :
bool isEmpty(String string) => string.length == 0;

void main() {
  isEmpty(null);
}
*/
void main() {
  String? name = 'jun';
  name = null;
  name?.isNotEmpty;
  // 바로 위의 코드는 바로 밑의 코드와 동일한 의미
  if (name != null) {
    name.isNotEmpty;
  }
}

