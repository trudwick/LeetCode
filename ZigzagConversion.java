public class ZigzagConversion {
   public static void main(String[] args){
      System.out.println(convert("PAYPALISHIRING",3));
      System.out.println(convert("PAYPALISHIRING",4));
   }
    public static String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder();
        if(numRows<2)
            return s;
        //row 0
        int ix=0;
        while(ix<s.length()){
            sb.append(s.charAt(ix));
            ix+=(numRows-1)*2;
        }
        //middle rows
        for(int z=1; z<numRows-1; z++){
            int ix1 = z;
            int ix2 = (numRows-1)*2-z;
            while(ix1<s.length()){
                sb.append(s.charAt(ix1));
                if(ix2<s.length())
                    sb.append(s.charAt(ix2));
                ix1+=(numRows-1)*2;
                ix2+=(numRows-1)*2;
            }
        }
        ix=numRows-1;
        while(ix<s.length()){
            sb.append(s.charAt(ix));
            ix+=(numRows-1)*2;
        }
        return sb.toString();
    }
}