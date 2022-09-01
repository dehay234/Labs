public class LNums {
    private long lukeNum;
    private long num;

    /**
     * Constructor for class LNums
     * @param newLNum Lucas Number to set for object
     * @param newNum  ¹ of this Lucas Number
     */
    LNums(long newLNum, long newNum){
        lukeNum=newLNum;
        num=newNum;
    }


    /**
     * Method that fills array with Lucas Numbers
     * @param arr Array of LNums
     */
    static void setArr( LNums[] arr){

        arr[0]=new LNums(2,1);

        if(arr.length>=2) {
            arr[1]=new LNums(1,2);

            for (int i = 2; i < arr.length; i++) {
                arr[i] =new LNums( arr[i - 1].lukeNum + arr[i - 2].lukeNum, i + 1);

            }
        }
    }

    /**
     * Method that searching Lucas Numbers that satisfy condition w^3-1
     * @param arr Array of Lucas Numbers
     */
    static void search(LNums[] arr){
        for(int i = 0; i < arr.length; i++){
            double buf= (double) arr[i].lukeNum;

            buf = Math.pow(buf+1,1.0/3);

            if(Math.floor(buf) == buf){
                System.out.println("Number "+arr[i].lukeNum+" = " + (int)buf+"^3 - 1" );
            }

        }
    }

    /**
     * Get method
     * @return Returns Lucas Number of object
     */
    public long getLukeNum() {
        return lukeNum;
    }

    /**
     * Get method
     * @return returns Number of Lucas Num
     */
    public long getNum() {
        return num;
    }
}
