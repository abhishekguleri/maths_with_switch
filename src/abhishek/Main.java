package abhishek;
public class Main{
    public static void main(String[] args){
        int i=1;
        String color= "      @        @@@@@@   @     @  @@@@@@@@@@     \n" +
                      "     @ @        @    @  @     @      @          \n" +
                      "    @   @       @    @  @     @      @          \n" +
                      "   @@@@@@@      @@@@@   @@@@@@@      @          \n" +
                      "  @       @     @    @  @     @      @          \n" +
                      " @         @    @    @  @     @      @          \n"
                +     "@           @  @@@@@@   @     @  @@@@@@@@@@     \n\n\n";

for(i=0;i<=100;i++) {System.out.println("\033[1;30m" + color+"\033[1;31m" + color+"\033[1;32m" + color+"\033[1;33m" + color+"\033[1;34m" + color+"\033[1;35m" + color+"\033[1;36m" + color+"\033[1;37m" + color+"\033[1;38m" + color+"\033[1;39m" + color);
    }
     }
    }
