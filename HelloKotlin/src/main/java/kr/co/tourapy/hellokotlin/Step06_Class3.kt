package kr.co.tourapy.hellokotlin

/*
	class Member(num:Int,name:String,addr:String){
	var num:Int
	var name:String
	var addr:String
	init{
		this.num=num
		this.name=name
		this.addr=addr
	}
}

	이 코드를 더 줄이면 밑에 코드와 같다.
 */

class Member(var num:Int, var name:String, var addr:String)

// data 예약어를 붙이면 toString() 메서드가 자동 재정의되고 copy() 메서드가 생긴다.
// 콘솔창에 출력했을 때 필드에 저장된 내용을 알 수 있다.
data class Member2(var num:Int, var name:String, var addr:String)

fun main(){
	val m1=Member(1,"김구라", "노량진")
	println(m1) // 숫자나 문자 이외는 객체를 출력할 순 없다. => kr.co.tourapy.hellokotlin.Member@3cb5cdba

	val m2=Member2(1,"김구라", "노량진")
	println(m2) // => Member2(num=1, name=김구라, addr=노량진)

	val m3=m2.copy()
	println(m3)
	if(m2 == m3) println("m2와 m3 는 같아요") else println("m2와 m3 는 달라요")
}