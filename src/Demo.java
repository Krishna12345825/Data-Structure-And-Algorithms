import java.util.*;

class Demo {
    public static void main(String[] args) {
       String s = "mississippi";
      String s1 = removeDuplicates(s);
        System.out.println(s1);
    }
    static String removeDuplicates(String s){
        HashSet<Character> set = new HashSet<>();
//        StringBuilder result = new StringBuilder();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.add(ch)){
              result = result + ch;
            }
        }
        return result;
    }


}

/*
    weak hash map
        identity hash map
        hash table
        object class method
garbej collector :- when they is no referance for a object
        using new keywork string and without new keyword and how many objects created*/
