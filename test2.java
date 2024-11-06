import java.util.*;
class test2{
    public static void main(String[]args){
        String str1="29162";
        String str2="10524";
        String str3="";
        String str4="";
        for(int i=0;i<str1.length();i++){
            str3 =str3+str1.charAt(i);
            i++;
            if(i<str1.length()){
                break;
            }
            str3=str3+str2.charAt(i);
        }

        for(int j=0;j<str1.length();j++){
            str4 =str4+str2.charAt(j);
            j++;
            if(j<str2.length()){
                break;
            }
            str4 =str4+str1.charAt(j);
        }System.out.println(str1);
        System.out.println(str2);

    }
}