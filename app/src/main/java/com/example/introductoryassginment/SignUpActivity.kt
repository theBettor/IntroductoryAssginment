package com.example.introductoryassginment

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {

    private lateinit var edittext_name: EditText
    private lateinit var edittext_id: EditText
    private lateinit var edittext_pw: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        // 변수명 짜는게 제일 헷갈리는 것 같다. 보다시피 SingInActivity에 선언된 변수명들과 이름이 같은 것들이 있기 때문이다.

        edittext_name = findViewById<EditText>(R.id.nameEditText)
        edittext_id = findViewById<EditText>(R.id.idEditText)
        edittext_pw = findViewById<EditText>(R.id.pwEditText)
        val btn_signup = findViewById<Button>(R.id.signUpBtn)

        // 버튼을 눌렀을때의 이벤트 처리
        btn_signup.setOnClickListener {
            if (allFieldsEntered()) {
                navigateToSignUp()
            } else {
                Toast.makeText(this, "입력되지 않은 정보가 있습니다", Toast.LENGTH_SHORT).show()
            }

        }
    }


    //모두 입력받아야 SignInActivity 로 이동함
    private fun allFieldsEntered(): Boolean {
        val name = edittext_name.text.toString()
        val id = edittext_id.text.toString()
        val pw = edittext_pw.text.toString()
        return name.isNotEmpty() && id.isNotEmpty() && pw.isNotEmpty()
    }

    private fun navigateToSignUp() {
        val intent = Intent(this, SignInActivity::class.java)
        intent.putExtra("id", edittext_id.text.toString())
        intent.putExtra("pw", edittext_pw.text.toString())
        setResult(AppCompatActivity.RESULT_OK, intent)
        finish()
    }
}
