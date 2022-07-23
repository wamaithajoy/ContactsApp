package com.example.mycontacts

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.mycontacts.databinding.ContactListItemBinding
import com.squareup.picasso.Picasso

class ContactRvAdapter(var contactlist:List<Contact>):
        RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding=ContactListItemBinding
            .inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentcontact=contactlist.get(position)
        holder.binding.tvName.text=currentcontact.name
        holder.binding.tvPhonenumber.text=currentcontact.phonenumber
        holder.binding.tvEmail.text=currentcontact.email
        holder.binding.tvAddress.text=currentcontact.address
        Picasso.get().load(currentcontact.image)
            .resize(400,400)
            .centerCrop()
            .placeholder(R.drawable.ic_baseline_person_24)
            .into(holder.binding.imgContact)
        val context=holder.itemView.context
        holder.binding.imgContact.setOnClickListener {
            Toast
                .makeText(context,"You have clicked the image",Toast.LENGTH_SHORT)
                .show()
        }
        holder.binding.cdContacts.setOnClickListener {
            val intent=Intent(context,ViewContacts::class.java)
            intent.putExtra("NAME",currentcontact.name)
            intent.putExtra("ADDRESS",currentcontact.address)
            intent.putExtra("PHONENUMBER",currentcontact.phonenumber)
            intent.putExtra("EMAIL",currentcontact.email)
            intent.putExtra("IMAGE",currentcontact.image)
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
   return contactlist.size
    }
        }

class ContactViewHolder(val binding:ContactListItemBinding): RecyclerView.ViewHolder(binding.root)



