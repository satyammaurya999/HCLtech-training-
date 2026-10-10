import java.util.*;

public class Fr6 {
    public static void main(String[] args) {

        //stack implementation
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println(st);
        st.pop();
        st.pop();
        System.out.println(st);

    }
}
