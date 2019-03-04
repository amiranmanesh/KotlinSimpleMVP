package ir.iron.kotlinsimplemvp.Views.MainView

interface SayHelloContract {

    /** Represents the View in MVP.  */
    interface View {
        fun showMessage(message: String)

        fun showError(error: String)
    }

    /** Represents the Presenter in MVP.  */
    interface Presenter {
        fun loadMessage()

        fun saveName(firstName: String, lastName: String)
    }

}