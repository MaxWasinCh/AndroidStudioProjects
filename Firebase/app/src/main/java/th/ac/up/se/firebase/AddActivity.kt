package th.ac.up.se.firebase

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase

import kotlinx.android.synthetic.main.activity_add.*

class AddActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
        goBack()

        saveAction()

    }


    fun saveAction() {
        saveBTN.setOnClickListener {


            var data = Data()
            var firebase = FirebaseDatabase.getInstance().reference
            var key = firebase.push().key.toString()

            data.apply {

                id = key
                title = editTitle.text.toString()
                message = editMessage.text.toString()

            }
            firebase.child("data")
                    .child(key)
                    .setValue(data)
                    .addOnSuccessListener {
                        finish()
            }
                    .addOnFailureListener{
                        Toast.makeText(this,"ERROR",Toast.LENGTH_SHORT).show()
                    }
        }
    }

    fun goBack() {
        backBTN.setOnClickListener {
            finish()
        }
    }
}




