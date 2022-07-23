package com.example.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.widget.Toast
import com.example.mycontacts.databinding.ActivityViewContactsBinding
import com.squareup.picasso.Picasso

class ViewContacts : AppCompatActivity() {
    lateinit var binding: ActivityViewContactsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityViewContactsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getExtras()
    }
    fun getExtras(){
        var name= intent.extras?.getString("NAME"," ")
        var address=intent.extras?.getString("ADDRESS"," ")
        var phone=intent.extras?.getString("PHONENUMBER"," ")
        var email=intent.extras?.getString("EMAIL"," ")
        var image=intent.extras?.getString("IMAGE"," ")
        Toast.makeText(this,name,Toast.LENGTH_LONG).show()
        Toast.makeText(this,address,Toast.LENGTH_LONG).show()
        Toast.makeText(this,phone,Toast.LENGTH_LONG).show()
        Toast.makeText(this,email,Toast.LENGTH_LONG).show()

        binding.tvContactName.text=name
        binding.tvContactPhone.text=phone
        binding.tvEmailAddress.text=email
        binding.tvLocation.text=address

        Picasso.get().load(intent.getStringExtra("IMAGE")).into(binding.imgProfile)

    }
}