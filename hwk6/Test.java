public class Test {
    public static void main(String[] args){
        Time clock = new Time(23, 59, 58);
        Time watch = new Time(14, 12, 32);
        Time pocketWatch = new Time(18, 23, 44);

        clock.printTime();
        clock.tick();
        clock.printTime();
        clock.tick();
        clock.printTime();
        clock.tick();
        clock.printTime();

        for(int i = 0; i < 3; i++){
            watch.tick();
            watch.printTime();
        }

        for(int j = 0; j < 16; j++){
            pocketWatch.tick();
        }
            pocketWatch.printTime();
    }
}
