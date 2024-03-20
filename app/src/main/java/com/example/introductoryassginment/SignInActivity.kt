package com.example.introductoryassginment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        // 1. 선언부
        // xml에 만든것 중에 사용할 것들 싹다 변수 선언 해주기
        val btn_login = findViewById<Button>(R.id.loginBtn)
        val btn_signup = findViewById<Button>(R.id.signInBtn)
        val edittext_id = findViewById<EditText>(R.id.editTextId)
        val editext_pw = findViewById<EditText>(R.id.editTextPassword)

        // 2. 구현부
        // 로그인(normal), 아이디와 비밀번호
        btn_login.setOnClickListener {
            val inputId = edittext_id.text.toString()
            val inputPw = editext_pw.text.toString()
            normalToast(this, inputId, inputPw)
        }

        // 회원가입 액티비티로 이동
        btn_signup.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
    // 3. 구현부에서 쓰일 함수들을 선언해주는 곳
    // 아이디 or 비밀번호 중 하나라도 입력받지 못했을 때
    // Context : 어플리케이션과 액티비티에 대한 정보를 얻기 위해서 사용한다. 아래에도 this(해당 액티비티)의 정보를 확인고 있다.
    // trim() : 공백이 있다면 제거하기 위함.
    // || : OR 연산자임.
    private fun normalToast(context: Context, inputId: String, inputPw: String) {
        val trimmedId = inputId.trim()
        val trimmedPw = inputPw.trim()
        if (trimmedId.isEmpty() || trimmedPw.isEmpty()) {
            showToast(this, "아이디/비밀번호를 확인해주세요.")
        } else {
            showToast(context, "로그인 성공!")
            val edit_text_id = findViewById<EditText>(R.id.editTextId)
            val strData = edit_text_id.toString()
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("dataFromSignInActivity", strData)
            startActivity(intent)
        }
    }

    // 토스트 메세지
    private fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}


