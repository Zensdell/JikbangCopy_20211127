package com.kkk.jikbangcopy_20211127

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kkk.jikbangcopy_20211127.adapters.RoomAdapter
import com.kkk.jikbangcopy_20211127.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    방 목록을 담기위한 그릇
    val mRoomList = ArrayList<RoomData>()

//    변수는 멤버변수로 -> 대입은 oncreate { } (나중에) : lateinit var
    lateinit var mRoomAdapter : RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//          실제로 방 데이터 추가
        mRoomList.add( RoomData(8000,"서울시 동대문구", 10, "1번째 방입니다") )
        mRoomList.add( RoomData(18000,"서울시 동대문구", 9, "2번째 방입니다") )
        mRoomList.add( RoomData(25000,"서울시 동대문구", 8, "3번째 방입니다") )
        mRoomList.add( RoomData(98000,"서울시 서대문구", 1, "4번째 방입니다") )
        mRoomList.add( RoomData(8700,"서울시 서대문구", 2, "5번째 방입니다") )
        mRoomList.add( RoomData(6000,"서울시 종로구", 5, "6번째 방입니다") )
        mRoomList.add( RoomData(2300,"서울시 용산구", 4, "7번째 방입니다") )
        mRoomList.add( RoomData(1100,"서울시 종로구", 5, "8번째 방입니다") )
        mRoomList.add( RoomData(26700,"서울시 종로구", -1, "9번째 방입니다") )
        mRoomList.add( RoomData(34500,"서울시 종로구", -2, "10번째 방입니다") )
        mRoomList.add( RoomData(9800,"서울시 용산구", 2, "11번째 방입니다") )
        mRoomList.add( RoomData(1110,"서울시 서대문구", 3, "12번째 방입니다") )
        mRoomList.add( RoomData(4720,"서울시 동대문구", 0, "13번째 방입니다") )
        mRoomList.add( RoomData(2310,"서울시 서대문구", -1, "14번째 방입니다") )

        mRoomAdapter = RoomAdapter(this,R.layout.room_list_item, mRoomList)
        roomListView.adapter = mRoomAdapter

        roomListView.setOnItemClickListener { adapterView, view, position, l ->

            val clickedRoom = mRoomList[position]

            val myIntent = Intent( this,ViewRoomDetailActivity::class.java )
            myIntent.putExtra("room",clickedRoom)

            startActivity(myIntent)


        }


    }
}