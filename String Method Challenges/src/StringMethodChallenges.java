import java.util.Scanner;


public class StringMethodChallenges
	{

		public static void main(String[] args)
			{

				
					makeWordLowerCase();
					seperateChallenges();
					printWordVertically();
					seperateChallenges();
					countVowels();
					seperateChallenges();
					palindrome();		
					seperateChallenges();
					changeToPigLatin();	
					bonusChallenge();
			}
		
		public static void seperateChallenges()
		{
			Scanner userFakeInput = new Scanner(System.in);
			String pause;
			pause = userFakeInput.nextLine();
		}
		
 		public static void makeWordLowerCase()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Type a word!");
			String word = userInput.nextLine();
			System.out.print(word.substring(0,1));
			word = word.substring(1,word.length()).toLowerCase();
			System.out.print(word);
		}
		
		public static void printWordVertically()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Type a word!");
				String word = userInput.nextLine();
				
				for (int i = 0; i < word.length(); i ++)
					{
						System.out.println(word.substring(i,i+1));
					}
			}
		
		public static void countVowels()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Type a sentence!");
				String sentance = userInput.nextLine();
				int total = 0;
				for (int i = 0; i < sentance.length(); i++)
					{
						String letter = sentance.substring(i,i+1);
						
						switch(letter)
						{
							case "a":
							case "e":
							case "i":
							case "o":
							case "u":
							case "A":
							case "E":
							case "I":
							case "O":
							case "U":
									{
										total++;		
									}							
							
						}
						
					}
				if(total>1) 
					{
						System.out.println("Your total amount of vowels are " + total + "!");
					}
				
				else
					{
						System.out.println("Your total amount of vowels is" + total + "!");
					}
				
			}
		
		public static void palindrome()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Type a few words!");
				String sentance = userInput.nextLine();
				sentance = sentance.replace(" ", "");
				StringBuffer buffer = new StringBuffer(sentance);
				StringBuffer ReverseBuffer = buffer.reverse();
				String reverseSentance = ReverseBuffer.toString();
				if(sentance.equals(reverseSentance))
					{
						System.out.println("The string " + buffer.reverse() + " is a palindrome!");
					}
					
				else
					{
						System.out.println("The string " + buffer + " is not a palindrome!");
					}
	
			}
		
		public static void changeToPigLatin()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Type a few words!");
				String sentance = userInput.nextLine();
				String[] words = sentance.split(" ");
				
				for(int i = 0;  i < words.length; i++)
					{
						switch(words[i].substring(0,1))
							{
								case "a":
								case "e":
								case "i":
								case "o":
								case "u":
								case "A":
								case "E":
								case "I":
								case "O":
								case "U":
										{
											System.out.println(words[i].substring(1) + "-" + "way");
											break;
										}
								default:
										{
											System.out.println(words[i].substring(1) + "-" + words[i].substring(0,1) + "ay");
											break;
										}		
						}	
					}
			}
		
		public static void bonusChallenge()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Type 2 words separated by a space.");
				String input = userInput.nextLine();
				input = input.toLowerCase();
				String[] inputWords = input.split(" ");
				System.out.println(inputWords[0] + inputWords[1].substring(0,1).toUpperCase() + inputWords[1].substring(1));
				
				
				
			}
	}
