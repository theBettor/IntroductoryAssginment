package com.example.introductoryassginment

<<<<<<< HEAD
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.renderscript.ScriptGroup.Input
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
=======
import android.os.Bundle
>>>>>>> d28a3a7cfd2e192915e9532d5af12f25f279d6f4
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
<<<<<<< HEAD
        setContentView(R.layout.activity_sign_up)

        // 변수명 짜는게 제일 헷갈리는 것 같다. 보다시피 SingInActivity에 선언된 변수명들과 이름이 같은 것들이 있기 때문이다.

        val edittext_name = findViewById<EditText>(R.id.nameEditText)
        val edittext_id = findViewById<EditText>(R.id.idEditText)
        val edittext_pw = findViewById<EditText>(R.id.pwEditText)
        val btn_signup = findViewById<Button>(R.id.signUpBtn)

        // 버튼을 눌렀을때의 이벤트 처리
        btn_signup.setOnClickListener {
            val inputName = edittext_name.text.toString()
            val inputId = edittext_id.text.toString()
            val inputPw = edittext_pw.text.toString()
            normalToast(this, inputName, inputId, inputPw)
        }
    }

    private fun normalToast(context: Context, inputName: String, inputId: String, inputPw: String) {
        val trimmedName = inputName.trim()
        val trimmedId = inputId.trim()
        val trimmedPw = inputPw.trim()
        if (trimmedName.isEmpty() || trimmedId.isEmpty() || trimmedPw.isEmpty()) {
            showToast(this, "입력되지 않은 정보가 있습니다")
        } else {
            showToast(context, "회원가입 성공!")
            finish() // signin activity로 들어왔으니 finish하면 제자리로 돌아갈 수 밖에!
        }

    }

    private fun showToast(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
=======
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
>>>>>>> d28a3a7cfd2e192915e9532d5af12f25f279d6f4
}