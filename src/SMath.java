public class SMath {
    public static double pow(double a,double b) {
        double result=1;
        // double partResult=0;
        //TODO for middle section might need modification
        
        if (b==0) {
            return 1;
        }
        else if (b==1) {
            return a;
        }
        else{
            for (int i=0; i<b; i++){
            //TODO formula needs work a**1 works like shit
            // System.out.println(i);//testing +-1 value//cycle is good, the formula is trash
            // partResult=(a*a);

            result*=(a);
            // System.out.println(result);
            }
            return result;
            // return 0;//only for test
        }
    }
}
