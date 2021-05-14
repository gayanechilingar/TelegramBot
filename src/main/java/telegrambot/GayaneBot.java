package telegrambot;

import lombok.SneakyThrows;
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

        long chat_id = update.getMessage().getChatId();
        String message = update.getMessage().getText();
        if (update.getMessage().getLocation() != null) {
            String longitude = update.getMessage().getLocation().getLongitude().toString();
            String latitude = update.getMessage().getLocation().getLatitude().toString();
        }  
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

