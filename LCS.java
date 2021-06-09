public class HelloWorld{

     public static void main(String []args){

        String input1= "abacabfg";
        String input2 = "bacfg";
        int max=0;

        int m[][] = new int[input1.length()+1][input2.length()+1];

        for(int i=1;i<=input1.length();i++)
        {
            for(int j=1;j<=input2.length();j++)
            {

                if(input1.charAt(i-1) == input2.charAt(j-1))
                {
                    m[i][j]=m[i-1][j-1]+1;
                }
                else
                {
                    m[i][j]=Math.max(m[i][j-1],m[i-1][j]);
                }

                if(m[i][j]>max)
                {
                    max=m[i][j];
                }


            }
        }

        System.out.println(max);

     }
}