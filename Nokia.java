import java.util.Scanner;

public class Nokia{
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        String prompt = """
                1. Phone book
                2. Messages
                3. Chat
                4. Call register
                5. Tones
                6. Settings
                7. Call Divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. SIM Services
                """;
        System.out.println(prompt);
        int menuChoice = inputCollector.nextInt();

        switch(menuChoice) {
            case 1 -> System.out.println("Phone book");
            case 2 -> {
                System.out.println("Messages");
                String msgPrompt = """
                        1 Write messages
                        2 Inbox
                        3 Outbox
                        4 Picture messages
                        5 Templates
                        6 Smileys
                        7 Message settings
                        8 Info service
                        9 Voice mailbox number
                        10 Service command editor
                        """;
                System.out.println(msgPrompt);
                int msgChoice = inputCollector.nextInt();
                switch(msgChoice) {
                    case 1 -> System.out.println("Write messages");
                    case 2 -> System.out.println("Inbox");
                    case 7 -> {
                        String setPrompt = """
                                1 Set 1
                                2 Common
                                """;
                        System.out.println(setPrompt);
                        int setchoice = inputCollector.nextInt();
                        switch(setchoice) {
                            case 1 -> {
                                String set1Prompt = """
                                        1 Message centre number
                                        2 Messages sent as
                                        3 Message validity
                                        """;
                                System.out.println(set1Prompt);
                                int set1choice = inputCollector.nextInt();
                                switch(set1choice) {
                                    case 1 -> System.out.println("Message centre number");
                                    case 2 -> System.out.println("Messages sent as");
                                    case 3 -> System.out.println("Message validity");
                                }
                            }
                            case 2 -> {
                                String commonPrompt = """
                                        1 Delivery reports
                                        2 Reply via same centre
                                        3 Character support
                                        """;
                                System.out.println(commonPrompt);
                                int commonchoice = inputCollector.nextInt();
                                switch(commonchoice) {
                                    case 1 -> System.out.println("Delivery reports");
                                    case 2 -> System.out.println("Reply via same centre");
                                    case 3 -> System.out.println("Character support");
                                }
                            }
                        }
                    }
                    case 8 -> System.out.println("Chat");
                }
            }
            case 3 -> System.out.println("Chat");
        }
    }
}
