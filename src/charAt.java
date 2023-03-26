public class charAt {
    public static int count(String str,char c){
        int count =0;
        String newStr = str.toLowerCase();
        for (int i =0; i<newStr.length();i++){
            if(newStr.charAt(i)==c){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "codeGym C0223G1";
        int num = count(str,'g');
        System.out.println(num);
    }
}
