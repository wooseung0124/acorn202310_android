package kr.co.tourapy.hellokotlin

class User{
	// null 이 가능한 필드 선언
	var num:Int?=null
	var userName:String?=null

	// 인자로 어떤 값도 받지 않는 생성자
	constructor(){
		println("빈 생성자 호출됨")
	}

	// 인자로 Int type 과 String type 을 전달받는 생성자
	constructor(num:Int, userName:String){
		this.num=num
		this.userName=userName
	}

	fun showInfo(){
		println("num:${this.num}, userName:${this.userName}")
	}
}

fun main(){
	val u1=User()
	val u2=User(1, "김구라")

	u1.showInfo() // => num:null, userName:null
	u2.showInfo() // => num:1, userName:김구라

	println("==========")

	//val u3=User2()
	val u4=User2(2, "해골") // new 생성하는 과정에서 스스로가 1번 실행됨, 왜냐하면 밑에 설명씀

	//u3.showInfo()
	println("==========")
	//u4.showInfo()
}

class User2 constructor(){ // 클래스 옆에 선언한 생성자는 primary 생성자이다. 이건 반드시 호출하게 된다.

	// null 이 가능한 필드 선언
	var num:Int?=null
	var userName:String?=null

	// primary 생성자의 일부
	init{
		println("primary 생성자 호출됨")
	}

	// primary 생성자가 클래스에 존재한다면 반드시 primary 생성자를 호출해야한다.
	constructor(num:Int, userName:String):this(){ // :this() 는 인자로 아무것도 전달하지 않아도 되는 primary 생성자를 호출하는 표현식
		this.num=num
		this.userName=userName
	}

	fun showInfo(){
		println("num:${this.num}, userName:${this.userName}")
	}

	/*
	 	작동순서
	 	1. constructor(...):this(){} // 강제호출
	 	2. class User2 constructor() // this() 를 통해 호출 대상자 지정
	 	3. init // 동작
 	*/
}