package ir.iron.kotlinsimplemvp.Views.MainView

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ir.iron.kotlinsimplemvp.Model.Person
import ir.iron.kotlinsimplemvp.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), SayHelloContract.View {
    lateinit var mPresenter: SayHelloPresenter

    override fun showMessage(message: String) {
        messages.text = message
    }

    override fun showError(error: String) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPresenter = SayHelloPresenter(this)

        update.setOnClickListener {
            mPresenter.saveName(
                firstName.text.toString(),
                lastName.text.toString()
            )
            firstName.text.clear()
            lastName.text.clear()
        }
        showMessage.setOnClickListener {
            mPresenter.loadMessage()
        }

    }
}
