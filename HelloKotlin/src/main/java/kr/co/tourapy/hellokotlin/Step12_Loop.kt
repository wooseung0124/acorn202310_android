package kr.co.tourapy.hellokotlin

fun main(){
	// 수정 가능한 String 목록
	val names:MutableList<String> = mutableListOf<String>("김구라", "해골", "원숭이", "주뎅이", "덩어리")
	// 수정 불가능한 String 목록
	val names2:List<String> = listOf<String>("김구라", "해골", "원숭이", "주뎅이", "덩어리")

	/*
		val 과 var 은 참조값을 바꿀 수 있는 지 여부를 따지는 것이고
		ListOf 와 MutableList 는 배열 내에 들어 있는 요소를 수정할 수 있는 지 여부를 보는 것이다.
	 */

	for (item in names){
		println(names)
	}

	println("----------")
	// index 도 필요하다면
	for(i in names.indices){
		println("$i 번째 인덱스 : ${names[i]}") // 배열 문법으로 참조
		println("$i 번째 인덱스 : ${names.get(i)}") // 메서드를 이용해서 참
	}
	// names 에 모두 "님"을 붙이기(수정)
	for (i in names.indices){
		names[i] = names[i]+"님"
		// names[i] = names.get(i)+"님"
		// names.set(i, names.get(i)+"님")
	}
}