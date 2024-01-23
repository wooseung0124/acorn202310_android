package kr.co.tourapy.hellokotlin

fun main(){
	// MutableList<String> type
	val foods = mutableListOf<String>("라면", "김밥")
	// mutable 이기에 아이템 추가 가능
	foods.add("쫄면")
	foods.add("떡볶이")
	foods.add("오뎅")
	// 수정도 가능
	foods.add(0, "신라면")
	foods[1]="참치김밥"
	// 아이템 삭제 가능
	foods.removeAt(2) // 2번 인덱스 삭제
	foods.removeLast() // 마지막 인덱스 삭제
}