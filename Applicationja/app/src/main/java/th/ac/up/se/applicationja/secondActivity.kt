package th.ac.up.se.applicationja

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_second.*

class secondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
      /*
        var bundle = intent.extras

        var name = bundle.getString("name")
        secondTextView.text = name
        secondBack.setOnClickListener {

            finish()


        }
    }
}



