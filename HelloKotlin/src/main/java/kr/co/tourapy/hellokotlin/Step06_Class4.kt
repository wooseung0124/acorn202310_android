package kr.co.tourapy.hellokotlin

class Cat{

	// var name:String="" // 이것도 가능하긴 하다.
	// var name:String?=null // 이것도 되긴 하다.

	// 위에 두 코드 모두 가능하긴 하지만 null 을 넣긴 싫고 나중에 값을 넣고 싶을 경우는?

	// 선언만 하고 값을 나중에 넣을 예정이라면 lateinit 이라는 예약어를 붙여주면 된다.
	lateinit var name:String

	// 필드에 값을 넣어주는 메소드
	fun putName(name:String){
		this.name=name
	}
}

class Cat2{

	var name:String?=null

	// 필드에 값을 넣어주는 메소드
	fun putName(name:String){
		this.name=name
	}
}

fun main(){
	val c1=Cat()
	c1.putName("톰캣")

	val c2=Cat2()
	c2.putName("나비")
}