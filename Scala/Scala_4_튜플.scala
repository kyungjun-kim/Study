// # Scala 기초 문법 공부_4 튜플

// 튜플
object LearnScala {
    def main(args: Array[String]): Unit = {
        val t1 = new Tuple3(1, "hello", true)
        val t2 = (1, "hello", true)
        
        println(t2)
        
        var numbers = (1,2,3,4)
        val sum = numbers._1 + numbers._2 + numbers._3 + numbers._4
        println(sum)
    }
}
/*
val t1 처럼 튜플은 동일하지 않더라도 여러 타입의 객체를 포함 가능
val t2은 t1과 동일하지만 더 간결한 형태
스칼라에서는 포함하고 있는 내부의 객체를 Tuple1~Tuple22까지 사용할 수 있고,
그 이상을 사용하려면 컬렉션과 같은 다른 자료구조를 사용해야한다고 함 -> 22보다 긴 튜플을 정의할 경우
-> "tuples may not have more than 22 elements, but 23 given" 이란 메세지가 뜨며 튜플을 정의할 수 없게됨
*/ 


// 여러개의 값 리턴
object LearnScala {
    def swap(x:String, y:String) = (y, x)  
    
    def main(args: Array[String]): Unit = {
        val (a,b) = swap("hello","world")
        println(a, b)
    }
}
/*
튜플을 이용해 한번에 여러개의 값 리턴 가능
*/


// 변수에 값 넣기
object LearnScala {
    def main(args: Array[String]): Unit = {
        
        var (x, y, z, c, python, java) = (1, 2, 3, true, false, "no!")  
        println(x, y, z, c, python, java)  
        
    }
}
// 튜플을 이용해 한번에 여러개의 변수를 정의할 수 있음
