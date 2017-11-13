package week_001_radix;

public class SuperRadixManager {

    //radixSrc --> decimalism --> radixTgt
    String transform(String srcValue, int radixSrc, int radixTgt){
        int decimalismValue = getDecimalismValue(srcValue, radixSrc);
        if(decimalismValue == 0){
            return "0";
        }else if(decimalismValue > 0){ //positive number
            return getSpecificRadixValue(decimalismValue, radixTgt);
        }else{
            return "";
        }
    }

    int getDecimalismValue(String srcValue, int radixSrc){
        if(Integer.valueOf(srcValue) == 0){
            return 0;
        }
        int result = 0;
        char[] charArray = srcValue.toCharArray();
        int power = 0;
        for(int i=charArray.length-1; i>=0; i--){
            result += Integer.valueOf(String.valueOf(charArray[i]))*Math.pow(radixSrc, power++);
        }
        return result;
    }

    String getSpecificRadixValue(int srcValue, int radixTgt){
        String result = "";
        int reminder;
        for(int i=srcValue; i>0;){
            reminder = i%radixTgt;
            i = i/radixTgt;
            result = reminder+result;
        }
        return result;
    }
}

