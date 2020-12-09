class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==7)
        {
            return true;
        }
        int sum;
        while(true)
        {
            sum=squares(n);
            if(n/10==0)
            {
                if(n==1||n==7)
                    return true;
                else
                    return false;
            }

            n=sum;

        }

    }

    public int squares(int n)
    {
        int d;
        int sum=0;
        while(n>0)
        {
            d=n%10;

            sum+= d*d;

            n=n/10;

        }

        return sum;
    }
}