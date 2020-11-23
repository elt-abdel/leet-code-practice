/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

 

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
*/
public class defang {
    public static void main(String[] args) {

        String address = "255.100.50.0";
        System.out.println(defangIPaddr(address));

    }

    public static String defangIPaddr(String address) {
        
        String s = address.replace(".", "[.]");

        return s;
        
    }
}