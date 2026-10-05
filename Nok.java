import java.util.Scanner;

public class Nok{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

String mainMenuprompt = """
======================= NOKIA 5510 =======================
                1. Phone book
                2. Messages
                3. Chat
                4. Call register
                5. Tones
                6. Settings
                7. Call Divert
                8. Music
                9. Games
                10. Calculator
                11. Reminders
                12. Clock
                13. Profiles
                14. WAP Services
                15. SIM Services
                """;
        System.out.println(mainMenuprompt);
        System.out.print("Enter main menu: ");
        int Phonebook = input.nextInt();

        switch(Phonebook) {
            case 1 -> {
                String Phonebookprompt = """
                        1 Search
                        2 Service Nos.
                        3 Add name
                        4 Erase
                        5 Edit
                        6 Assign tone
                        7 Send b'card
                        8 Options
                        9 Speed dials
                        10 Voice tags
                        """;
                System.out.println(Phonebookprompt);
                int phonebookoptions= input.nextInt();
                switch(phonebookoptions) {
                    case 1 -> System.out.println("Search");
                    case 2 -> System.out.println("Service Nos.");
                    case 3 -> System.out.println("Add name");
                    case 4 -> System.out.println("Erase");
                    case 5 -> System.out.println("Edit");
                    case 6 -> System.out.println("Assign tone");
                    case 7 -> System.out.println("Send b'card");
                    case 8 -> {
                        String optionprompt = """
                                1 Type of view
                                2 Memory status
                                """;
                        System.out.println(optionprompt);
                        int option = input.nextInt();
                        switch(option) {
                            case 1 -> System.out.println("Type of view");
                            case 2 -> System.out.println("Memory status");
                        }
                    }
                }
                    case 9 -> System.out.println("Speed dials");
                    case 10 -> System.out.println("Voice tags");
                }
            }
            case 2 -> {
                String Messageprompt = """
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
                System.out.println(Messageprompt);
                int messages = input.nextInt();
                switch(Messages) {
                    case 1 -> System.out.println("Write messages");
                    case 2 -> System.out.println("Inbox");
                    case 3 -> System.out.println("Outbox");
                    case 4 -> System.out.println("Picture messages");
                    case 5 -> System.out.println("Templates");
                    case 6 -> System.out.println("Smileys");
                    case 7 -> {
                        String Messagesettingsprompt = """
                                1 Set1
                                2 Common
                                """;
                        System.out.println(Messagesettingprompt);
                        int Set1 = input.nextInt();
                        switch(Set1) {
                            case 1 -> {
                                String set1prompt = """
                                        1 Message centre number
                                        2 Messages sent as
                                        3 Message validity
                                        """;
                                System.out.println(set 1prompt);
                                int set1 = input.nextInt();
                                switch(set1) {
                                    case 1 -> System.out.println("Message centre number");
                                    case 2 -> System.out.println("Messages sent as");
                                    case 3 -> System.out.println("Message validity");
                                }
                            }
                        }
                            case 2 -> {
                                String commonprompt = """
                                        1 Delivery reports
                                        2 Reply via same centre
                                        3 Character support
                                        """;
                                System.out.println(commonprompt);
                                int common = input.nextInt();
                                switch(common) {
                                    case 1 -> System.out.println("Delivery reports");
                                    case 2 -> System.out.println("Reply via same centre");
                                    case 3 -> System.out.println("Character support");
                                }
                            }
                        }
                    }
                    case 8 -> System.out.println("Info service");
                    case 9 -> System.out.println("Voice mailbox number");
                    case 10 -> System.out.println("Service command editor");
                }
            }
            int Chat = input.nextInt
            switch(Chat){
            case 3 -> System.out.println("Chat");
           }
            int Callregisterprompt = input.nextInt();
            switch(Callregisterprompt){
            case 4 -> {
            String Callregisterprompt = """
                        1 Missed calls
                        2 Received calls
                        3 Dialled numbers
                        4 Erase recent call lists
                        5 Show call duration
                        6 Show call costs
                        7 Call cost settings
                        8 Prepaid credit
                        """;
                System.out.println(Callregisterprompt);
                int Callregister = input.nextInt();
                switch(Callregister) {
                    case 1 -> System.out.println("Missed calls");
                    case 2 -> System.out.println("Received calls");
                    case 3 -> System.out.println("Dialed numbers");
                    case 4 -> System.out.println("Erase recent call lists");
                    
                        switch(Calldurationprompt){
                        case 5 -> {
                        String calldurationprompt = """
                                1 Last call duration
                                2 All calls duration
                                3 Received calls duration
                                4 Dialled calls duration
                                5 Clear timers
                                """;
                        System.out.println(Calldurationprompt);
                        int Callduration = input.nextInt();
                        switch(Callduration) {
                            case 1 -> System.out.println("Last call duration");
                            case 2 -> System.out.println("All calls duration");
                            case 3 -> System.out.println("Received calls duration");
                            case 4 -> System.out.println("Dialed calls duration");
                            case 5 -> System.out.println("Clear timers");
                        }
                    }
                   }
                }
                    case 6 -> {
                        String Callcostsprompt = """
                                1 Last call cost
                                2 All calls cost
                                3 Clear counters
                                """;
                        System.out.println(Callcostsprompt);
                        int Callcosts = input.nextInt();
                        switch(Callcosts) {
                            case 1 -> System.out.println("Last call cost");
                            case 2 -> System.out.println("All calls cost");
                            case 3 -> System.out.println("Clear counters");
                        }
                    }
                    case 7 -> {
                        String Callcostsettingsprompt = """
                                1 Call cost limit
                                2 Show costs in
                                """;
                        System.out.println(Callcostsettingsprompt);
                        int Callcostsettings = input.nextInt();
                        switch(Callcostsettings) {
                            case 1 -> System.out.println("Call cost limit");
                            case 2 -> System.out.println("Show costs in");
                        }
                    }
                    case 8 -> System.out.println("Prepaid credit");
                }
            }
            
                switch(Tonesprompt){
                case 5 -> {
                String Tonesprompt = """
                        1 Ringing tone
                        2 Ringing volume
                        3 Incoming call alert
                        4 Composer
                        5 Message alert tone
                        6 Keypad tones
                        7 Warning and game tones
                        8 Vibrating alert
                        9 Screen saver
                        """;
                System.out.println(Tonesprompt);
                int Tones= input.nextInt();
                switch(Tones) {
                    case 1 -> System.out.println("Ringing tone");
                    case 2 -> System.out.println("Ringing volume");
                    case 3 -> System.out.println("Incoming call alert");
                    case 4 -> System.out.println("Composer");
                    case 5 -> System.out.println("Message alert tone");
                    case 6 -> System.out.println("Keypad tones");
                    case 7 -> System.out.println("Warning and game tones");
                    case 8 -> System.out.println("Vibrating alert");
                    case 9 -> System.out.println("Screen saver");
                }
            }
        }
                int Settingsprompt = input.nextInt();
                switch(Settingsprompt){
                case 6 -> {
                String Settingsprompt = """
                        1 Call settings
                        2 Phone settings
                        3 Security settings
                        4 Restore factory settings
                        """;
                System.out.println(Settingsprompt);
                int Settings = input.nextInt();
                switch(Settings) {
                    case 1 -> {
                        String Callsettingsprompt = """
                                1 Automatic redial
                                2 Speed dialling
                                3 Call waiting options
                                4 Own number sending
                                5 Phone line in use
                                6 Automatic answer
                                """;
                        System.out.println(Callsettingsprompt);
                        int Callsettings = input.nextInt();
                        switch(Callsettings) {
                            case 1 -> System.out.println("Automatic redial");
                            case 2 -> System.out.println("Speed dialling");
                            case 3 -> System.out.println("Call waiting options");
                            case 4 -> System.out.println("Own number sending");
                            case 5 -> System.out.println("Phone line in use");
                            case 6 -> System.out.println("Automatic answer");
                        }
                    }
                }
                        int Phonesettingsprompt = input.nextInt();
                        switch(Phonesettingsprompt){
                        case 2 -> {
                        String Phonesettingsprompt = """
                                1 Language
                                2 Cell info display
                                3 Welcome note
                                4 Network selection
                                5 Lights
                                6 Confirm SIM service actions
                                """;
                        System.out.println(Phonesettingsprompt);
                        int Phonesettings = input.nextInt();
                        switch(Phonesettings) {
                            case 1 -> System.out.println("Language");
                            case 2 -> System.out.println("Cell info display");
                            case 3 -> System.out.println("Welcome note");
                            case 4 -> System.out.println("Network selection");
                            case 5 -> System.out.println("Lights");
                            case 6 -> System.out.println("Confirm SIM service actions");
                        }
                    }
                   }
                        int securitysettingsprompt = input.nextInt();
                        switch(Securitysettingsprompt){                                 
                        case 3 -> {
                        String Securitysettingsprompt = """
                                1 PIN code request
                                2 Call barring service
                                3 Fixed dialling
                                4 Closed user group
                                5 Phone security
                                6 Change access codes
                                """;
                        System.out.println(Securitysettingsprompt);
                        int Securitysettings = input.nextInt();
                        switch(Securitysettings) {
                            case 1 -> System.out.println("PIN code request");
                            case 2 -> System.out.println("Call barring service");
                            case 3 -> System.out.println("Fixed dialling");
                            case 4 -> System.out.println("Closed user group");
                            case 5 -> System.out.println("Phone security");
                            case 6 -> System.out.println("Change access codes");
                        }
                    }
                }
                    int Restorefactorysettings = input.nextint();
                    switch(Restorefactorysettings){
                    case 4 -> System.out.println("Restore factory settings");
                }
            }
           }
                int Calldivert = input.nextInt();
                switch(calldivert){
                case 7 -> System.out.println("Call divert");
                }
                int Musicprompt = input.nextInt();
                switch(Musicprompt){
                case 8 -> {
                String Musicprompt = """
                        1 Music player
                        2 Radio
                        3 Recorder
                        4 Track list
                        """;
                System.out.println(Musicprompt);
                int Music = input.nextInt();
                switch(Music) {
                    case 1 -> System.out.println("Music player - Listening to music");
                    case 2 -> System.out.println("Radio");
                    case 3 -> System.out.println("Recorder");
                    case 4 -> System.out.println("Track list");
                }
            }
           }
            int Games = input.nextInt();    
            switch(Games){
                case 9 -> System.out.println("Games");
            }
            int Calculator = input.nextInt();
            switch(Calculator){
                case 10 -> System.out.println("Calculator");
               }
            int Reminders = input.nextInt;
            switch(Reminders){
                case 11 -> System.out.println("Reminders");
               }
            int Clockprompt = input.nextInt;
            switch(Clockprompt){
                case 12 -> {
                String Clockprompt = """
                        1 Alarm clock
                        2 Clock settings
                        3 Date setting
                        4 Stopwatch
                        5 Countdown timer
                        6 Auto update of date and time
                        """;
                System.out.println(Clockprompt);
                int Clock = input.nextInt();
                switch(Clock) {
                    case 1 -> System.out.println("Alarm clock");
                    case 2 -> System.out.println("Clock settings");
                    case 3 -> System.out.println("Date setting");
                    case 4 -> System.out.println("Stopwatch");
                    case 5 -> System.out.println("Countdown timer");
                    case 6 -> System.out.println("Auto update of date and time");
                }
            }
           }
            int Profiles = input.nextInt();
            switch(Profiles){
                case 13 -> System.out.println("Profiles");
               }
            int Service = input.nextInt();
            switch(Service){
                case 14 -> System.out.println("Services");
               }
            int SIMservice = input.nextInt();
            switch(SIMservice){
                case 15 -> System.out.println("SIM Services");
               }
      }      
}
}
