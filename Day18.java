public class Solution {
    Stack<String> s;
    Queue<String> theQ;
    // Write your code here.
    
    public Solution(){
        s = new Stack<>();
        theQ = new LinkedList<String>();
    }
    
    public void pushCharacter(char c){
        //System.out.println("Push: " + c);
        s.push(Character.toString(c));
    }
    
    public void enqueueCharacter(char c){  
        //System.out.println("Enqueue: " + c);
        theQ.add(Character.toString(c));
    }
    
    public char popCharacter(){
        String check = s.pop();
        //System.out.println("pop: " + check);
        return check.charAt(0);
    }
    
    public char dequeueCharacter(){
        String check = theQ.remove();
        //System.out.println("dequeue: " + check);
        return check.charAt(0);
    }