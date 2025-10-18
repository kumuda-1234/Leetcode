class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
          char[] a=new char[26];
          for(int i=0;i<s.length();i++)
          {
            a[s.charAt(i)-97]++;
          }
          for(int i=0;i<t.length();i++)
          {
            a[t.charAt(i)-97]--;
          }
          for(int i=0;i<26;i++)
          {
            if(a[i]!=0)
            return false;
          }
          return true;

    }
}