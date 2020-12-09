class Solution {
    public boolean isValid(String s) {


        Stack<Character> stack = new Stack<Character>();


        HashMap<Character,Character> map = new HashMap<>();

        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        for(int i=0;i<s.length();i++)
        {

            char c = s.charAt(i);

            if(map.containsKey(c))
            {


                char topele = stack.isEmpty() ? '#' : stack.pop();

                if(topele != map.get(c))
                {
                    return false;
                }


            }
            else
            {
                stack.push(c);

            }



        }
        return stack.isEmpty();
    }
}