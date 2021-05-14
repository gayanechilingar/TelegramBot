

import java.io.FileInputStream;
import java.util.Properties;

import lombok.SneakyThrows;

public class ReadProperties {
    @SneakyThrows
    public String getProp(String proper) {
       /// FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
        Properties prop = new Properties();
        prop.put("BOT.MASTER.NAME", "GayaneSpeaker_bot");
        prop.put("BOT.MASTER.TOKEN", "1898172709:AAHiTX6I8eRK37BouPTWyiKU4VyloJqY2SI");
        //prop.load(fis);
        return prop.getProperty(proper);
    }
}
