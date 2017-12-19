package com.bidostar.module1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import kotlinx.android.synthetic.main.activity_module1.*

@Route(path = "/module1/Module1Activity")
class Module1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module1)
        btn_go_main.setOnClickListener {
            ARouter.getInstance().build("/main/SecondActivity").navigation()
            finish()
        }
        btn_go_module2.setOnClickListener {
            ARouter.getInstance().build("/module2/Module2Activity").navigation()
            finish()
        }

    }
}