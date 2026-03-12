class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Queue <Integer>  q1 = new LinkedList<>();
        Queue <Integer>  q2 = new LinkedList<>();
        for(int i=0;i<pushed.length;i++){
            q1.add(pushed[i]);
            q2.add(popped[i]);
        }
        Stack<Integer> st = new Stack<>();
        int j = 0;
        while(!q1.isEmpty()){
            st.push(q1.peek());     
            while(!st.isEmpty() && st.peek().equals(q2.peek())){
                    st.pop();
                    q2.poll();
                    j++;
            }
            System.out.println(j);
            q1.poll();
        }
        return j == pushed.length;
    }
}