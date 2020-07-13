package com.example.l6_homework

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var txt : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt = findViewById(R.id.txtApp)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.itemGoods -> {
                val intent = Intent(this, GoodsActivity::class.java)
                startActivity(intent)
            }
            R.id.itemServices -> {
                val int_serv= Intent(this, ServiceActivity::class.java)
                startActivity(int_serv)
            }
            R.id.itemApplication -> txt?.text = getString(R.string.about_app)

            }
        return super.onOptionsItemSelected(item)
    }

}