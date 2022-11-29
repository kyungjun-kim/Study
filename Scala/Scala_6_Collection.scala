// # Scala 기초 문법 공부_5 Collection

// Array
object LearnScala_Array {
    // 배열의 내용을 출력하는 메소드
    def printArray[K](array:Array[K]) = println(array.mkString("Array(" , ", " , ")")) 
    def main(args: Array[String]): Unit = {
        
        // ① Array[Int]  
        val array1 = Array(1, 2, 3)
        print("① ")
        printArray(array1)
        
        // ② Array[Any]
        val array2 = Array("a", 2, true)
        print("② ")
        printArray(array2)
        
        // ③ 배열의 값을 읽고 쓰기
        val itemAtIndex0 = array1(0)        
        array1(0) = 4
        print("③ ")
        printArray(array1)
        
        // ④ 배열을 붙일때는 ++연산자를 이용
        // 앞에 붙일때는 +:, 뒤에 붙일때는 :+ 연산자
        val concatenated = "앞에 붙이기" +: (array1 ++ array2) :+ "뒤에 붙이기"
        print("④ array1과 array2를 더하면: ")
        printArray(concatenated)
        
        // 값으로 index찾기
        array2.indexOf("a")
        
        // ⑤ 다른 값만 가져오기
        val diffArray = Array(1,2,3,4).diff(Array(2,3))
        print("⑤ Array(1,2,3,4).diff(Array(2,3))의 결과: ")
        printArray(diffArray)
        
        
        val personArray = Array(("솔라",1), ("문별",2), ("휘인",3))        
        // ⑥ Find 메소드를 이용해서 findByName이라는 메소드 생성
        // Find는 조건에 맞는 값을 찾으면 검색을 중단
        // getOrElse는 일치하는 값이 없을 경우 넘겨줄 기본 값
        // getOrElse가 없을때 일치하는 값이 없으면 None
        def findByName(name:String) = personArray.find(_._1 == name).getOrElse(("화사",4))
        val findSolar = findByName("솔라")  // 값("솔라",1)을 찾아서 넘겨줌
        val findSun = findByName("태양")  // 값이 없으므로 getOrElse에 있는 값("화사",4)이 들어감
        println(findSolar)
        println(findSun)
    }
}
/*
스칼라에서의 배열은 자바의 배열과 동일 ex) 자바의 int[] 는 스칼라에서는 Array[Int] 와 동일함
스칼라의 배열은 mutable함 -> 사이즈를 변경할 수 있다는 의미보단, 들어있는 값을 변경할 수 있다는 의미의 mutable
배열을 출력하려면 .mkString(",") 와 같은 메소드를 이용해야함 -> 파이썬의  join 같은 느낌인것 같다
*/


// List
object LearnScala_List {
    def main(args: Array[String]): Unit = {
        // List[Any](기본 리스트를 사용하므로 Immutable) 
        val list = List("a", 1, true)
        
        // ① 값을 읽어올 수는 있지만
        val firstItem = list(0)
        // 아래줄과 같이 값을 변경할 수는 없음
        // list(0) = "b"
        println(s"① $firstItem")
        
        // ② 앞에 붙이기는 :: 또는 +: 연산자
        // 리스트 두개를 붙이기는 ++ 또는 :::연산자
        // 뒤에 붙이기는 :+연산자(immutable list에서 효율적인 방법이 아님)
        val concatenated = 0 :: list ++ list :+ 1000
        println(s"② $concatenated")
        
        // ③ Diff
        val diffList = List(1,2,3,4) diff List(2,3)
        println(s"③ $diffList")
        
        //④ 배열의 Find와 같은 방식으로 동작
        val personList = List(("솔라",1), ("문별",2), ("휘인",3))
        def findByName(name:String) = personList.find(_._1 == name).getOrElse(("화사",4))
        val findSolar = findByName("솔라")  //값("솔라",1)을 찾아서 넘겨줌
        val findSun = findByName("태양")  //값이 없으므로 getOrElse에 있는 값("화사",4)이 들어감
        
        println(s"④ ${findSolar}, ${findSun}")
    }
}
/*
리스트는 List(1,2,3)같은 식으로 생성함
스칼라의 기본 리스트는 scala.collection.immutable.list 이므로 값을 변경할 수 "없는" 속성을 가짐
-> 리스트에 값을 추가-제거 하는 방식이 아닌 해당 변경사항을 반영한 새로운 리스트를 만들어내는 방식으로 동작함
-> 기본 List는 Linked List로 구현됨
*/


