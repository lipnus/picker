package com.lipnus.android.numpicker.ui.number

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import com.lipnus.android.numpicker.R
import com.lipnus.android.numpicker.base.BaseActivity
import com.lipnus.android.numpicker.ui.MainContract
import kotlinx.android.synthetic.main.activity_number.*

class NumberActivity : BaseActivity(), NumberContract.View {


    override lateinit var presenter: NumberContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number)

        presenter = NumberPresenter(this)
        presenter.start()
    }

    override fun initLayout() {
        number_btn.setOnClickListener {
            insertContact("010123456778")
        }
    }

    override fun insertContact(number: String) {

        val intent = Intent(ContactsContract.Intents.Insert.ACTION).apply {

            type = ContactsContract.RawContacts.CONTENT_TYPE
            putExtra(ContactsContract.Intents.Insert.PHONE, number)
        }


        startActivity(intent)
    }
}
