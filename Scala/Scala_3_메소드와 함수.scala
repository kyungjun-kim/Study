// # Scala 기초 문법 공부_3

// 메소드 정의
object LearnScala {
    // ① 일반적인 메소드
    def add(x:Int, y:Int):Int = {
        return x + y        
    }
    
    // ② return을 생략한 메소드
    def addWithoutReturn(x:Int, y:Int) = { // x + y는 int이므로 return타입은 Int로 결정됨
        x + y // return을 적어주지 않아도 마지막 값이 return값
    }
    
    // ③ 메소드가 한 줄일 경우 중괄호{} 생략 가능
    def addWithoutBlock(x:Int, y:Int) = x + y
    
    def main(args: Array[String]): Unit = {
        println(s"① ${add(1,2)}")
        println(s"② ${addWithoutReturn(1,2)}")
        println(s"③ ${addWithoutBlock(1,2)}")          
    }
}
/*
리턴 값이 있는 메소드의 경우 메소드 정의 블록 {} 전에 = 을 적어야 함
리턴 키워드를 정해두지 않을경우, 리턴 타입은 리턴 값에 의해 결정됨 -> 편리
*/


// 익명함수1
object LearnScala {
    
    // 매개변수로 받은 익명함수에 1과 2를 넣어서 실행하는 메소드
    def doWithOneAndTwo(f: (Int, Int) => Int) = {  
        f(1, 2) //return은 생략되었지만, f(1, 2)의 결과가 return
    }
    
    def main(args: Array[String]): Unit = {
        // ① 명시적으로 타입을 선언하는 익명함수
        val call1 = doWithOneAndTwo((x: Int, y: Int) => x + y)
        
        // ② 코드4번째 줄에서 익명함수의 매개변수 타입(Int, Int)을 이미 정했기 때문에 생략
        val call2 = doWithOneAndTwo((x, y) => x + y)  
        
        // ③ 이렇게 요약할 수도 있음
        val call3 = doWithOneAndTwo(_ + _) // 매개변수의 순서대로 _에 대입됨
        
        println(call1, call2, call3)
    }
}
