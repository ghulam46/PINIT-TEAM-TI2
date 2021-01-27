package com.Kelompok_pinit.pinit1


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.Kelompok_pinit.pinit1.Fragments.ChatFragment
import com.Kelompok_pinit.pinit1.Fragments.HomeFragment
import com.Kelompok_pinit.pinit1.Fragments.ProfilFragment
import com.Kelompok_pinit.pinit1.Fragments.SearchFragment

import com.Kelompok_pinit.pinit1.databinding.ActivityHomeBinding

import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.fragment_profil.*


class home  : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val homeFragment = HomeFragment()
        val chatFragment = ChatFragment()
        val searchFragment = SearchFragment()
        val profilFragment = ProfilFragment ()



        makeCurrentFragment(homeFragment)

        navigasi.setOnNavigationItemReselectedListener {

            when (it.itemId){
                R.id.home -> makeCurrentFragment(homeFragment)
                R.id.search -> makeCurrentFragment(searchFragment)
                R.id.Chat -> makeCurrentFragment(chatFragment)
                R.id.profil-> makeCurrentFragment(profilFragment)

            }
            true
        }

    }
private fun makeCurrentFragment(fragment:Fragment) =
    supportFragmentManager.beginTransaction().apply {
        replace(R.id.wrapper,fragment)
        commit()
    }

}