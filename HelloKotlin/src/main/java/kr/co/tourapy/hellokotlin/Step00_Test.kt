package kr.co.tourapy.hellokotlin

class Bird{
	companion object{
		fun sing(){
			println("노래해요!")
		}
	}
}

class MyData{
	//문자열을 담을 필드
	lateinit var name:String

	//인자로 전달받은 문자열을 필드에 저장하는 메소드
	fun putName(name:String){
		this.name=name
	}
}

/*
class Web  extends RTC{
    static final  String  brand="Google";

    void run( ){
        System.out.println("실행");
    }
}
 */

open class RTC{

}

class Web : RTC(){
	companion object{
		val brand : String = "Google";
	}

	fun run(){
		println("실행")
	}
}


fun main() {
	//Bird 클래스의 sing() 메소드를 호출하려면 여기를 어떻게 코딩해야 하는가?
	Bird.sing()

	val nums1:List<Int> = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
	val result:List<Int> = nums1.filter { item-> item%2 == 0 }
	println(result)

	val nums = listOf(10, 20, 30, 40, 50)
	nums.forEach { println(it) }

	val  list :  List<Any>  =  listOf(10, "kim", true )
}

val f : (Int, String, Boolean)->Unit  = fun(num:Int, name:String, isMan:Boolean){}