package com.lowasis.gatewaylist

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.lowasis.gatewaylist.databinding.ActivityMainBinding
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val itemList = ArrayList<BoardItem>()

        itemList.add(BoardItem("DIRECT-LOWASIS-5E:86:A3", false, true))
        itemList.add(BoardItem("DIRECT-LOWASIS-5E:87:A3", true, false))
        itemList.add(BoardItem("DIRECT-LOWASIS-5E:88:A3", false, false))
        itemList.add(BoardItem("DIRECT-LOWASIS-5E:89:A3", false, true))
        itemList.add(BoardItem("DIRECT-LOWASIS-5E:8a:A3", false, true))

        binding.peer.adapter =  BoardAdapter(itemList)
        binding.peer.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}