// Set
object LearnScala_Set {
    def main(args: Array[String]): Unit = {
        // ① 내용을 수정할 수 없는 Set
        val set1 = Set("one", 1) 
        val set2 = Set(1,2,2,2,3,3,3) // 중복이 제거되고 Set(1, 2, 3)이 됨
        println(s"① $set2")
        
        // ② 값이 있는지 체크하는 방법은 괄호 안에 값을 넣어서 사용
        val oneExists = set2(1)  
        val fourExists = set2(4)  
        println(s"② oneExists: ${oneExists}, fourExists: ${fourExists}")
        
        // ③ set을 더하면 중복된 내용은 제거된 새로운 Set이 생성
        val concatenated = set1 ++ set2  
        println(s"③ $concatenated")
        
        // ④ Diff
        val diffSet = Set(1,2,3,4) diff Set(2,3)  
        println(s"④ ${diffSet}")     
        
        /* ⑤ set.find 메소드를 이용해서 findByName이라는 메소드 생성
         * find는 조건에 맞는 값을 찾으면 검색을 중단
         * getOrElse는 일치하는 값이 없을 경우 넘겨줄 기본 값
         * getOrElse가 없을때 일치하는 값이 없으면 None
         */
        val personSet = Set(("솔라",1), ("문별",2), ("    휘인",3))  
        def findByName(name:String) = personSet.find(_._1 == name).getOrElse(("화사",4))  
        val findSolar = findByName("솔라")  // 값("솔라",1)을 찾아서 넘겨줌
        val findSun = findByName("태양")  //값이 없으므로 getOrElse에 있는 값("화사",4)이 들어감
        
        println(s"⑤ ${findSolar._2}, ${findSun._2}")
    }
}
/*
Set은 Set(1,2,3) 같은 형식으로 생성함
튜플이 22까지 기본형식을 갖는것과 마찬가지로, Set 역시 크기가 4일때까지는 Set1~Set4 이고,
크기가 4개보다 많아지게되면 HashSet으로 구현됨
Set은 집합에 대응하는 개념으로, 같은 값을 추가하면 기존 값을 덮어쓰게 되고, 순서가 보장되진 않음
*/


// Map
object LearnScala_Map {
    def main(args: Array[String]): Unit = {
        // ① Map[String, Int] 타입의 맵 
        val map1 = Map("one" -> 1, "two" -> 2, "three" -> 3)   
        // Map[Any, Any] 타입의 맵
        val map2 = Map(1 -> "one", "2" -> 2.0, "three" -> false)   
        println(s"① $map1")
        
        // ② 중복된 키가 있으면 마지막 값을 사용
        println(s"② ${Map('a' -> 1, 'a' -> 2)}")
        
        // ③ key를 가지고 값을 읽어오기
        val one = map1("one")  
        println(s"③ ${one}")
        
        /* ④ 키가 없으면 NoSuchElementException이 발생
         * 예를들어 이런 경우> val fourExists = map1("four")   
         * get메소드를 이용해서 얻어오는 객체의 isDefine값으로 Key가 있는지 확인 가능*/
        val fourExistsOption = map1.get("four")  
        println(s"④ ${fourExistsOption.isDefined}")
        
        // ⑤ ++연산자로 두개의 Map을 더할 수 있으며, 중복된 키("three")의 값은 마지막 값으로 결정
        val concatenated = map1 ++ map2
        println(s"⑤ ${concatenated}")   
        
        // ⑥ find (List, Set과 같은 형태)
        val personMap = Map(("솔라",1), ("문별",2), ("휘인",3))  
        def findByName(name:String) = personMap.getOrElse(name, 4)  
        val findSolar = findByName("솔라")  // 값 1을 찾아서 넘겨줌
        val findSun = findByName("태양")  // 값이 없으므로 4를 넘겨줌
        println(s"⑥ ${findSolar}, ${findSun}")
    }
}
/*
Map은 Map(Key1->value1, key2->value2) 와 같이 생성
스칼라에서 기본 Map은 Predef.Map(scala.collection.immutable.Map)이며 "Immutable"하다
Map도 Set과 마찬가지로 구성요소가 4일때까지는 Map1~Map4이며, 그 이상이 되면 HashMap으로 구현됨
키는 중복값을 가질 수 없으며, Set과 마찬가지로 순서 보장 X
*/


