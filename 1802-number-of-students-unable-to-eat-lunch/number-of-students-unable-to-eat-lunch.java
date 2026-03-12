class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        int n = sandwiches.length;
        int m = students.length;
        for(int i=n-1;i>=0;i--){
            st.push(sandwiches[i]);
        }
        for(int i=0;i<m;i++){
            q.add(students[i]);
        }
        int count =0;
        while(!st.isEmpty()){
            if(st.isEmpty() && q.isEmpty()) return 0;
            else if(st.peek().equals(q.peek())){
                st.pop();
                q.poll();
                count =0;
            }
            else{
                q.add(q.poll());
                count++;
                if(count == st.size()){
                    return count;
                }
            }
        }
        return q.size();
    }
}