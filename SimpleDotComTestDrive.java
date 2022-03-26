public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom test = new SimpleDotCom();
        int[] locations = {2,3,4};
        test.setLocationCells(locations);
        String userGuess = "2";
        String result = test.checkYourself(userGuess); 
    }
}
