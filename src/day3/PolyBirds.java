package day3;

class Bird {
    public void sing() {
        System.out.println("Tweet Tweet Tweet");
    }
}

    class Robin extends Bird {
     public void sing() {
        System.out.println("Tweedeldee");

        }
    }

        class Pellican extends Bird {
            public void sing() {

                System.out.println("TicToc");
            }
        }


        public class PolyBirds {

            public static void main(String[] args) {

                Robin b = new Robin();
                b.sing();

            }
        }