// Array/List/Set/Map의 타입
object LearnScala_Type {
    class Animal()
    class Dog() extends Animal()
    
    def main(args: Array[String]): Unit = {
        // Animal과 Dog이 공통으로 상속받는 최상위 타입은 Animal이므로 아래 코드는 정상 실행
        val array:Array[Animal] = Array(new Animal(), new Dog())
        // val wrongArray:Array[Dog] = Array(new Animal(), new Dog()) 올바르지 않은 타입
        
        // List도 같은 원리로 동작(Animal이 List의 element의 타입)
        val list:List[Animal] = List(new Animal(), new Dog())
        
        // Set도 같은 원리로 동작(Animal이 Set의 element의 타입)
        val set:Set[Animal] = Set(new Animal(), new Dog())
        
        // Map도 같은 원리로 동작
        val map:Map[String, Animal] = Map("Animal" -> new Animal(), "Dog" -> new Dog())        
    }
}
/*
Array, List, Set, Map의 구성요소는 어떤 타입이든 사용할 수 있지만, 최종 타입은 공통으로 상속받는 타입 중 최상위 타입으로 결정됨
타입 관련해서 더 공부해보고 사용해볼 필요 O
*/

// Mutable Collection (변경할 수 있는 타입)
import scala.collection.mutable  

object LearnScala_Mutable {
    def main(args: Array[String]): Unit = {        
        // ① 배열로 구현되는 ArrayBuffer
        val arrayBuffer = mutable.ArrayBuffer(1, 2, 3)   
        arrayBuffer += 4
        arrayBuffer -= 1  
        arrayBuffer ++= List(5, 6, 7)
        println(s"① $arrayBuffer")
        
        // ② Linked list로 구현되는 ListBuffer
        val listBuffer = mutable.ListBuffer("a", "b", "c")  
        println(s"② $listBuffer")
        
        // ③ Mutable Set
        val hashSet = mutable.Set(0.1, 0.2, 0.3)  
        hashSet ++= mutable.Set(5)
        println(s"③ $hashSet")
        
        // ④ Mutable Map
        val hashMap = mutable.Map("one" -> 1, "two" -> 2)  
        hashMap ++= Map("five" -> 5, "six" -> 6)
        println(s"④ $hashMap")
    }
}
/*
스칼라에서는 변경할 수 "없는" Collection을 사용하는 것을 권장함 -> 그래서 기본 컬렉션이 immutable임
하지만 꼭 필요한 경우 변경가능한 컬렌션을 사용할 수 있는데,
ArrayBuffer와 ListBuffer

ArrayBuffer는 자바에서 배열로 구현되는 java.util.ArrayList와 유사
ListBuffer는 List처럼 Linked List로 구현됨

mutable Collection을 사용할 때는 앞에 mutable을 붙여서 사용해야함 -> 숙지
ex) mutable.ArrayBuffer, mutable.ListBuffer, mutable.Set, mutable.Map
*/

// imutable Collection 에서의 var와 val사용
import scala.collection.mutable  

object LearnScala_Immutable {
    def main(args: Array[String]): Unit = {        
        // ① 변경할 수 없는 Collection이 var로 선언된 경우
        var immutableSet = Set(1, 2, 3)   
        immutableSet += 4   
        // 위의 코드는 새로운 Set을 만들어서 immutableSet에 저장하는 아래 코드와 같음
        immutableSet = immutableSet + 4  
        println(s"① $immutableSet")
        
        // ② 변경할 수 있는 Collection이라면 추가하는 Method를 호출하는것과 같음
        val mutableSet = mutable.Set(1, 2, 3)    
        mutableSet += 4   
        // 위의 코드는 mutableSet 자체의 메소드(+=이라는 메소드)를 호출하는 아래 코드와 같음
        mutableSet.+=(4)  
        println(s"② $mutableSet")  
    }
}
/*
변경할 수 없는(immutable) 컬렉션이 var(변수)로 선언된 경우에 Collection에 +=연산자나 -+연산자를 사용할 수 있음
하지만 컬렉션 자체가 변경할 수 없는 형태이므로 이때는 변경사항을 반영한 새로운 Collection이 만들어져서 var로 선언된 변수에 저장됨
-> 스칼라의 구조 자체가 immutable 객체를 변경하기보단 새로운 객체로 반영해 생성하는 듯함

변경할 수 있는(mutable) 컬렉션 경우에는 +=나 -=연산자가 collection의 메소드로 동작
*/