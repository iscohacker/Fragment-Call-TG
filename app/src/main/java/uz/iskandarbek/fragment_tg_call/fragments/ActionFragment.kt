package uz.iskandarbek.fragment_tg_call.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.button.MaterialButton
import uz.iskandarbek.fragment_tg_call.R


class ActionFragment : Fragment() {
    lateinit var root: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        root = inflater.inflate(R.layout.fragment_action, container, false)

        val number = arguments?.getString("keyNumber")
        val btnCall = root.findViewById<MaterialButton>(R.id.btn_call)
        val textNumber = root.findViewById<TextView>(R.id.numner_phone)
        val btnTelegram = root.findViewById<MaterialButton>(R.id.btn_telegram)

        textNumber.text = number

        btnCall.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:$number")
            startActivity(intent)
        }

        btnTelegram.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://t.me/$number")
            startActivity(intent)
        }

        return root
    }
}
