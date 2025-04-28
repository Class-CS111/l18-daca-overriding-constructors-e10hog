/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/
class Main 
{
  public static void main(String[] args) {
    DACArecipient person1 = new DACArecipient();
    DACArecipient person2 = new DACArecipient("Luong", "Ethan", "12-3-456", "United States of America", 2454072, 2461012, 2464664, 'M');
    System.out.println(person1.toString());
    System.out.println(person2.toString());
  }
}