package com.kkk.jikbangcopy_20211127

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kkk.jikbangcopy_20211127.adapters.RoomAdapter
import com.kkk.jikbangcopy_20211127.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()
    lateinit var mRoomAdapter : RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()

    }

    fun setupEvents() {
//        이벤트 처리관련 코드를 모아두는 함수
        roomListView.setOnItemClickListener { adapterView, view, position, l ->

            val clickedRoom = mRoomList[position]

            val myIntent = Intent( this,ViewRoomDetailActivity::class.java )
            myIntent.putExtra("room",clickedRoom)

            startActivity(myIntent)

        }


   }

    fun setValues() {
//        화면에 뭔가 보여주기 위한 코드를 모아두는 함수

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

    }

}