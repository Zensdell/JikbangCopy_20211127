package com.kkk.jikbangcopy_20211127.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.kkk.jikbangcopy_20211127.datas.RoomData

class RoomAdapter(
    val mContext : Context,
    val resId : Int,
    val mList: ArrayList<RoomData>
) : ArrayAdapter<RoomData> (mContext, resId, mList) {
}