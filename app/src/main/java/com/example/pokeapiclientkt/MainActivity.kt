package com.example.pokeapiclientkt


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pokeapiclientkt.fragments.PokiListFrg
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.firebase.FirebaseException

class MainActivity : AppCompatActivity() {
    private val frgMng = supportFragmentManager;
    private val pokiListFrg = PokiListFrg(frgMng)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)
        frgMng.beginTransaction().add(R.id.contentLayout, pokiListFrg).commit()
    }
}