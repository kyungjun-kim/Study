// # Scala 기초 문법 공부_2

// Range & List
object LearnScala {
    def main(args: Array[String]): Unit = {
        // ① to를 이용하면 1부터 10을 포함하는 Range를 생성
        val range1 = 1 to 10
        println(s"① 1 to 10 →\n\t $range1")
        
        // ② until을 이용하면 마지막 숫자를 포함하지 않는 Range를 생성
        val range2 = 1 until 10
        println(s"② 1 until 10 →\n\t $range2")
        
        // ③ by를 이용하면 숫자를 건너 띄는 Range를 생성
        val range3 = 1 until 10 by 3
        println(s"③ 1 until 10 by 3 →\n\t $range3")
        
        // ④ toList를 통해 List로 변환
        println(s"④ range1.toList →\n\t ${range1.toList}")
        
        // ⑤ filter: 조건에 맞는것만 모으기(4 이상인것만 모으기)
        val moreThan4 = range1.filter(_ > 4)  
        println(s"⑤ range1.filter(_ > 4) →\n\t $moreThan4")
        
        // ⑥ map - 각 아이템의 값을 변경
        val doubleIt = range1.map(_ * 2)  
        println(s"⑥ range1.map(_ * 2) →\n\t $doubleIt")
    }
}
/*
to, until, by 라는 편리한 기능을 제공해주고, range의 filter와 map기능도 유용하게 쓸 수 있을것 같음
*/


// 숫자 다루기
object LearnScala {
    def main(args: Array[String]): Unit = {
        val num = -5  
        val numAbs = num.abs // 절대값
        val max5or7 = numAbs.max(7) // 5(numAbs)와 7 사이의 최대값  
        val min5or7 = numAbs.min(7) // 5(numAbs)와 7 사이의 최소값
        println(numAbs) // 5  
        println(max5or7) // 7   
        println(min5or7) // 5  
    }
}
/*
val로 숫자 상수 지정해 사용 
abs, max, min같은 기능은 다른 언어와 비슷하고
max(숫자), min(숫자) 기능은 활용해봐야겠음
*/


// 문자열 다루기
object LearnScala {
    def main(args: Array[String]): Unit = {
        // ① 뒤집기
        val reverse = "Scala".reverse 
        println(s"① $reverse")
        
        // ② 첫글자를 대문자로
        val cap = "scala".capitalize
        println(s"② $cap")
        
        // ③ 7번 반복
        val multi = "Scala! " * 7
        println(s"③ $multi") 
        
        // ④ 정수로 변환
        val int = "123".toInt
        println(s"④ $int")
    }
}
/*
다른 언어와 비슷한 기능들이 많아 쉽게 활용할 수 있을것 같음
*/