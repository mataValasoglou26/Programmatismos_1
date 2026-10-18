package arrays;

public class CustomerPoll {

    public static void main(String[] args){

        int[] responses = { 1, 2, 5, 4, 3, 5, 2, 1, 3, 1, 3 ,4 ,5 ,3, 5 };

        int[] frequency = new int[6];

        for( int i = 0; i < responses.length; i++) {
            ++frequency[ responses[i] ];
        }

        for ( int rating = 1; rating < frequency.length; rating++){
            System.out.println("rating:" + rating + " " + "frequency: " + frequency[rating]);
        }
    }
}
