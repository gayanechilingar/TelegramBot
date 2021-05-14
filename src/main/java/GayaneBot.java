
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;
//import org.telegram.telegrambots.extensions.bots.commandbot.commands.CommandRegistry;
//import org.telegram.telegrambots.extensions.bots.commandbot.commands.ICommandRegistry;

public class GayaneBot extends TelegramLongPollingBot {

    public void onUpdateReceived(Update update) {

        System.out.println(update.getMessage().getText());
        
//        long chat_id = update.getMessage().getChatId();
//        String message = update.getMessage().getText();
//
//        if (update.getMessage().getLocation() != null){
//            String longitude = update.getMessage().getLocation().getLongitude().toString();
//            String latitude = update.getMessage().getLocation().getLatitude().toString();
//            String city = Area.getCity(longitude, latitude);
//            String country = Area.getCountry(longitude, latitude);
//            sendMsg("Вы находитесь в городе " + city +
//                    "\nПогода в городе " + city + " равна " + Weather.getTemperatureCelsium(city) + "℃" +
//                    "\nКоличество заболевших в стране " + "NONE" + " за сегодня " + "NONE" + " человек" +
//                    "\nВалюта: " + "NONE", chat_id);
//        }
//        if (update.hasMessage()) {
//            Message message = update.getMessage();
////            if (message.isCommand() && !filter(message)) {
////                
////                System.out.println(update.equals("123"));
////                if (!commandRegistry.executeCommand(this, message)) {
////                    //we have received a not registered command, handle it as invalid
////                    processInvalidCommandUpdate(update);
////                }
////                return;
////            }
//        }
//        processNonCommandUpdate(update);

    }

    public String getBotUsername() {
        return "GayaneSpeaker_bot";
    }

    public String getBotToken() {
        return "1898172709:AAHiTX6I8eRK37BouPTWyiKU4VyloJqY2SI";
    }

    protected boolean filter(Message message) {
        return false;
    }
}
