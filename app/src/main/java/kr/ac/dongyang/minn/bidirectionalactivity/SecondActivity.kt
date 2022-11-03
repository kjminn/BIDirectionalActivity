package kr.ac.dongyang.minn.bidirectionalactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.dongyang.minn.bidirectionalactivity.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    val binding by lazy {
        ActivitySecondBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

         var name = intent.getStringExtra("name");
         binding.btnSecond1.setOnClickListener {
             val returnIntent = Intent()
             returnIntent.putExtra("returnValue", name + binding.editSecond1.text.toString())
             setResult(RESULT_OK, returnIntent)
             finish()
         }
    }
}