class PAlindrome {
    public boolean isPalindrome(int x) {
        int palindrome=x;
        int reverse=0;

        while(x>0){
            int remainder=x%10;
            reverse=reverse*10+remainder;
            x=x/10;
        }
        if(palindrome==reverse){
            return true;
        }
        return false;
    }
}