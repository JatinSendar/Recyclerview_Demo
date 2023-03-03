package com.example.recyclerviewdemo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      val songList = findViewById<RecyclerView>(R.id.songList)

        val songsObjects = mutableListOf<Model>()

        songsObjects.add(Model("Hello","Description Here"))
        songsObjects.add(Model("First","Description Here"))
        songsObjects.add(Model("Second","Description Here"))
        songsObjects.add(Model("Third","Description Here"))
        songsObjects.add(Model("Forth","Description Here"))
        songsObjects.add(Model("Fifth","Description Here"))
        songsObjects.add(Model("Sixth","Description Here"))
        songsObjects.add(Model("Seventh","Description Here"))
        songsObjects.add(Model("Eight",""))
        songsObjects.add(Model("Ninth",""))
        songsObjects.add(Model("World",""))
        songsObjects.add(Model("Hello",""))
        songsObjects.add(Model("First",""))
        songsObjects.add(Model("Second",""))
        songsObjects.add(Model("Third",""))
        songsObjects.add(Model("Forth",""))
        songsObjects.add(Model("Fifth",""))
        songsObjects.add(Model("Sixth",""))
        songsObjects.add(Model("Seventh",""))
        songsObjects.add(Model("Eight",""))
        songsObjects.add(Model("Ninth",""))
        songsObjects.add(Model("World",""))


        songList.adapter = Adapter(songsObjects)
       songList.layoutManager = LinearLayoutManager(this)


    }
}