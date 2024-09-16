package phoneInterface;

import phoneBehaviour.Call;
import phoneBehaviour.Contact;
import phoneBehaviour.Message;

public abstract class Phone {

    private static int initialbatteryLife = 15;
    int batteryLife = initialbatteryLife;
    private String model, manufacturer, imei;

    private Contact[] contactList = new Contact[99];
    private Call[] callList = new Call[99];
    private Message[] messageList = new Message[99];

    public Phone(String imei) {
        this.imei = imei;
    }

    public int getBatteryLife() {
        return this.batteryLife;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public void addContact(Contact contact) {
        for (int i = 0; i < contactList.length; i++) {
            if (contactList[i] == null) {
                contactList[i] = contact;
                break;
            }
        }
    }

    public void listContacts() {
        for (Contact contact : contactList) {
            if (contact != null) {
                System.out.println(contact.toString());
            }
        }
    }

    public void checkMessage(String messageBody) {

        char[] check = new char[messageBody.length()];
        for (int i = 0; i < messageBody.length(); i++) {
            check[i] = messageBody.charAt(i);
            //     System.out.println(messageBody.length());
            if (messageBody.length() < 500) {
                System.out.println("Message length under 500 characters");
                break;
            } else {
                System.out.println("Length exceeding 500 characters. Message  cannot be sent and it won't be stored.");
                break;
            }
        }
    }

    public void sendMessage(Message message) {
        checkMessage(message.getMessageBody());
        if ((message.getMessageBody().length() < 500)) {
            for (int i = 0; i < messageList.length; i++) {
                if (messageList[i] == null) {
                    messageList[i] = message;
                    System.out.println("Message sent to  " + message.getPhoneNumber());
                    batteryLife -= 1;
                    break;
                }
            }
        }
    }

    public void listMessages(String phoneNumber) {
        for (Message message : messageList) {
            if (message != null) {
                System.out.println(phoneNumber + message.toString());
            }
        }
    }

    public void call(Call call) {
        for (int i = 0; i < callList.length; i++) {
            if (callList[i] == null) {
                System.out.println("Calling  " + call);
                callList[i] = call;
                batteryLife -= 2;
                break;
            }
        }
    }

    public void viewHistory() {
        for (Call call : callList) {
            if (call != null) {
                System.out.println(call.toString() + " called.");
            }
        }
    }
}
