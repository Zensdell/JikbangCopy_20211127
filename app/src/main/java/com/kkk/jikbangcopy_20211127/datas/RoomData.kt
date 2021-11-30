package com.kkk.jikbangcopy_20211127.datas

class RoomData(

    val price:Int,
    val address: String,
    val floor: Int,
    val description: String


) {

//    방 데이터의 기능 : 가격을 가공해서 String으로 주는 기능. => 리스트뷰 / 상세화면 두군데에서 사용.

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