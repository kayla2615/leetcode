class Solution {
    public boolean isPalindrome(String s) {
         if (s.isEmpty()) {
        	return true;
        }
        
        boolean run = true;
        int beg = 0;
        int end = s.length() - 1;
        while(beg <= end)
        {
            if(!Character.isLetterOrDigit(s.charAt(beg)))
            {
                beg++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(end)))
            {
                end--;
            }
            else 
            {
                if(Character.toLowerCase(s.charAt(beg)) != Character.toLowerCase(s.charAt(end)))
                {
                    return false;
                }
                beg++;
                end--;
            }
        }
        return true;
    }
}