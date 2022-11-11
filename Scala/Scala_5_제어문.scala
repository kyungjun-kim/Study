// # Scala 기초 문법 공부_5 제어문

// 반복문
object LearnScala {
    def main(args: Array[String]): Unit = {
        // ① while문
        var i, sum = 0  
        while ( i < 10) {  
            sum += i  
            i+=1 
        }  
        println(s"① $sum")
        
        // ② for문
        sum = 0  
        for ( i <- 0 until 10) {  
            sum += i  
        }  
        println(s"② $sum")  
        
        //③ 가장 스칼라스럽게 합을 구하는 방법
        sum = (0 until 10).sum  
        println(s"③ $sum")
    }
}
/*
스칼라는 for, while문을 제공하며 ++ 나 --를 제공하지 않음 -> += 1, -=1 *=1 등을 사용해야함
sum = (0 until 10).sum 같은 방식을 통해 for이나 while 없이 쉽게 반복문의 결과 추출 가능
*/


// 중첩된 for문
object LearnScala {
    def main(args: Array[String]): Unit = {
        for( a<- 1 to 3){
            for( b <- 10 to 12){
                println(a,b)
            }
        }
        println("중첩된 for문 대신 아래와 같이 쓸 수 있습니다.")
        for( a <- 1 to 3; b <- 10 to 12){
            println(a,b)
        }
    }
}
/*
스칼라에서는 for문에 여러개의 range를 세미콜론으로 구분해서 적어주면 for문을 중첩해서 사용한 것과 동일 -> 반복문을 길어지지 않고 간결하게 사용 가능
파이썬과 자바의 중간 그 어딘가 같아 보임,,
*/


// if문
object LearnScala {
    def main(args: Array[String]): Unit = {
        if (true)   
            println("한 줄은 {괄호}를 생략할 수 있습니다.")  
        
        if (1 + 1 == 2) {  
            println("여러 줄은")  
            println("{괄호}가 필요합니다.")  
        } else {  
            println("컴퓨터가 미쳤나봐요.")  
        }
        
        val likeEggs = false  
        // 삼항 연산자대신 이렇게 쓸 수 있습니다.
        val breakfast =  
          if (likeEggs) "계란후라이"  
          else "사과"  
        
        println(s"아침으로 ${breakfast}를 먹어요")  
    }
}
/*
조건문은 자바나 C와 비슷 
하지만 스칼라에서는 if문도 수식이라, if (likeEggs) "계란후라이"  와 같은 코드 작성 가능
*/