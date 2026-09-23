import java.util.Stack;

public class VerificaParenteses {

    public boolean verifica(String frase){
    Stack<Character> s = new Stack<>();
    char [] myArray= frase.toCharArray();
    for (int i = 0; i < myArray.length; i++) {
        if (myArray[i]== '(') {
            s.push(myArray[i]);
        } else if (myArray[i] == ')') {
            if (!s.isEmpty()) {
                s.pop();
            } else {
                return false;
            }
        }
        
    }
        if(s.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        VerificaParenteses v = new VerificaParenteses();
        System.out.println(v.verifica("(al(c))*j"));
        System.out.println(v.verifica("(ab))a()*"));
        System.out.println(v.verifica("ab(d)()c"));
    }

}
