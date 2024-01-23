package kr.co.tourapy.hellokotlin

/*
	kotlin 에서 배열(List)과 반복문

	in java
	List<String> list = new ArrayList<>();
	list.add("kim");
	list.add("lee");

	in kotlin
	var list = listOf<String>("kim","lee") // list 는 저장값 수정불가
	or
	val list2 = mutableListOf<String>("kim","lee") // mutableList 는 저장값 수정가능
 */

fun main(){
	// 수정 불가능한 List (read only)
	val names= listOf<String>("kim", "lee", "park")
	// type 추론이 가능하기에 상수의 type, list 의 제네릭 type 모두 생략 가능
	val animals= listOf("dog", "cat", "elephant")
	// 정석코드
	val names2:List<String> = listOf<String>("kim", "lee", "park")
	//listOf() 안에 있는 데이터가 추론 가능하기에 listOf의 generic 도 생략 가능
	val nums=listOf(10,20,30)

	// 배열참조
	println(names[0])
	println(names[1])
	println(names[2])
	println("------")
	println(names.get(0))
	println(names.get(1))
	println(names.get(2))

	// read only 이기에 수정불가함
	// names[0]="김구라" // 오류코드
	// 코틀린에는 자바스크립트보다 많은 메소드(기능)가 존재하나 set 기능이 없음

	val result=names.indices // indices : index 의 복수형

	// 반복문
	for (i in names.indices){
		println(i)
	}
	println("------")
	for (i in names.indices){
		println("$i: ${names[i]}")
	}
	println("------")
	for (item in names){
		println(item)
	}
	println("------")
	names.forEach(fun(item){ // names.forEach(funtion(item){ coding }) 번거롭다.
		println(item)
	})
	println("------")
	names2.forEach {  // {} 안에 coding 만 해도 가능함.
		println(it)
	}
}




















