package com.gerald.pages

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAccount: Button = findViewById(R.id.btnMyAccount)
        val btnTransactions : Button = findViewById(R.id.btnTransaction)
        val btnSendCash : Button = findViewById(R.id.btnSendMoney)
        val btnSettings : Button = findViewById(R.id.btnSettngs)

        btnAccount.setOnClickListener{
            val intent = Intent(this,MyAccountActivity::class.java)
            startActivity(intent)
        }
        btnTransactions.setOnClickListener{
            val intent = Intent(this,TransactionsActivity::class.java)
            startActivity(intent)
        }
        btnSendCash.setOnClickListener{
            val intent = Intent(this,SendMoneyActivity::class.java)
            startActivity(intent)
        }
        btnSettings.setOnClickListener{
            val intent = Intent(this,SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}