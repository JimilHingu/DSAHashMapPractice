package TridLearning;

public class TridFromScerach{
    static class Node{
        Node[] children;
        boolean eow;
        public Node(){
            children = new Node[26];
            for(int i=0;i<children.length;i++){
                children[i]=null;
            }
            eow =false;
        }
    }
    static Node root = new Node();
    public static void insert(String word){
        for(int i =0;i<word.length();i++){
            int idx = word.charAt(i)-'a';
            if(root.children[idx]==null){
                root.children[idx] =new Node();
            }
            if(i==word.length()-1){
                root.children[idx].eow=true;
            }
            root = root.children[idx];
        } 
    }
    public static boolean search(String key){
        for(int i =0;i<key.length();i++){
            int idx = key.charAt(i)-'a';
            if(root.children[idx] == null){
                return false;
            }
            if(i==key.length()-1&& root.children[idx].eow==false){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String words[] ={"the","a","there","their","any"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
    }
}