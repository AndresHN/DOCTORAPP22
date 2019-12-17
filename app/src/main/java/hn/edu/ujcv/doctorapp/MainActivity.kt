package hn.edu.ujcv.doctorapp

import android.R
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.menub.*


class MainActivity : AppCompatActivity() {

    private lateinit var spinner: Spinner
    private lateinit var editText: EditText
    private lateinit var textView: AutoCompleteTextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(spinner);

        spinner= (spinner)findviewbyid(r)
       // spinner= (Spinner)findViewById(R.id.spinner1)


    }






}
