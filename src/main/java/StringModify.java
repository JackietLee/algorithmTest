public class StringModify {
    public static String replaceSpace(StringBuffer str) {
        int len = str.length();
        for(int index=0;index<str.length();index++){
            if(' ' == str.charAt(index)){
                len +=2;
            }
        }
        StringBuffer newStr= new StringBuffer();
        for(int index=0;index<str.length();index++){
            if(' ' == str.charAt(index)){
                newStr.append("%20");
            }else {
                newStr.append(str.charAt(index));
            }
        }
        return newStr.toString();
    }

    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("A B");
        String s = replaceSpace(str);
        System.out.println(s);
    }
}
