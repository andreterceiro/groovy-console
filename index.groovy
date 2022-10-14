def readln = javax.swing.JOptionPane.&showInputDialog
def userOption = ""
while(userOption  != "p" && userOption != "r" && userOption != "s") {
    userOption = readln 'Please insert "p" for "paper", "r" for "rock", "s" for "scissors"'
}

def computerOption = getRandomComputerOption()

evaluate(userOption, computerOption) 

def getRandomComputerOption() {
    Random random = new Random()
    def randomNumber = random.nextInt(3)
    return (["paper", "rock", "scissors"][randomNumber])
}

def evaluate(userOption, computerOption) {
    if ((userOption == "p" && computerOption == "rock") || (userOption == "r" && computerOption == "scissors") || (userOption == "s" && computerOption == "paper")) {
        sendResponse("user", computerOption)
    } else if (userOption == computerOption[0]) {
        sendResponse("draw", computerOption)
    } else {
        sendResponse("computer", computerOption)
    }
}

def sendResponse(winner, computerOption) {
    print "Winner: $winner. Computer choosed $computerOption"
}