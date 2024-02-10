public class Deneme14 {
        public static void main(String[] args) {
            int[] birdTypes = new int[6];
            int[] givenBirdTypesCount = {5,5,5,5,1,1,1,3,3,3};
            Deneme14 birds = new Deneme14();
            int minorBirdType = birds.findMinorBirdType(birdTypes, givenBirdTypesCount);
            System.out.println("en çok tekrar eden tür : " + minorBirdType);
        }
        public int findMinorBirdType(int [] birdTypes, int [] givenBirdTypesCount) {
            int max = 0;
            for(int birdType : givenBirdTypesCount) {
                birdTypes[birdType]++;
                if(birdTypes[birdType]> max) {
                    max = birdTypes[birdType];
                }
// max = Math.max(max, birdTypes[birdType]);
            }
            for(int i=0; i<birdTypes.length; i++) {
                if(birdTypes[i] == max) {
                    return i;
                }
            }
            return -1;
        }
}

