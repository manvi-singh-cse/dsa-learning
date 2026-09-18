import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class longest_substring_non_repeating_chars {
    public static int lengthOfLongestSubstring(String s) {
		int max = 0;
		int start = 0;
		int end = 0;
		int count = 0;
		List<Character> chars = new ArrayList<>();

		while(end<s.length())
		{
			if(!chars.contains(s.charAt(end)))
			{
				chars.add(s.charAt(end));
				count++;
				end++;
				if(max<count)
				{
					max = count;
				}
			}
			else
			{
				chars.remove(Character.valueOf(s.charAt(start)));
				count--;
				start++;
			}
		}
		return max;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int length = lengthOfLongestSubstring(str);
        System.out.println("Length of the longest substring without repeating characters: " + length);
        sc.close();
    }
}
