//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MadLib
{
	private ArrayList<String> verbs = new ArrayList<String>();
	private ArrayList<String> nouns = new ArrayList<String>();
	private ArrayList<String> adjectives = new ArrayList<String>();
	private String story = "";

	public MadLib()
	{
		verbs.add("punched");
		nouns.add("Wal-Mart");
		adjectives.add("Massive");
		story = "I punched Wal-Mart in a massive way.";
	}

	public MadLib(String fileName)
	{
		//load stuff
		loadNouns();
		try
		{
			//Read the different parts of the story and concatenate the resulting
			//story using the symbols to tell you the parts of speech
			Scanner chopper = new Scanner(story);

			//Continue to loop while there are more words to read
			while(chopper.hasNext())
			{
				nouns.add(new String(chopper.next()));
				if(story.equals("#"))
				
				return (story += getRandomNoun()+ " ");
				}
				
				else if(story.equals("@"))
				{
				return(story += verbs.get(getRandomVerb()) + " ");
				}
				else if(story.equals("&"))
				{
				return(story += getRandomAdjective() + " ");
				}
				else 
				return("" +story )
			}
		
		
				chopper.close();
		}
		catch(Exception e)
		{
			System.out.println("Houston we have a problem!");
		}

	}

	public void loadNouns()
	{
		try
		{
			Scanner reader = new Scanner(new File("nouns.dat"));
			
			while(reader.hasNext())
			{
				nouns.add(reader.next());
			}
			reader.close();
		}
		catch(Exception e)
		{
			System.out.println("nouns.dat does not exist");
		}

	}

	public void loadVerbs()
	{
		try
		{
			Scanner reader1 = new Scanner(new File("nouns.dat"));
			
			while(reader1.hasNext())
			{
				verbs.add(reader1.next());
			}
			reader1.close();
		}
		catch(Exception e)
		{
			System.out.println("verbs.dat does not exist");
		}
	}

	public void loadAdjectives()
	{
		try
		{
			Scanner reader2 = new Scanner(new File("nouns.dat"));
			
			while(reader2.hasNext())
			{
				adjectives.add(reader2.next());
			}
			reader2.close();
		}
		catch(Exception e)
		{
			System.out.println("adjectives.dat does not exist");
		}
	}

	public String getRandomVerb()
	{
		Random randy = new Random();
		int s = randy.nextInt(15) + 1;
		
		return "" + verbs.get(randy.nextInt(verbs.size));
	}

	public String getRandomNoun()
	{
		int spot = (int)(Math.random()*nouns.size());

		return ""+ nouns.get(spot);
	}

	public String getRandomAdjective()
	{
		Random randy = new Random();
		int y = randy.nextInt(17) + 1;
		return ""+y;
	}

	public String toString()
	{
		return "" + story;
	}
}