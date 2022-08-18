package com.company.udemy.Exercise4;

public class Thirty {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome("kiwii");
        System.out.println(palindrome.isPalindrome());
    }
}

class Palindrome{
    String content;

    public Palindrome(String content) {
        this.content = content;
    }
    boolean isPalindrome(){
        for(int i=0; i<content.length()/2; i++){
            if(this.content.charAt(i)!=this.content.charAt(content.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}