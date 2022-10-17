package kr.ac.kumoh.s20180877.w07intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20180877.w07intent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.btnHomepage.setOnClickListener {
            val uri = Uri.parse("http://naver.com")
            val intent = Intent(Intent.ACTION_VIEW, uri)

            startActivity(intent)
        }
    }
}