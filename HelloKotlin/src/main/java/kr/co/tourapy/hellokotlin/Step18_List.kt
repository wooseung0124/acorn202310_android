package kr.co.tourapy.hellokotlin

fun main(){
	// read only 문자열 List
	val names = listOf<String>("김구라", "해골", "원숭이")
	// read only 숫자 List
	val nums = listOf<Int>(10,20,30)
	// names List 의 0 번 index 참조하는 방법1
	val a = names.get(0)
	// names List 의 0 번 index 참조하는 방법2
	val b = names[0]
	// names 의 item 개수 참조
	val c = names.size
	// names 의 마지막 index 참조
	val d = names.lastIndex
	// List 의 모든 item 을 순회하면서 참조
	names.forEach {
		println(it)
	}
	// 인덱스가 같이 필요하다면
	for(i in names.indices){
		val tmp = names.get(i)
		println("${i} 번째 인덱스: ${tmp}")
	}
	// 역순으로 순회
	for (i in names.lastIndex downTo 0){
		val tmp = names.get(i)
		println("${i} 번째 인덱스: ${tmp}")
	}
}