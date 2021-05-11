package helloworld

class QuoteController {

    def index() {
        redirect(action: "home")
    }

    def home() {
        render ("<h1>Real Programmers do not each quiche!</h1>")
    }

    def random() {
        def staticAuthor = "Anonymous"
        def staticContent = "Real Programmers do not each quiche!"
        [ author: staticAuthor, content: staticContent ]
    }
}
