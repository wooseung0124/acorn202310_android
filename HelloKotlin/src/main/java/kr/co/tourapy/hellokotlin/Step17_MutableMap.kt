package kr.co.tourapy.hellokotlin

fun main(){
	// 수정 가능한 Map
	val mem = mutableMapOf<String, Any>()
	// 필요한 만큼 데이터 저장 가능
	mem.put("num", 1)
	mem.put("name", "김구라")
	mem.put("isMan", true)
	// 동일한 key값으로 기존의 value를 덮어쓰기
	mem.put("name", "이정호")

	// 혹은

	mem["num2"]=1
	mem["name2"]="김구라"
	mem["isMan2"]=true
	// 동일한 key값으로 기존의 value를 덮어쓰기
	mem["name2"]="이정호"

	val num = mem["num"] as Int
	val name = mem["name"] as String
	val isMan = mem["isMan"] as Boolean
}