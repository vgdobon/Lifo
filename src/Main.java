public class Main {
        public static void main(String[] args) {
            Lifo miFifo = new Lifo();

            miFifo.push(0);
            System.out.println(miFifo.pop());
            miFifo.push(1);
            miFifo.push(2);
            miFifo.push(3);
            miFifo.push(4);
            miFifo.push(5);



            System.out.println(miFifo.pop());
            System.out.println(miFifo.pop());
            System.out.println(miFifo.pop());
            System.out.println(miFifo.pop());
            System.out.println(miFifo.pop());
            System.out.println(miFifo.pop());
        }
}
