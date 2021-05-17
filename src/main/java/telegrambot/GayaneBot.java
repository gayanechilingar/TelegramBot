package telegrambot;


import telegram.area.AreaFinding;
import java.awt.geom.Area;
import telegrambot.ReadProperties;
import telegram.weather.WeatherParsing;
import lombok.SneakyThrows;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Message;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import telegram.weather.WeatherParsing;

public class GayaneBot extends TelegramLongPollingBot {

    WeatherParsing Weather = new WeatherParsing();

    ReadProperties prop = new ReadProperties();

    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {

        System.out.println(update.getMessage().getText());

        Long chat_id = update.getMessage().getChatId();
        String message = update.getMessage().getText();
        sendMsg("bot answer is " + message, chat_id );
//        if (update.getMessage().getLocation() = null) {
//            System.out.println("update.getMessage() "+update.getMessage());
//            String longitude = update.getMessage().getLocation().getLongitude().toString();
//            String latitude = update.getMessage().getLocation().getLatitude().toString();
//            String city = AreaFinding.getCity(longitude, latitude);
//            sendMsg("Вы находитесь в городе "  +
//                    "\nПогода в городе "  + " равна " + "℃" +
//                    "\nКоличество заболевших в стране " + "NONE" + " за сегодня " + "NONE" + " человек" +
//                    "\nВалюта: " + "NONE", chat_id);
//        }  
    }
    
    
    @SneakyThrows
    public synchronized void sendMsg(String s, Long chat_id) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chat_id + "print chat id");
        sendMessage.setText(s);
        sendMessage.setReplyMarkup(null);
        execute(sendMessage);
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

