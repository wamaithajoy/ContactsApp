package com.example.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }
    fun displayContacts(){
    var contact=Contact("Penina Wanjiru","shi@gmail.com","0705966266","1234 Nairobi","https://media.istockphoto.com/photos/arent-you-so-cute-picture-id522185081?k=20&m=522185081&s=612x612&w=0&h=xz7BvVfGhuoC2Pz6XG8bP3vrmoSnq7JP4lSY4ajuhc4=")
        var contact2=Contact("Leticia Wamaitha","leti@gmail.com","0705965266","1234 Karen","https://media.istockphoto.com/photos/happy-child-picture-id146746272?k=20&m=146746272&s=612x612&w=0&h=yfD28SqDZqNDNJrbkeCd0X9BLRrF9kmTtMS0X7C_cf8=")
        var contact3=Contact("Stephen Gitu","dush@gmail.com","0710966266","1234 Kitale","https://media.istockphoto.com/photos/happy-little-boy-of-african-ethnicity-in-tshirt-standing-in-front-of-picture-id1252919000?k=20&m=1252919000&s=612x612&w=0&h=krTpaIdX6y77VRfj9zFJc5ryYyhof9AOfb0TXWa01Bo=")
        var contact4=Contact("Mildred Haistings","heta@gmail.com","0714966266","1234 Nairobi","https://media.istockphoto.com/photos/cute-little-girl-playing-on-blanket-and-looking-up-picture-id1169949998?k=20&m=1169949998&s=612x612&w=0&h=9vGxqA3dqMnQ-rjG6OwLNuIn9iEoDJBhyJ3hsWcaNyQ=")
        var contact5=Contact("Valentine Nyakio","val@gmail.com","0708966266","1234 Nairobi","https://media.istockphoto.com/photos/beautiful-girl-with-curly-hairstyle-picture-id1289362630?k=20&m=1289362630&s=612x612&w=0&h=plMHLKBcitbF02aKPLWj3AytS3lsX-Am_BDl7LUfsjM=")
        var contact6=Contact("Joy Wamaitha","joy@gmail.com","0778966266","1234 Kitengela","https://media.istockphoto.com/photos/beautiful-smiling-girl-with-curly-hairstyle-picture-id1189894212?k=20&m=1189894212&s=612x612&w=0&h=vwmqUNjEBfHovV1tfwPAqyXwC_plGdyYQ0Z5zveszu4=")
        var contact7=Contact("Little Joe","little@gmail.com","0766966266","1234 Ngong","https://media.istockphoto.com/photos/boy-in-sunglasses-and-hat-eating-popsicle-outdoors-picture-id175622348?k=20&m=175622348&s=612x612&w=0&h=PvdwImhxRCqudhZjojiPuizLB5EOKa1o5cR2Itbnosc=")
        var contactlist= listOf(contact,contact2,contact3,contact4,contact5,contact6,contact7)

        var contactAdapter=ContactRvAdapter(contactlist)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter=contactAdapter

    }
}