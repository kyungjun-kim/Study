// # Scala 기초 문법 공부_3

// 메소드 정의
object LearnScala_def {
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


// 익명함수 1
object LearnScala_def_1 {
    
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
/*
익명 함수는 타입을 가지며, doWithOneAndTwo 함수를 보면, (Int, Int) => Int) 와 같은 타입의 익명 함수만 Input 가능
따라서 doWithOneAndTwo((x, y) => x + y) 와 같은 익명 함수 사용 가능.  -> 기존에 사용해본 적이 없는 함수 방식이라 더 활용해봐야 할 것 같음
또 doWithOneAndTwo(_ + _) 와 같이 변수명이 생략된 형태로도 실행이 가능함 -> 이것도 능숙해지면 편리하게 사용할 수 있을 것 같음
*/


// 익명함수 2
object LearnScala_def_2 {    
    // ① 메소드를 정의하는 방식
    def add1(x:Int, y:Int) = x + y 
    
    // ② 익명함수
    val add2 = (x:Int, y:Int) => x + y 
    
    // ③ 익명함수를 정의하는 다른 방식
    val add3:(Int,Int)=>Int = _ + _ 
    
    // ④ 익명함수를 정의하는 또다른 방식(잘 사용 안함)
    val add4 = (_ + _):(Int,Int)=>Int 
    
    def main(args: Array[String]): Unit = {
        // 모두 두 숫자를 더해주는 역할을 하므로 같은 결과를 출력
        println(s"① ${add1(42,13)}")  
        println(s"② ${add2(42,13)}")  
        println(s"③ ${add3(42,13)}")  
        println(s"④ ${add4(42,13)}")  
    }
}
/*
int x와 y를 input 값으로 사용하는 여러 함수들의 다른 표현 -> 상황에 맞게 잘 활용해봐야할 것 같음
특히 " _ " 를 유용하게 사용할 수 있을 것 같음
*/
