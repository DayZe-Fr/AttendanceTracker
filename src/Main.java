import dev.DayZe.View.GUI;
import dev.DayZe.tools;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static tools tools;


    // UI Components
    public static GUI mainGUI;

    // config Items
    public static String configFile;
    public static String[] configLines;
    public static Map<String, String> configArgs;



    public static void main(String[] args) {
        tools = new tools();
        //getting config file
        Map<String, String> configArgs = new HashMap<String, String>();
        try {
            configFile = Files.readString(Path.of("src/dev/DayZe/View/Config.txt"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        configLines = configFile.split(";");

        for (String configLine : configLines) {
            String[] part = configLine.split("->");
            configArgs.put(part[0].trim(), part[1].trim());
        }

        tools.print(configArgs.get("width"));

        // will validate the input later.

        // ====================================











        mainGUI = new GUI(Integer.parseInt(configArgs.get("height")), Integer.parseInt(configArgs.get("width")));


    }
}