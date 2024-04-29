class EncryptionSolution extends ConsoleProgram {

  /**
  * Encrypts a message based on user input
  * @author: E. Fabroa
  */
  
  public void run() {
    String userMessage;
    int intShiftamt;

    System.out.println("**** Encryption Program *****");

    // get the message and shift
    userMessage = readLine("Enter the message to encrypt: ");
    intShiftamt = readInt("Enter the shift amount: ");

    // display results
    System.out.print("Here is your encrypted message: ");
    System.out.println(encryptMessage(userMessage, intShiftamt));

  }

  /**
   * Encrypts a message based on a given shift amount
   * @param strMessage the message to encrypt
   * @param intShift the shift amount for encryption
   * @throws Shift is less than 1.
   * @return the encyrpted message
   */
  public String encryptMessage(String strMessage, int intShift){

    // This is the bonus exception
    if(intShift < 1){
      throw new IllegalArgumentException("Illegal shift value. Shift must be greater than 1.");
    }

    String encryptMessage = "";
    for (int i = 0; i < strMessage.length(); i++){
      encryptMessage = encryptMessage + (char)(' ' + ((strMessage.charAt(i) - ' ' + intShift) % 95));
    }
  
    return encryptMessage;

  }
}