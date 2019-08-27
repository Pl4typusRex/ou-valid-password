
/**
 * Answer to TMA01 Question 1.
 *
 * @author (Pl4typusRex)
 * @version (10/11/2018)
 */

public class Validate
{
   // instance variables
   private String password;

   /**
    * Constructor for objects of class RoomSafe
    */
   public Validate()
   {
      password = "Adminadmin1";
   }

   /**
    * Getter method to return the current password
    */
   public String getPassword()
   {
      return password;
   }

   /**
    * Method setting password rule
    * Returns true if password has length of at least 8 characters
    * Otherwise returns false
    */
   public boolean isValidLength(String pw)
   {
      int len = pw.length();
      if (len >= 8)
      {
         return true;
      }
      else
      {
         return false;
      }
   }

   /**
    * Given method
    * Return true if at least one of the characters in the argument
    * pw is a digit
    * otherwise return false
    */
   public boolean hasDigit(String pw)
   {  // Assume initially that the string contains no digits.
      boolean result = false;
      // Examine each character of pw in turn.
      for (int i = 0; i < pw.length(); i++)
      {
         // If the character at position i is a digit,
         // set result to true
         if (Character.isDigit(pw.charAt(i)))
         {
            result = true;
         }
      }
      return result;
   }

   /**
    * Method setting password rule
    * Returns true if password includes at least one upper case letter
    * Otherwise returns false
    */
   public boolean hasUpperCase(String pw)
   {  // Assume initially that the string contains no upper case characters.
      boolean result = false;
      // Examine each character of pw in turn.
      for (int i = 0; i < pw.length(); i++)
      {
         // If the character at position i is upper case,
         // set result to true
         if (Character.isUpperCase(pw.charAt(i)))
         {
            result = true;
         }
      }
      return result;
   }

   /**
    * Method to check the password meets all three rules
    * Returns true if password is valid
    * Otherwise returns false
    */
   public boolean isValidPassword(String pw)
   {  // the three conditions
      boolean ruleOne = isValidLength(pw);
      boolean ruleTwo = hasDigit(pw);
      boolean ruleThree = hasUpperCase(pw);
      // checking if all three conditions are true
      if (ruleOne && ruleTwo && ruleThree)
      {
         return true;
      }
      else
      {
         return false;
      }
   }

   /**
    * Setter method to set a new password
    * Only sets password if valid
    */
   public void setPassword(String pw)
   {  // checking if new password is valid
      boolean isValid = isValidPassword(pw);

      if (isValid)
      {
         System.out.println ("The password " + pw + " is valid.");
         password = pw;
      }
      else
      {
         System.out.println ("The password " + pw + " is not valid.");
      }
   }

   /**
    * Method to check if the password has been changed from the default
    * Returns false if not changed
    * Otherwise returns true
    */
   public boolean hasChanged()
   {
      String pw = getPassword();
      if (pw.equals("Adminadmin1"))
      {
         return false;
      }
      else
      {
         return true;
      }
   }
}
