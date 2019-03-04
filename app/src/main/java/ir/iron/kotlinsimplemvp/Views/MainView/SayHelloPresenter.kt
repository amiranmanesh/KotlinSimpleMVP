package ir.iron.kotlinsimplemvp.Views.MainView

import ir.iron.kotlinsimplemvp.Model.Person

class SayHelloPresenter (var mView: SayHelloContract.View): SayHelloContract.Presenter {
    lateinit var mPerson: Person
    init {
        mPerson = Person()
    }
    override fun saveName(firstName: String, lastName: String) {
        mPerson.firstName = firstName
        mPerson.lastName = lastName
    }

    override fun loadMessage() {
        if (mPerson.firstName == null && mPerson.lastName == null) {
            mView.showError("No person name found.")
            return
        }

        val message = "Hi " + mPerson.name + "!"
        mView.showMessage(message)
    }


}