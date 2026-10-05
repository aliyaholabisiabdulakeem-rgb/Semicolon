import java.util.Scanner;

public class MenuList2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean mainRunning = true;

        while(mainRunning) {
            System.out.println();
            System.out.println("--- MAIN MENU ---");
            System.out.println("1. Phone book");
            System.out.println("2. Messages");
            System.out.println("3. Chat");
            System.out.println("4. Call register");
            System.out.println("5. Tones");
            System.out.println("6. Settings");
            System.out.println("7. Call divert");
            System.out.println("8. Games");
            System.out.println("9. Calculator");
            System.out.println("10. Reminders");
            System.out.println("11. Clock");
            System.out.println("12. Profiles");
            System.out.println("13. WAP Services");
            System.out.println("14. SIM Services");
            System.out.println("0. Exit");
            System.out.print("Enter: ");
            int mainChoice = input.nextInt();

            if(mainChoice == 0) {
                mainRunning = false;
            }

            // 1. PHONE BOOK
            if(mainChoice == 1) {
                boolean phoneRunning = true;
                while(phoneRunning) {
                    System.out.println();
                    System.out.println("--- PHONE BOOK ---");
                    System.out.println("1 Search");
                    System.out.println("2 Service Nos");
                    System.out.println("3 Add name");
                    System.out.println("4 Erase");
                    System.out.println("5 Edit");
                    System.out.println("6 Assign tone");
                    System.out.println("7 Send b'card");
                    System.out.println("8 Options");
                    System.out.println("9 Speed dials");
                    System.out.println("10 Voice tags");
                    System.out.println("0 Back");
                    System.out.print("Enter: ");
                    int c = input.nextInt();
                    if(c == 0) { phoneRunning = false; }
                    if(c == 1) { System.out.println("Search"); }
                    if(c == 2) { System.out.println("Service Nos"); }
                    if(c == 3) { System.out.println("Add name"); }
                    if(c == 4) { System.out.println("Erase"); }
                    if(c == 5) { System.out.println("Edit"); }
                    if(c == 6) { System.out.println("Assign tone"); }
                    if(c == 7) { System.out.println("Send b'card"); }
                    if(c == 8) {
                        boolean optRunning = true;
                        while(optRunning) {
                            System.out.println("--- OPTIONS ---");
                            System.out.println("1 Type of view");
                            System.out.println("2 Memory status");
                            System.out.println("0 Back");
                            int oc = input.nextInt();
                            if(oc == 0) { optRunning = false; }
                            if(oc == 1) { System.out.println("Type of view"); }
                            if(oc == 2) { System.out.println("Memory status"); }
                        }
                    }
                    if(c == 9) { System.out.println("Speed dials"); }
                    if(c == 10) { System.out.println("Voice tags"); }
                }
            }

            // 2. MESSAGES
            if(mainChoice == 2) {
                boolean msgRunning = true;
                while(msgRunning) {
                    System.out.println();
                    System.out.println("--- MESSAGES ---");
                    System.out.println("1 Write messages");
                    System.out.println("2 Inbox");
                    System.out.println("3 Outbox");
                    System.out.println("4 Picture messages");
                    System.out.println("5 Templates");
                    System.out.println("6 Smileys");
                    System.out.println("7 Message settings");
                    System.out.println("8 Info service");
                    System.out.println("9 Voice mailbox number");
                    System.out.println("10 Service command editor");
                    System.out.println("0 Back");
                    int c = input.nextInt();
                    if(c == 0) { msgRunning = false; }
                    if(c == 7) {
                        boolean setRunning = true;
                        while(setRunning) {
                            System.out.println("--- MESSAGE SETTINGS ---");
                            System.out.println("1 Set 1");
                            System.out.println("2 Common");
                            System.out.println("0 Back");
                            int sc = input.nextInt();
                            if(sc == 0) { setRunning = false; }
                            if(sc == 1) {
                                boolean set1Running = true;
                                while(set1Running) {
                                    System.out.println("1 Message centre number");
                                    System.out.println("2 Messages validity");
                                    System.out.println("3 Message type");
                                    System.out.println("0 Back");
                                    int s1 = input.nextInt();
                                    if(s1 == 0) { set1Running = false; }
                                }
                            }
                            if(sc == 2) {
                                boolean commonRunning = true;
                                while(commonRunning) {
                                    System.out.println("1 Delivery reports");
                                    System.out.println("2 Reply via same centre");
                                    System.out.println("3 Character support");
                                    System.out.println("0 Back");
                                    int cm = input.nextInt();
                                    if(cm == 0) { commonRunning = false; }
                                }
                            }
                        }
                    }
                }
            }

            // 3. CHAT
            if(mainChoice == 3) {
                boolean chatRunning = true;
                while(chatRunning) {
                    System.out.println("--- CHAT ---");
                    System.out.println("Chat - Press 0 to go Back");
                    int c = input.nextInt();
                    if(c == 0) { chatRunning = false; }
                }
            }

            // 4. CALL REGISTER - NOW WITH SUBMENUS INSIDE
            if(mainChoice == 4) {
                boolean callRunning = true;
                while(callRunning) {
                    System.out.println();
                    System.out.println("--- CALL REGISTER ---");
                    System.out.println("1 Missed calls");
                    System.out.println("2 Received calls");
                    System.out.println("3 Dialled numbers");
                    System.out.println("4 Erase recent call lists");
                    System.out.println("5 Show call duration");
                    System.out.println("6 Show call costs");
                    System.out.println("7 Call cost settings");
                    System.out.println("8 Prepaid credit");
                    System.out.println("0 Back");
                    int c = input.nextInt();
                    if(c == 0) { callRunning = false; }
                    if(c == 5) {
                        boolean durRunning = true;
                        while(durRunning) {
                            System.out.println("1 Last call duration");
                            System.out.println("2 All calls duration");
                            System.out.println("3 Received calls duration");
                            System.out.println("4 Dialled calls duration");
                            System.out.println("5 Clear timers");
                            System.out.println("0 Back");
                            int dc = input.nextInt();
                            if(dc == 0) { durRunning = false; }
                        }
                    }
                    if(c == 6) {
                        boolean costRunning = true;
                        while(costRunning) {
                            System.out.println("1 Last call cost");
                            System.out.println("2 All calls cost");
                            System.out.println("3 Clear counters");
                            System.out.println("0 Back");
                            int cc = input.nextInt();
                            if(cc == 0) { costRunning = false; }
                        }
                    }
                }
            }

            // 5. TONES - NOW WITH SUBMENUS INSIDE
            if(mainChoice == 5) {
                boolean tonesRunning = true;
                while(tonesRunning) {
                    System.out.println();
                    System.out.println("--- TONES ---");
                    System.out.println("1 Ringing tone");
                    System.out.println("2 Ringing volume");
                    System.out.println("3 Incoming call alert");
                    System.out.println("4 Composer");
                    System.out.println("5 Message alert tone");
                    System.out.println("6 Keypad tones");
                    System.out.println("7 Warning and game tones");
                    System.out.println("8 Vibrating alert");
                    System.out.println("9 Screen saver");
                    System.out.println("0 Back");
                    int c = input.nextInt();
                    if(c == 0) { tonesRunning = false; }
                }
            }

            // 6. SETTINGS - NOW WITH SUBMENUS INSIDE
            if(mainChoice == 6) {
                boolean settingsRunning = true;
                while(settingsRunning) {
                    System.out.println();
                    System.out.println("--- SETTINGS ---");
                    System.out.println("1 Call settings");
                    System.out.println("2 Phone settings");
                    System.out.println("3 Security settings");
                    System.out.println("4 Restore factory settings");
                    System.out.println("0 Back");
                    int c = input.nextInt();
                    if(c == 0) { settingsRunning = false; }
                    if(c == 1) {
                        boolean callSetRunning = true;
                        while(callSetRunning) {
                            System.out.println("1 Automatic redial");
                            System.out.println("2 Speed dialling");
                            System.out.println("3 Call waiting options");
                            System.out.println("4 Own number sending");
                            System.out.println("5 Phone line in use");
                            System.out.println("6 Automatic answer");
                            System.out.println("0 Back");
                            int csc = input.nextInt();
                            if(csc == 0) { callSetRunning = false; }
                        }
                    }
                }
            }

            // 7. CALL DIVERT
            if(mainChoice == 7) {
                boolean divertRunning = true;
                while(divertRunning) {
                    System.out.println();
                    System.out.println("--- CALL DIVERT ---");
                    System.out.println("1 Divert all voice calls");
                    System.out.println("2 Divert if busy");
                    System.out.println("3 Divert if not answered");
                    System.out.println("4 Divert if out of reach");
                    System.out.println("5 Cancel all diverts");
                    System.out.println("0 Back");
                    int c = input.nextInt();
                    if(c == 0) { divertRunning = false; }
                }
            }

            if(mainChoice == 8) { System.out.println("Games - Snake II, Space impact, Bantumi, Pairs II"); }
            if(mainChoice == 9) { System.out.println("Calculator"); }
            if(mainChoice == 10) { System.out.println("Reminders"); }

            // 11. CLOCK
            if(mainChoice == 11) {
                boolean clockRunning = true;
                while(clockRunning) {
                    System.out.println();
                    System.out.println("--- CLOCK ---");
                    System.out.println("1 Alarm clock");
                    System.out.println("2 Clock settings");
                    System.out.println("3 Date setting");
                    System.out.println("4 Stopwatch");
                    System.out.println("5 Countdown timer");
                    System.out.println("6 Auto update of date and time");
                    System.out.println("0 Back");
                    int c = input.nextInt();
                    if(c == 0) { clockRunning = false; }
                }
            }

            if(mainChoice == 12) { System.out.println("Profiles"); }
            if(mainChoice == 13) { System.out.println("WAP Services"); }
            if(mainChoice == 14) { System.out.println("SIM Services"); }
        }
        input.close();
    }
}

