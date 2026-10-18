public class GymStatus {

    public enum GymProgress { NOOB , GOOD , PRO }

        public static void main ( String[] args ){

            GymProgress me = GymProgress.GOOD;

            switch ( me ) {
                case NOOB:
                    System.out.println("you are a noob");
                    break;
                case GOOD:
                    System.out.println("you are good!");
                    break;
                case PRO:
                    System.out.println("you are a pro!!!");
                    break;
                default:
                    System.out.println("gym status unknown");
                    break;
            }
        }
}
