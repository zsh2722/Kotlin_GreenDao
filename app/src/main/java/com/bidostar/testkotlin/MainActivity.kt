package com.bidostar.testkotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // 设置文本
        tv_test.text = "开始一个kotlin应用"
        // 设置点击事件,跳转到第二个页面
        tv_test.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        btn_test_start.setOnClickListener {
            val intent = Intent()
            intent.setAction("/module/TestStartActivity")
            startActivity(intent)
        }
        Toast.makeText(this, "MainAcivity:" + BuildConfig.API_URL, Toast.LENGTH_SHORT).show()
        tv_test.setText("MainAcivity:" + BuildConfig.API_URL)

    }
}
