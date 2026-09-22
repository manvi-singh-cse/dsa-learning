public class is_subsequence {
    public static String isSubsequence(String str1, String str2) {    
    	int j = 0;
		int i = 0;
		int n = str1.length();
		int m = str2.length();
		while(i<n && j<m)
		{
			if(str1.charAt(i) == str2.charAt(j))
			{
				i++;
				j++;
			}
			else
			{
				j++;
			}
		}
		if(n<m)
		{
			if(i == str1.length())
			{
				return "True";
			}
		}
		else if(m<n)
		{
			if(j == str2.length())
			{
				return "True";
			}
		}
		else if(m==n)
		{
			if(j == str2.length() && i == str1.length())
			{
				return "True";
			}
		}
		return "False";
	}

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ahbgdc";
        System.out.println(isSubsequence(str1, str2)); 
    }
}