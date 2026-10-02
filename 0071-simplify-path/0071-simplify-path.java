class Solution {
    public String simplifyPath(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        int i = 0;

        while(i<n){
            char c  = s.charAt(i);
            if(c=='/'){
                if(!st.isEmpty() && st.peek()=='/'){
                    i++;
                    continue;
                }
                st.push('/');
                i++;
                continue;
            }

            int start = i;
            while(i<n&&s.charAt(i)!='/'){
                i++;
            }
            String part = s.substring(start,i);
            if(part.equals("..")){
                if(!st.isEmpty()&&st.peek()=='/'){
                    st.pop();
                }
                while(!st.isEmpty()&&st.peek()!='/'){
                    st.pop();
                }
            }else if(part.equals(".")){
                continue;
            }else{
                for(char ch : part.toCharArray()){
                    st.push(ch);
                }
            }
                
        }

        if (st.size() > 1 && st.peek() == '/') {
            st.pop();
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        String res = sb.reverse().toString();
        return res.isEmpty()?"/":res;
    }
}