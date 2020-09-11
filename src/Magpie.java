/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>

 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie {
	String lastTopic = "";

	


	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Lets get it";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		statement = statement.toLowerCase().strip();
		String response = "";
		if (statement.indexOf("no") >= 0)
		{

		}
		if (statement.indexOf("oh wow") >= 0)
	
		{
			response = "Why so negative?";
		}
		else if (statement.length() == 0) {
			response = "Say something please";
		}
		
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
				if (lastTopic.equals("pets"))
		{
			
				response = "Tell me more about your family.";
		}
		
		else if (statement.indexOf("cat") >= 0
				|| statement.indexOf("dog") >= 0
				|| statement.indexOf("fish") >= 0
				|| statement.indexOf("mouse") >= 0)
		{
			if (lastTopic.equals("pets")){
				response = "I never get tired of talking about pets.";
			} else
				response = "Tell me more about your pets.";
			lastTopic = "pets";
		}
		else if (statement.indexOf("Mr.Finkelstein is telling us about robotics.") >= 0
				|| statement.indexOf("mr.finkelstein is telling us about robotics") >= 0)
			{
			response = "He sounds like a good teacher.";
		}
		
		else
		{
			response = getRandomResponse();
		}
		return response;
	}
	
	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Nobody";
		}
		else if (whichResponse == 1)
		{
			response = "Im better than Siri!";
		}
		else if (whichResponse == 2)
		{
			response = "No";
		}
		else if (whichResponse == 3)
		{
			response = "okay dude";
		}

		else if (whichResponse == 4)
		{
			response = "What the heck?";
		}

		else if (whichResponse == 5)
		{
			response = "Okay I see you";
		}
		
		return response;
	}
}
