public class Main {
    //זה הקוד של רימון, שכחתי לשנות את שם הפרוייקט
    public static void main(String[] args) {
        int num = 45; // מספר לבדיקה
        boolean isKaprekar = isKaprekar(num);

        // הצגת התוצאה
        System.out.println("Is " + num + " a Kaprekar number? " + isKaprekar);
    }

    // פעולה לבדיקת מספר קפרקר
    public static boolean isKaprekar(int num) {
        String theNum = "";
        theNum += num;
        int helper = (int)Math.pow(10,(theNum.length()/2));
        int numPow = num*num;
        if (numPow/helper + numPow%helper == num)
            return true;
        else
            return false;
    }
}