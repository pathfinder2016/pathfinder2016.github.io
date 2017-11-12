package week_001;

public class RadixManager {

    //Convert decimalism to binary
    public String convertDeciToBinary(int value){
        String result = "";
        int reminder;
        if(value > 0){
            for(int i=value; i>0;){
                reminder = i%2;
                i = i/2;
                result = reminder+result;
            }
        }else{
            for(int i=value; i<0;){
                reminder = i%2;
                i = i/2;
                result = reminder+result;
            }
            result = getComplement(result); //get the complement of the value
        }
        return result;
    }

    private String getComplement(String value){
        char[] strArray = getRadixMinus(value).toCharArray();
        return addOneAtLastPlace(strArray);
    }

    private String addOneAtLastPlace(char[] strArray) {
        boolean carryBit = false;
        String result = "";
        int temp = Integer.valueOf(String.valueOf(strArray[strArray.length-1])) + 1;
        for(int i=strArray.length-1;i>0; i-- ){
            if(carryBit){
                temp++;
                carryBit = false;
            }
            if(temp == 2){
                temp = 0;
                carryBit = true;
            }
            result = temp + result;
            temp = Integer.valueOf(String.valueOf(strArray[i-1]));
        }
        return 1+result;
    }

    private String getRadixMinus(String value) {
        char[] strArray = value.toCharArray();
        value = 1+value.substring(1);
        String result = "";
        for(int i=strArray.length-1; i>0; i--){
            if (String.valueOf(value.charAt(i)).equals("0")) {
                result = 1+result;
            }else{
                result = 0+result;
            }
        }
        return 1+result;
    }


}
