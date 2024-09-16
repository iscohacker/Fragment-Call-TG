package uz.iskandarbek.fragment_tg_call

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.iskandarbek.fragment_tg_call.fragments.NumberFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.main, NumberFragment()).commit()
    }
}