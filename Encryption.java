class Encryption extends ConsoleProgram {

  /**
  * A program the encrypts a message inputted by the user
  * @author: 
  */
  
  public void run() {
    System.out.println(encryptMessage("ogabooga", -24) );
  }

  /*
   * a basic caesar cipher done poorly in java.
   * 
   * @param message. The massage you want encrypted.
   * @param shift. The number of spaces the characters is shifted by.
   * 
   * @return encrypt. The finnal encrypted message.
   */
  public String encryptMessage(String message, int shift){
    char letter;
    String encrypt = "";
    for (int i = 0; i < message.length(); i++){
      letter = message.charAt(i);
      letter += shift;
      encrypt += letter;
    }
    return encrypt;
  }
}
