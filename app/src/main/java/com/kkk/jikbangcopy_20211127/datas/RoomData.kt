package com.kkk.jikbangcopy_20211127.datas

import java.io.Serializable
import java.text.NumberFormat
import java.util.*

class RoomData(

    val price:Int,
    val address: String,
    val floor: Int,
    val description: String


) :Serializable {

//    방 데이터의 기능 : 가격을 가공해서 String으로 주는 기능. => 리스트뷰 / 상세화면 두군데에서 사용.


    fun getFormattedPrice() : String {

        if(this.price < 10000 ) {

            return NumberFormat.getNumberInstance( Locale.KOREA).format(this.price)


            return "1억미만"
        }
        else {

//            ex. 175300  => 17억 5,300

            val uk = this.price / 10000 // Int / Int => 결과도 무조건 Int. (소수점 버림)  => 억단위 호출
            val rest = this.price % 10000 // 나머지 구하기. => 천만원 단위까지 추출
            val str = NumberFormat.getNumberInstance(Locale.KOREA).format(rest)
            return  "${uk}억 ${str}"
        }

    }

//    추가 기능 : 층수도 가공해서 String으로 주자.

    fun getFormattedFloor() : String {

        if(this.floor > 0) {
            return "${this.floor}층"
        }

        else if (this.floor==0) {
            return "반지하"
        } else {
            return "지하 ${- this.floor} 층"
        }



    }

}