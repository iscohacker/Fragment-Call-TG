package uz.iskandarbek.fragment_tg_call.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.google.android.material.button.MaterialButton
import uz.iskandarbek.fragment_tg_call.R

class NumberFragment : Fragment() {
    lateinit var root: View
    lateinit var edtTExt: EditText
    lateinit var btnNext: MaterialButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        root = inflater.inflate(R.layout.fragment_number, container, false)

        edtTExt = root.findViewById(R.id.edt_number)
        btnNext = root.findViewById(R.id.btn_next)

        btnNext.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("keyNumber", edtTExt.text.toString())
            val actionFragment = ActionFragment()
            actionFragment.arguments = bundle

            parentFragmentManager.beginTransaction()
                .replace(R.id.main, actionFragment)
                .commit()
        }

        return root
    }
}