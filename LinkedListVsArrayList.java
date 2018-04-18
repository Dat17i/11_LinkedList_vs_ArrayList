import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListVsArrayList
{	
	
	public static void main(String[] args) throws FileNotFoundException
	{
		List<String> txt = new LinkedList<String>();
		Scanner scan = new Scanner(new File("mobydick.txt"));
		addToList(scan, txt);

		System.out.println("List is full!");
		System.out.println("Words in List" + txt.size());
		
		while(!txt.isEmpty())
		{
			txt.remove(0);
		}
		System.out.println("List empty! " + txt);
	
	}

	private static void addToList(Scanner scan, List<String> txt)
	{
		while(scan.hasNext())
		{
			txt.add(scan.next());
		}
		
	}
	
}
