package com.example.introductoryassginment

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // strData로 데이터를 받고,
        val strData = intent.getStringExtra("dataFromSignInActivity")
        // deliverdid라는 변수에 strData를 담을 editText의 아이디명을 담아준다.
        val deliveredid= findViewById<EditText>(R.id.idEditText)
        deliveredid.setText(strData) // 잘 담았다.

        val btn_close = findViewById<Button>(R.id.backBtn)
        btn_close.setOnClickListener {
            finish()
        }
    }
}